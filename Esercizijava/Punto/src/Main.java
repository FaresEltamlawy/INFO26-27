import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Punto p1 = new Punto();
        int scelta;

        do {
            System.out.println("\n--- MENU PUNTO GEOMETRICO ---");
            System.out.println("1) Imposta coordinate del punto principale");
            System.out.println("2) Calcola distanza da un altro punto");
            System.out.println("3) Calcola punto medio con un altro punto");
            System.out.println("4) Ruota il punto principale");
            System.out.println("5) Stampa coordinate punto principale");
            System.out.println("6) Esci");
            System.out.print("Scelta: ");

            scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci X: ");
                    double x = sc.nextDouble();
                    System.out.print("Inserisci Y: ");
                    double y = sc.nextDouble();
                    p1.setX(x);
                    p1.setY(y);
                    System.out.println("Punto aggiornato a " + p1);
                    break;

                case 2:
                    System.out.print("Inserisci X del secondo punto: ");
                    double x2 = sc.nextDouble();
                    System.out.print("Inserisci Y del secondo punto: ");
                    double y2 = sc.nextDouble();
                    Punto p2 = new Punto(x2, y2);
                    System.out.println("Distanza: " + p1.distanza(p2));
                    break;

                case 3:
                    System.out.print("Inserisci X del secondo punto: ");
                    double xM = sc.nextDouble();
                    System.out.print("Inserisci Y del secondo punto: ");
                    double yM = sc.nextDouble();
                    Punto pAltro = new Punto(xM, yM);
                    Punto pm = p1.puntoMedio(pAltro);
                    System.out.println("Punto Medio: " + pm);
                    break;

                case 4:
                    System.out.print("Inserisci angolo di rotazione in gradi: ");
                    double alfa = sc.nextDouble();
                    p1.ruota(alfa);
                    System.out.println("Punto ruotato: " + p1);
                    break;

                case 5:
                    System.out.println("Punto attuale: " + p1);
                    break;

                case 6:
                    System.out.println("Uscita dal programma...");
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

        } while (scelta != 6);

        sc.close();
    }
}