import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rettangolo rettangolo = null;
        int scelta;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Costruisci rettangolo");
            System.out.println("2) Calcola perimetro");
            System.out.println("3) Calcola area");
            System.out.println("4) Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    rettangolo = CreaPunto(sc);
                    break;

                case 2:
                    if (rettangolo != null)
                        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
                    else
                        System.out.println("Crea prima il rettangolo.");
                    break;

                case 3:
                    if (rettangolo != null)
                        System.out.println("Area: " + rettangolo.calcolaArea());
                    else
                        System.out.println("Crea prima il rettangolo.");
                    break;

                case 4:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 4);

        sc.close();
    }

    private static Rettangolo CreaPunto(Scanner sc) {
        Rettangolo rettangolo;
        System.out.print("Inserisci x del punto A: ");
        double x1 = sc.nextDouble();
        System.out.print("Inserisci y del punto A: ");
        double y1 = sc.nextDouble();
        System.out.print("Inserisci x del punto B: ");
        double x2 = sc.nextDouble();
        System.out.print("Inserisci y del punto B: ");
        double y2 = sc.nextDouble();
        rettangolo = new Rettangolo(new Punto(x1, y1), new Punto(x2, y2));
        System.out.println("Rettangolo creato: " + rettangolo);
        return rettangolo;
    }
}
