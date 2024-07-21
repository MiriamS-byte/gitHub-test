package itFactory.sesiunea1_2.exercitii1_2;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {

        //Scrieți un program în care, folosind o bucla (stabiliti voi care)
        // o sa cititi de la tastatură numere întregi până la intalnirea unui
        // număr divizibil cu 7.

        Scanner scan = new Scanner(System.in);
        System.out.print("Introduceti numarul dorit: ");
        int a = scan.nextInt();


        while (a % 7 != 0) {

            System.out.print("Introduceti urmatorul numar ");
            a = scan.nextInt();

        }
        System.out.println("Ati intodus un numar divizibil cu 7 : " + a);
        scan.close();

    }
}
