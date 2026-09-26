import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Alunno a1 = new Alunno();
        Alunno a2 = new Alunno();

        int scelta;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Inserire i dati dei due studenti");
            System.out.println("2) Determinare l'indice di massa corporea");
            System.out.println("3) Stampare le caratteristiche dei due studenti");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("\n--- Studente 1 ---");
                    System.out.print("Nome: ");
                    a1.setNome(input.nextLine());
                    System.out.print("Cognome: ");
                    a1.setCognome(input.nextLine());
                    System.out.print("Età: ");
                    a1.setEta(input.nextInt());
                    System.out.print("Altezza (m): ");
                    a1.setAltezza(input.nextFloat());
                    System.out.print("Peso (kg): ");
                    a1.setPeso(input.nextFloat());
                    input.nextLine();

                    System.out.println("\n--- Studente 2 ---");
                    System.out.print("Nome: ");
                    a2.setNome(input.nextLine());
                    System.out.print("Cognome: ");
                    a2.setCognome(input.nextLine());
                    System.out.print("Età: ");
                    a2.setEta(input.nextInt());
                    System.out.print("Altezza (m): ");
                    a2.setAltezza(input.nextFloat());
                    System.out.print("Peso (kg): ");
                    a2.setPeso(input.nextFloat());
                    input.nextLine();
                    break;

                case 2:
                    System.out.println("\nBMI Studente 1: " + a1.calcolaIndice());
                    System.out.println("\nBMI Studente 2: " + a2.calcolaIndice());
                    break;

                case 3:
                    System.out.println("\n--- Studente 1 ---");
                    a1.stampa();
                    System.out.println("\n--- Studente 2 ---");
                    a2.stampa();
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Scelta non valida!");
            }

        } while (scelta != 0);

        input.close();
    }
}
