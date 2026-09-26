import java.util.Scanner;

public class MenuLampadina {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la potenza della lampadina: ");
        int potenza = input.nextInt();
        input.nextLine();

        LampadinaIntelligente lamp = new LampadinaIntelligente(potenza);

        System.out.print("Inserisci il nome della lampadina: ");
        lamp.setNome(input.nextLine());

        int scelta;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Accendi");
            System.out.println("2) Spegni");
            System.out.println("3) Aumenta illuminazione");
            System.out.println("4) Diminuisci illuminazione");
            System.out.println("5) Cambia colore");
            System.out.println("6) Mostra stato");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {
                case 1:
                    lamp.accendi();
                    break;
                case 2:
                    lamp.spegni();
                    break;
                case 3:
                    lamp.aumentaIlluminazione();
                    break;
                case 4:
                    lamp.diminuisciIlluminazione();
                    break;
                case 5:
                    System.out.print("Nuovo colore: ");
                    lamp.setColore(input.nextLine());
                    break;
                case 6:
                    System.out.println(lamp);
                    break;
                case 0:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }

        } while (scelta != 0);

        input.close();
    }
}
