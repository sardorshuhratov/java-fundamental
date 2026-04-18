// 3 ta valyuta (Masalan, dollar, yevro va yuan) bo'yicha valyuta konvertori dasturini tuzing

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.HashMap;
import java.util.Map;

public class ValyutaKonvertor {

    // O'zbekiston Markaziy Banki API
    static final String CBU_API = "https://cbu.uz/uz/arkhiv-kursov-valyut/json/";

    static Map<String, Double> rates = new HashMap<>();
    static String lastUpdated = "";

    public void main(String[] args) throws Exception {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     VALYUTA KONVERTORI (Real-time)   ║");
        System.out.println("║     O'zbekiston Markaziy Banki       ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        // Kurslarni yuklash
        System.out.println("Kurslar yuklanmoqda...");
        fetchRates();

        // Har 60 soniyada yangilanadi
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    fetchRates();
                    System.out.println("\n[AUTO] Kurslar yangilandi: " + lastUpdated);
                    System.out.print("Valyuta kiring (USD/EUR/RUB/GBP) yoki 'chiq': ");
                } catch (Exception e) {
                    System.out.println("Yangilashda xato: " + e.getMessage());
                }
            }
        }, 60000, 60000);

        // Foydalanuvchi kiritishi
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====================================");
            System.out.println("Mavjud valyutalar: USD | EUR | RUB | GBP | JPY | CNY");
            System.out.print("Valyuta kiring (yoki 'chiq'): ");
            String currency = scanner.nextLine().trim().toUpperCase();

            if (currency.equals("CHIQ") || currency.equals("EXIT") || currency.equals("Q")) {
                System.out.println("\nDasturdan chiqildi. Xayr!");
                break;
            }

            if (!rates.containsKey(currency)) {
                System.out.println("❌ Bunday valyuta topilmadi! (USD, EUR, RUB, GBP, JPY, CNY kiriting)");
                continue;
            }

            System.out.print("Miqdorni kiring: ");
            String amountStr = scanner.nextLine().trim();

            try {
                double amount = Double.parseDouble(amountStr);
                double rate = rates.get(currency);
                double result = amount * rate;

                System.out.println("\n╔══════════════════════════════════════╗");
                System.out.printf("║  %.2f %s = %.2f UZS%n", amount, currency, result);
                System.out.printf("║  1 %s = %.2f UZS%n", currency, rate);
                System.out.printf("║  Sana: %s%n", lastUpdated);
                System.out.println("╚══════════════════════════════════════╝");

            } catch (NumberFormatException e) {
                System.out.println("❌ Noto'g'ri son kiritildi!");
            }
        }

        scanner.close();
        timer.cancel();
    }

    static void fetchRates() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(CBU_API))
                .header("User-Agent", "Java/CurrencyConverter")
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        // JSON ni qo'lda parse qilish (kutubxonasiz)
        String[] entries = json.split("\\},\\{");

        rates.clear();

        for (String entry : entries) {
            String code = extractValue(entry, "\"Ccy\":\"", "\"");
            String rateStr = extractValue(entry, "\"Rate\":\"", "\"");
            String date = extractValue(entry, "\"Date\":\"", "\"");

            if (code != null && rateStr != null) {
                try {
                    double rate = Double.parseDouble(rateStr);
                    rates.put(code, rate);
                    if (date != null && !date.isEmpty()) {
                        lastUpdated = date;
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        }

        System.out.println("✅ Kurslar muvaffaqiyatli yuklandi! Sana: " + lastUpdated);
        System.out.printf("   USD=%.2f | EUR=%.2f | RUB=%.4f | GBP=%.2f%n",
                rates.getOrDefault("USD", 0.0),
                rates.getOrDefault("EUR", 0.0),
                rates.getOrDefault("RUB", 0.0),
                rates.getOrDefault("GBP", 0.0));
    }

    static String extractValue(String text, String startKey, String endKey) {
        int start = text.indexOf(startKey);
        if (start == -1) return null;
        start += startKey.length();
        int end = text.indexOf(endKey, start);
        if (end == -1) return null;
        return text.substring(start, end);
    }
}
