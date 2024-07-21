import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");

        int a = scanner.nextInt();

        System.out.print("Introduceti al doilea numar: ");

        int b = scanner.nextInt();
        int rest = a % b;
        int produs = a * b;
        int impartire = a / b;

        System.out.println("Restul impartirii lui a la b este: " + rest);
        System.out.println("Inmultirea celor doua numere are ca rezultat: " + produs);
        System.out.println("Ipartirea cu rest dintre a si b este: " + impartire);
    }

}
