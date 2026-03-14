// Kiritilgan 2 ta sonning absolyut farqi(kattasidan kichigining ayirmasi)ni aniqlovchi dastur tuzing.

import java.util.Scanner;

class AbsolyutFarqi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Son1: ");
        int son1 = sc.nextInt();

        System.out.print("Son2: ");
        int son2 = sc.nextInt();

        if (son1 > son2) {
            System.out.print("Ayrmas: " + (son1 - son2));
        } else {
            System.out.print("Ayrmasi: " + (son2 - son1));
        }
    }
}
