import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Incrocio incrocio = new Incrocio();
        int scelta;

        do {
            System.out.println("\n--- MENU GESTIONE INCROCIO ---");
            System.out.println("1) Accendi incrocio");
            System.out.println("2) Spegni incrocio");
            System.out.println("3) Avanza colore di un semaforo (N, S, E, O)");
            System.out.println("4) Verifica se e' acceso e mostra colore di una strada");
            System.out.println("5) Stampa stato e mappa dell'incrocio");
            System.out.println("6) Esci");
            System.out.print("Scelta: ");

            scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    incrocio.accendi();
                    System.out.println("Incrocio acceso.");
                    break;

                case 2:
                    incrocio.spegni();
                    System.out.println("Incrocio spento.");
                    break;

                case 3:
                    if (!incrocio.isAcceso()) {
                        System.out.println("L'incrocio e' spento.");
                    } else {
                        System.out.print("Inserisci la strada (N, S, E, O): ");
                        char strada = sc.next().charAt(0);
                        incrocio.avanza(strada);
                    }
                    break;

                case 4:
                    if (incrocio.isAcceso()) {
                        System.out.println("L'incrocio e' ACCESO.");
                        System.out.print("Inserisci la strada (N, S, E, O): ");
                        char strada = sc.next().charAt(0);
                        String colore = incrocio.getColore(strada);
                        if (!colore.isEmpty()) {
                            System.out.println("Colore semaforo " + Character.toUpperCase(strada) + ": " + colore);
                        } else {
                            System.out.println("Strada non valida.");
                        }
                    } else {
                        System.out.println("L'incrocio e' SPENTO.");
                    }
                    break;

                case 5:
                    System.out.println("\n" + incrocio.toString());
                    break;

                case 6:
                    System.out.println("Uscita in corso...");
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

        } while (scelta != 6);

        sc.close();
    }
}