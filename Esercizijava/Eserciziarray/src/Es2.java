import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[10];

        System.out.print("Inserisci il valore di a: ");
        int a = scanner.nextInt();
        System.out.print("Inserisci il valore di b: ");
        int b = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            v[i] = a + (int) (Math.random() * (b - a + 1));
        }

        int m = (a + b) / 2;

        for (int i = 0; i < 10; i++) {
            if (v[i] >= a && v[i] <= m) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (v[i] >= m + 1 && v[i] <= b) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}