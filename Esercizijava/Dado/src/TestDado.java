public class TestDado {
    public static void main(String[] args) {

        Dado d1 = new Dado();
        Dado d2 = new Dado(10);
        Dado d3 = new Dado(3);
        Dado d4 = new Dado(d2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        System.out.println("Lancio d1: " + d1.lancia());
        System.out.println("Lancio d2: " + d2.lancia());
        System.out.println("Lancio d3: " + d3.lancia());
        System.out.println("Lancio d4: " + d4.lancia());
    }
}
