public class GeneratoreAuto {

    private String prefisso;
    private int cifre;
    private int ultimoValore;
    private int massimo;

    public GeneratoreAuto(String prefisso, int cifre) {
        this.prefisso = prefisso;
        this.cifre = cifre;
        this.ultimoValore = 0;

        massimo = 1;
        for (int i = 0; i < cifre; i++) {
            massimo *= 10;
        }
        massimo -= 1;
    }

    public String genera() {
        if (ultimoValore >= massimo) {
            return "Codici esauriti";
        }
        ultimoValore++;
        String parteNumerica = String.format("%0" + cifre + "d" + ultimoValore);
        return prefisso + parteNumerica;
    }

    public String toString() {
        return "Prefisso: " + prefisso + " ultimo valore generato: " + ultimoValore;
    }
}
