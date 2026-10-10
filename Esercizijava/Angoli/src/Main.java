import java.util.Scanner;

public class Main {
    public static Angoli creaAngolo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci i gradi");
        int g = sc.nextInt();
        System.out.println("inserisci i minuti");
        int m = sc.nextInt();
        System.out.println("inserisci i secondi");
        int s = sc.nextInt();
        return new Angoli(g, m, s);
    }

    public static int mostraMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n MENU GESTIONE ANGOLI ");
        System.out.println("1. Inserisci un nuovo angolo");
        System.out.println("2. Somma un angolo a quello corrente");
        System.out.println("3. Sottrai un angolo da quello corrente");
        System.out.println("0. Uscire");
        System.out.print("Seleziona un'opzione: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Angoli angoloCorrente = null;
       int scelta;

        do {
            scelta = mostraMenu();

            switch (scelta) {
                case 1:
                    angoloCorrente = creaAngolo();
                    System.out.println("Angolo salvato: " + angoloCorrente);
                    break;
                case 2:
                    if (angoloCorrente == null) {
                        System.out.println("Prima devi creare un angolo (Opzione 1).");
                    } else {
                        System.out.println("Inserisci l'angolo da SOMMARE:");
                        Angoli angoloDaSommare = creaAngolo();
                        angoloCorrente = angoloCorrente.sommaAngoli(angoloDaSommare);
                        System.out.println("Risultato somma: " + angoloCorrente);
                    }
                    break;
                case 3:
                    if (angoloCorrente == null) {
                        System.out.println("Prima devi creare un angolo (Opzione 1).");
                    } else {
                        System.out.println("Inserisci l'angolo da SOTTRARRE:");
                        Angoli angoloDaSottrarre = creaAngolo();
                        angoloCorrente = angoloCorrente.sottraiAngoli(angoloDaSottrarre);
                        System.out.println("Risultato sottrazione: " + angoloCorrente);
                    }
                    break;
                case 0:
                    System.out.println("Alla prossima vez");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        } while (scelta != 0);
    }
}