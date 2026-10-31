import java.util.Scanner;

public class es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String testo = scanner.nextLine();


        String risultato = "";

        for (int i = 0; i < testo.length(); i++) {
            risultato += testo.charAt(i);
            if (i < testo.length() - 1) {
                risultato += "-";
            }
        }

        System.out.println("Risultato: " + risultato);

        scanner.close();
    }
}