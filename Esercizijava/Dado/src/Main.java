import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Dado dado = new Dado();
        int scelta;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Crea un dado a 6 facce");
            System.out.println("2) Crea un dado con N facce");
            System.out.println("3) Lancia il dado");
            System.out.println("4) Mostra informazioni del dado");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    dado = new Dado();
                    System.out.println("Dado creato: " + dado);
                    break;

                case 2:
                    System.out.print("Inserisci numero facce: ");
                    int n = input.nextInt();
                    dado = new Dado(n);
                    System.out.println("Dado creato: " + dado);
                    break;

                case 3:
                    System.out.println("Risultato lancio: " + dado.lancia());
                    break;

                case 4:
                    System.out.println(dado);
                    break;

                case 0:
                    System.out.println("Uscita...");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }

        } while (scelta != 0);

        input.close();
    }
}
