//import java.util.Scanner;
//
//public class Sikl {
//    static boolean tubMi(int n) {
//        if (n < 2) return false;
//
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Son kiriitng: ");
//        int son = sc.nextInt();
//        if (tubMi(son)) {
//            System.out.print(son + " - tub son");
//        } else {
//            System.out.print(son + " - tub emas");
//        }
//    }
//}

//public class Sikl {
//    static void main(String[] args) {
//        for (int i = 2; i <= 100; i++) {
//            boolean tubMi = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    tubMi = false;
//                    break;
//                }
//            }
//            if (tubMi) {
//                System.out.println(i);
//            }
//        }
//    }
//}

import java.util.Arrays;

public class Sikl {
    public static void main(String[] args) {
        String[] monthDays = {"Yanvar", "Fevral", "Mart", "Aprel", "May", "Iyun",
                "Iyul", "Avgust", "Sentabr", "Octabr", "Noyabr", "Dekabr"};
//        System.out.print("[ ");
//        for (int i = 0; i < monthDays.length; i++) {
//            if (i != monthDays.length - 1) {
//                System.out.print(monthDays[i] + ", ");
//            }else {
//                System.out.println(monthDays[i] + " ]");
//            }
//        }
//        String strings[] = new String[10];
//        strings[1] = "Yanvar";
//        strings[2] = "Fevral";
//        strings[3] = "Dekabr";
//        strings[4] = "Iyun";
//        strings[9] = "Mart";
//        long[] strings = new long[10];
//
//        System.out.print("[ ");
//        for (int i = 0; i < strings.length; i++) {
//            if (i != strings.length - 1) {
//                System.out.print(strings[i] + ", ");
//            } else {
//                System.out.print(strings[i] + " ]");
//            }
//        }

//        int ints[][];
//        ints = new int[2][3];
//        ints[0][0] = 1;
//        ints[0][1] = 2;
//        ints[0][2] = 3;
//        ints[1][0] = 4;
//        ints[1][1] = 5;
//        ints[1][2] = 6;
//        System.out.print(ints[0][0]);

        int[] numers = {2,4,8,6,2,10,6};
        int sum = 0;

        boolean hasOdd = false;
        for ( int numer : numers ) {
            if (numer % 2 == 1) {
                hasOdd = true;
                break;
            }
        }
        if (hasOdd) {
            for ( int i : numers ) {
                if (i % 2 == 1) {
                    break;
                }
                sum += i;
            }
        }else {
            for ( int i = 1; i < numers.length - 1; i++ ) {
                sum += numers[i];
            }
        }
        System.out.println(sum);
    }
}
