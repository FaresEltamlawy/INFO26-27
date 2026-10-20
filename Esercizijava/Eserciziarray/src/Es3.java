import java.util.Random;

public class Es3 {
    public static void main(String[] args) {
        int[] v = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            v[i] = random.nextInt(90) + 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println();
    }
}