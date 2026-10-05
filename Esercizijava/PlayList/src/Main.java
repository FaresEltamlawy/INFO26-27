import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Playlist pl = null;
        int scelta;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Crea nuova playlist");
            System.out.println("2) Play");
            System.out.println("3) Pausa");
            System.out.println("4) Stop");
            System.out.println("5) Brano Successivo");
            System.out.println("6) Brano Precedente");
            System.out.println("7) Stampa info Playlist");
            System.out.println("8) Esci");
            System.out.print("Scelta: ");

            scelta = sc.nextInt();
            sc.nextLine();

            switch(scelta) {
                case 1:
                    System.out.print("\nInserisci nome della playlist: ");
                    String nome = sc.nextLine();
                    System.out.print("Inserisci numero di brani presenti: ");
                    int num = sc.nextInt();
                    pl = new Playlist(nome, num);
                    System.out.println("Playlist creata con successo!");
                    break;
                case 2:
                    if (pl != null) {
                        pl.play();
                        System.out.println("Comando Play eseguito.");
                    } else {
                        System.out.println("Errore: devi prima creare una playlist (Opzione 1).");
                    }
                    break;
                case 3:
                    if (pl != null) {
                        pl.pause();
                        System.out.println("Comando Pausa eseguito.");
                    } else {
                        System.out.println("Errore: devi prima creare una playlist (Opzione 1).");
                    }
                    break;
                case 4:
                    if (pl != null) {
                        pl.stop();
                        System.out.println("Comando Stop eseguito.");
                    } else {
                        System.out.println("Errore: devi prima creare una playlist (Opzione 1).");
                    }
                    break;
                case 5:
                    if (pl != null) {
                        pl.branoSuccessivo();
                        System.out.println("Sei passato al brano successivo.");
                    } else {
                        System.out.println("Errore: devi prima creare una playlist (Opzione 1).");
                    }
                    break;
                case 6:
                    if (pl != null) {
                        pl.branoPrecedente();
                        System.out.println("Sei passato al brano precedente.");
                    } else {
                        System.out.println("Errore: devi prima creare una playlist (Opzione 1).");
                    }
                    break;
                case 7:
                    if (pl != null) {
                        System.out.println("\nStato attuale:\n" + pl.toString());
                    } else {
                        System.out.println("Errore: devi prima creare una playlist (Opzione 1).");
                    }
                    break;
                case 8:
                    System.out.println("Uscita in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }

        } while(scelta != 8);

        sc.close();
    }
}