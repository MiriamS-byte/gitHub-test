package itFactory.sesiunea1_2.exercitii1_2;

import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {

        //Scrieți un program în care creati o consola interactiva
        // prin care userul poate sa aleaga opțiuni de la 1 la 3.
        // La start-ul programului, va trebui să apară un mesaj cu
        // opțiunile posibile.
        //	a) Pentru opțiunea 1, userul va trebui sa introducă un
        //	număr de la 1 la 10. Dacă numărul nu este în acest interval
        //	se va afișa un mesaj de eroare.
        //	b) Pentru opțiunea 2 userul va trebui sa introduca doua numere
        //	întregi și se va afisa suma acestora.
        //	c) Pentru opțiunea 3 userul va trebui sa introducă un număr întreg
        //	pozitiv (se va face verificarea) iar pe baza acestuia se vor afișa
        //	toate numerele de la 0 pana la acesta.

        Scanner scan = new Scanner(System.in);

        System.out.println("Tasta 1: Tastati un numar de la 1 la 10 ");
        System.out.println("Tasta 2: Tastati doua numere intregi ");
        System.out.println("Tasta 3: Tastati un numar pozitiv ");
        System.out.print("Alege optiunea: ");

        int a = scan.nextInt();
        switch (a){
            case 1:
                System.out.print("Tastati un numar intre 1 si 10:  ");
                int b = scan.nextInt();
                if ( b < 1){
                System.out.println("Numarul nu se afla in intervalul 1 - 10 .");
            } else if ( b > 10) {
                    System.out.println("Numarul nu se afla in intervalul 1 - 10 .");
                }else {
                    System.out.println("NUmarul este corect ");
        }
                break;
            case 2:
                System.out.print("Tastati primul numar:  ");
                int nr1 = scan.nextInt();
                System.out.print("Tastati al doilea numar numar:  ");
                int nr2 = scan.nextInt();
                int sum = nr1 + nr2;
                System.out.println("Suma celor doua numere este: " + sum);
                break;
            case 3:
                System.out.print("Tastati un numar intreg si pozitiv:  ");
                int nr3 = scan.nextInt();
                if (nr3 >=0) {
                    for (int i = 0; i <= nr3; i++) {
                        System.out.println(i);
                                            }
                }else {

                    System.out.println("numarul introdus este negativ!");
                }
                break;
            default:
                System.out.println("NU ati ales nici o Optiune ");
        }
    }
}
