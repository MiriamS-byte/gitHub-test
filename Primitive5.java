package Miriam_exercitii;

import java.util.Scanner;

public class Primitive5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti latura1: ");
        int a = scanner.nextInt();

        System.out.print("Introduceti latura2: ");
        int b = scanner.nextInt();

        System.out.print("Introduceti latura3: ");
        int c = scanner.nextInt();

        int perimetruTriunghi = a + b + c;

        System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);
    }
}
