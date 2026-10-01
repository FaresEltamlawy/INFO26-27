public class TestLampadina {
    public static void main(String[] args) {
        LampadinaIntelligente l1 = new LampadinaIntelligente(40);
        l1.setNome("camera");

        System.out.println("--- Lampadina 1 ---");
        System.out.println(l1);

        l1.accendi();
        l1.aumentaIlluminazione();
        l1.setColore("giallo");
        System.out.println(l1);

        LampadinaIntelligente l2 = new LampadinaIntelligente(l1);
        System.out.println("Copia");
        System.out.println(l2);

        System.out.println("Nome della nuova lampadina: " + l2.getNome());
        System.out.println("Colore della nuova lampadina: " + l2.getColore());

        l1.spegni();
        l1.diminuisciIlluminazione();
        System.out.println("--- Lampadina 1 spenta ---");
        System.out.println(l1);
    }
}