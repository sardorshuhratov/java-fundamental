import java.util.Scanner;

public class Application {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, res;
        System.out.print("num1: ");
        num1 = scan.nextInt();

        System.out.print("num2: ");
        num2 = scan.nextInt();
        res = Calculator.add(num1,num2);
        System.out.println("Yigindisi: " + res);

        res = Calculator.sub(num1, num2);
        System.out.println("Ayirmasi: " + res);

        System.out.println("Kopaytmasi: " + Calculator.mult(num1, num2));
        System.out.println("Bolinmasi: " + Calculator.div(num1, num2));
    }
}
