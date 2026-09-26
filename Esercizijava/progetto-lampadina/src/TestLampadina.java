public class TestLampadina {
    public static void Main(String[] args) {

        LampadinaIntelligente lamp = new LampadinaIntelligente(40);
        lamp.setNome("camera");

        System.out.println("Stato iniziale:");
        System.out.println(lamp);

        lamp.accendi();
        lamp.aumentaIlluminazione();
        lamp.setColore("giallo");

        System.out.println("\nDopo alcune modifiche:");
        System.out.println(lamp);

        lamp.diminuisciIlluminazione();
        lamp.spegni();

        System.out.println("\nDopo altre modifiche:");
        System.out.println(lamp);


        LampadinaIntelligente copia = new LampadinaIntelligente(lamp);
        copia.setNome("copia");

        System.out.println("\nLampadina copiata:");
        System.out.println(copia);
    }
}
