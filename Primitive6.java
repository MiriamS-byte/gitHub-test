package Miriam_exercitii;

import java.util.Scanner;

public class Primitive6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti latura1: ");
        int a = scanner.nextInt();

        System.out.print("Introduceti latura2: ");
        int b = scanner.nextInt();

        int ariaDreptunghi = a * b;

        System.out.println("Aria dreptunghiului este: " + ariaDreptunghi);
    }
}
