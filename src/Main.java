//public class Main {
//    public static void main(String[] args) {
//            System.out.println("     J      a    v      v    a");
//            System.out.println("     J     a a    v    v    a a");
//            System.out.println(" J   J    aaaaa    v  v    aaaaa");
//            System.out.println("  JJJ    a     a    v     a     a  \n");
//    }
//}

//import java.awt.*;
//import java.util.Scanner;
//
//public class Main {
//    public static void main (String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("\nIsmingizni kiriting ---> ");
//
//        String name = scanner.nextLine();
//
//        System.out.print("Assalomu alaykum " + name);
//
//    }
//}

//public class Main {
//    public static void main (String[] args) {
//        System.out.println("  + \"\"\"\"\"\"\"\" +");
//        System.out.println("  |          | ");
//        System.out.println("[ |  o   o   | ]");
//        System.out.println("  |    ^     |  ");
//        System.out.println("  |  ' _ '   |  ");
//        System.out.println("  |          |  ");
//        System.out.println("  + -------- +   ");
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main (String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("\nIsmingizni kiriting ---> ");
//        String name = scanner.nextLine();
//
//        System.out.print("Familyangizni kiriting ---> ");
//        String fam = scanner.nextLine();
//
//        System.out.print("\nAssalomu alaykum " + fam + " " + name);
//
//    }
//}

//public class Main {
//    public static void main (String[] args) {


import java.util.Scanner;

//        int a = 5, b = 8, c = 6;
//        int natija = (a+b+c) / 3;
//        System.out.println("Natija: " + natija);
//          int a = 5, b = 6, c = 8;
//          double s = (a + b + c ) / 3.0;
//          System.out.println("("+ a + "+"+ b + "+"+ c + ")/3=" + s);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double oneDollar = 12154.64;
//        System.out.print("\nQancha dollor olmoqchisz $: ");
//        int dollor = scanner.nextInt();
//        System.out.println("\n" + dollor + " $ = " + dollor * oneDollar + "so`m\n");
//
//    }
//}

//public class Main {
//    public static void main (String[] args) {
//        Scanner kavadrat = new Scanner(System.in);
//        System.out.print("\nKvadrat tomonini kiriting: ");
//        int s = kavadrat.nextInt();
//        System.out.println("Perimetri: P = " + 4 * s);
//        System.out.println("Yuzasi: S = " + 2 * s);
//    }
//}

//public class Main {
//    public static void main (String[] args) {
//        char a = 'A';
//        System.out.println("A = " + (int)a);
//        a = 'S';
//        System.out.println("S = " + (int)a);
//        a = 'H';
//        System.out.println((int)a);
//        a = 'd';
//        System.out.println((int)a);
//        a = 'Q';
//        System.out.println((int)a);
//        a = 'q';
//        System.out.println((int)a);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 5, b = 7;
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//    }
//}
//

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world^^");
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Vaqtni kiriting: ");        long t = scanner.nextLong();
//        long s = t / 3600;
//        long m = (t % 3600) / 60;
//        long sek = (t % 3600) % 60;
//        System.out.println(s + " : " + m + " : " + sek);
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int a = 15, b = 17;
//
//        a = a + b; // a = 32
//        b = a - b; // b = 15
//        a = a - b; // a = 17
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("a = ");
//        int a = scanner.nextInt();
//        System.out.print("b = ");
//        int b = scanner.nextInt();
//        int res = a + b;
//        int res2 = a | b;
//        int res3 = a & b;
//        int res4 = a ^ b;
//        boolean res5 = a > b;  // > chap tarafdagi qiymat o’ng tomondagi qiymatdan katta bo’lsa true qiymat qaytaradi.
//        boolean res6 = a < b;  // < chap tarafdagi qiymat o’ng tomondagi qiymatdan kichik bo’lsa true qiymat qaytaradi
//        boolean res7 = a == b; // == operatorning chap va o’ng tarafidagi qiymatlar teng bo’lsa true aks holda false qiymat qaytaradi
//        System.out.println(a + " + " + b + " = " + res);
//        System.out.println(a + " | " + b + " = " + res2);
//        System.out.println(a + " & " + b + " = " + res3);
//        System.out.println(a + " ^ " + b + " = " + res4);
//        System.out.println(a + " > " + b + " = " + res5);
//        System.out.println(a + " < " + b + " = " + res6);
//        System.out.println(a + " == " + b + " = " + res7);
//
//        System.out.println(5 % 3);
//
//    }

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Son kiriting: ");
        int son = scanner.nextInt();
        System.out.println(Math.abs(son));
    }
}