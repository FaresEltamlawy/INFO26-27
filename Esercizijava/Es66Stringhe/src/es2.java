import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima parola: ");
        String parola1 = scanner.next();

        System.out.print("Inserisci la seconda parola: ");
        String parola2 = scanner.next();

        if (parola1.length() > parola2.length()) {
            System.out.println("La parola più lunga è: " + parola1);
        } else if (parola2.length() > parola1.length()) {
            System.out.println("La parola più lunga è: " + parola2);
        } else {
            System.out.println("Le due parole hanno la stessa lunghezza.");
        }

        scanner.close();
    }
}