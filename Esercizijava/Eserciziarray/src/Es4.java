import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[10];
        int count = 0;

        System.out.println("inserisci numeri:");
        while (count < 10) {
            int val = scanner.nextInt();
            if (val < 0) {
                break;
            }
            v[count] = val;
            count++;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}