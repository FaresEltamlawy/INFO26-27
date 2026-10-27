import java.util.Scanner;

public class NomeCognome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il cognome: ");
        String cognome = scanner.nextLine();

        System.out.println("Buongiorno " + nome + " " + cognome);

        scanner.close();
    }
}