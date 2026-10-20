import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[10];

        System.out.print("Quanti valori vuoi inserire (massimo 10)? ");
        int n = scanner.nextInt();
        if (n > 10) {
            n = 10;
        }

        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }

        int[] pari = new int[n];
        int[] dispari = new int[n];
        int countPari = 0;
        int countDispari = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
                pari[countPari] = v[i];
                countPari++;
            } else {
                dispari[countDispari] = v[i];
                countDispari++;
            }
        }

        System.out.print("Quantita di elementi pari: " + countPari + " - elementi pari: ");
        for (int i = 0; i < countPari; i++) {
            System.out.print(pari[i] + " ");
        }
        System.out.println();

        System.out.print("Quantita di elementi dispari: " + countDispari + " - elementi dispari: ");
        for (int i = 0; i < countDispari; i++) {
            System.out.print(dispari[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}