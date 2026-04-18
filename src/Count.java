import java.util.Scanner;

public class Count {
    static int xonali (int son) {
        if (son < 0) son = Math.abs(son);
        if (son == 0) return 1;

        int xonali = 0;
        while (son > 0) {
            son /= 10;
            xonali++;
        }
        return xonali;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int son = scanner.nextInt();
        System.out.println(son + " -> " + xonali(son) + " xonali");
    }

}
