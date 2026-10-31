import java.util.Scanner;

public class Main {
    public static Punto creaPunto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la coordinata x: ");
        double x = scanner.nextDouble();
        System.out.print("Inserisci la coordinata y: ");
        double y = scanner.nextDouble();
        return new Punto(x, y);
    }

    public static Vettore creaVettore() {
        System.out.println("Definizione dell'origine del vettore:");
        Punto origine = creaPunto();
        System.out.println("Definizione del vertice del vettore:");
        Punto vertice = creaPunto();
        return new Vettore(origine, vertice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vettore v1 = null;
        Vettore v2 = null;
        int scelta;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Definire i vettori v1 e v2");
            System.out.println("2. Visualizzare le coordinate dei vettori");
            System.out.println("3. Calcolare le lunghezze (calcolaLunghezza)");
            System.out.println("4. Spostare l'origine di un vettore (spostaOrigine)");
            System.out.println("5. Verificare se hanno la stessa origine (verificaOrigine)");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("\nCrea Vettore v1:");
                    v1 = creaVettore();
                    System.out.println("\nCrea Vettore v2:");
                    v2 = creaVettore();
                    break;
                case 2:
                    if (v1 != null && v2 != null) {
                        System.out.println("v1: " + v1);
                        System.out.println("v2: " + v2);
                    } else {
                        System.out.println("Prima definire entrambi i vettori.");
                    }
                    break;
                case 3:
                    if (v1 != null && v2 != null) {
                        System.out.println("Lunghezza v1: " + v1.calcolaLunghezza());
                        System.out.println("Lunghezza v2: " + v2.calcolaLunghezza());
                    } else {
                        System.out.println("Prima definire entrambi i vettori.");
                    }
                    break;

                case 4:
                    if (v1 != null && v2 != null) {
                        System.out.print("Di quale vettore vuoi spostare l'origine? (1 o 2): ");
                        int vScelto = scanner.nextInt();
                        System.out.println("Inserisci le coordinate del nuovo punto origine:");
                        Punto nuovoPunto = creaPunto();
                        if (vScelto == 1) {
                            v1 = v1.spostaorigine(nuovoPunto);
                            System.out.println("Nuovo v1: " + v1);
                        } else if (vScelto == 2) {
                            v2 = v2.spostaorigine(nuovoPunto);
                            System.out.println("Nuovo v2: " + v2);
                        } else {
                            System.out.println("Scelta non valida.");
                        }
                    } else {
                        System.out.println("Prima definire entrambi i vettori.");
                    }
                    break;
                case 5:
                    if (v1 != null && v2 != null) {
                        boolean stessoPunto = v1.verificaOrigine(v2.getOrigine());
                        if (stessoPunto) {
                            System.out.println("I due vettori HANNO la stessa origine.");
                        } else {
                            System.out.println("I due vettori NON hanno la stessa origine.");
                        }
                    } else {
                        System.out.println("Prima definire entrambi i vettori.");
                    }
                    break;
                case 0:
                    System.out.println("Programs in chiusurs1");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);

        scanner.close();
    }
}