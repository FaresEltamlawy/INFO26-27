import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il prefisso alfabetico: ");
        String prefisso = input.nextLine();

        System.out.print("Inserisci il numero di cifre della parte numerica: ");
        int cifre = input.nextInt();

        GeneratoreAuto gen = new GeneratoreAuto(prefisso, cifre);

        int scelta;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Genera nuovo codice");
            System.out.println("2) Mostra ultimo codice generato");
            System.out.println("3) Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Nuovo codice: " + gen.genera());
                    break;
                case 2:
                    System.out.println(gen.toString());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Scelta non valida");
            }

        } while (scelta != 3);

        input.close();
    }
}
