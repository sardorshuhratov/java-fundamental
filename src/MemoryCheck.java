public class MemoryCheck {
    public static void main(String[] args) {
        // JVM obyektini olamiz
        Runtime runtime = Runtime.getRuntime();

        // Jami ajratilgan xotira
        long totalMemory = runtime.totalMemory();
        // Bo'sh turgan xotira
        long freeMemory = runtime.freeMemory();
        // Ishlatilayotgan xotira
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Jami xotira (Total): " + totalMemory / 1024 + " KB");
        System.out.println("Bo'sh xotira (Free): " + freeMemory / 1024 + " KB");
        System.out.println("Ishlatilayotgan xotira (Used): " + usedMemory / 1024 + " KB");

        // Keling, 10 000 ta obyekt yaratib ko'ramiz
        String[] massiv = new String[10000];
        for(int i = 0; i < 10000; i++) {
            massiv[i] = new String("Sardor" + i);
        }

        System.out.println("--- Obyektlar yaratilgandan keyin ---");
        System.out.println("Yangi ishlatilayotgan xotira: " + (runtime.totalMemory() - runtime.freeMemory()) / 1024 + " KB");
    }
}