import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Semaforo s = new Semaforo();
        int scelta;

        do {
            System.out.println("\n--- MENU SEMAFORO ---");
            System.out.println("1) Accendi");
            System.out.println("2) Spegni");
            System.out.println("3) Avanza colore");
            System.out.println("4) Verifica se e' acceso e mostra colore");
            System.out.println("5) Stampa stato semaforo");
            System.out.println("6) Esci");
            System.out.print("Scelta: ");

            scelta = sc.nextInt();

            switch(scelta) {
                case 1:
                    s.accendi();
                    System.out.println("Acceso.");
                    break;
                case 2:
                    s.spegni();
                    System.out.println("Spento.");
                    break;
                case 3:
                    s.avanza();
                    System.out.println("Avanzato di colore.");
                    break;
                case 4:
                    if (s.isAcceso() == true) {
                        System.out.println("Il semaforo e' acceso.");
                        System.out.println("Colore attuale: " + s.getColore());
                    } else {
                        System.out.println("Il semaforo e' spento.");
                    }
                    break;
                case 5:
                    System.out.println(s.toString());
                    break;
                case 6:
                    System.out.println("Uscita in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

        } while(scelta != 6);

        sc.close();
    }
}