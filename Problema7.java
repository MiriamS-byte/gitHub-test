package itFactory.sesiunea1_2.exercitii1_2;

public class Problema7 {
    public static void main(String[] args) {
        //Scrieți un program în care afișați toate
        // numerele întregi de la -100 la 100, mai
        // puțin cele divizibile cu 2 sau cu 3.


        for (int a = -100; a <= 100; a++) {
            if (a % 2 == 0) {
                continue;
            }
            if (a % 5 == 0) {
                continue;
            }
            System.out.println(a);

        }
    }
}
