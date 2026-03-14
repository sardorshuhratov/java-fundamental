public class Calculator {
    public static int add(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int mult(int a, int b) {
        return a*b;
    }
    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Xato: nolga bo'lish mumkin emas!");
            return 0;
        }
        return a/b;
    }

}

