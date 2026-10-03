public class GeneratoreAuto {

    private String prefisso;
    private int cifre;
    private int ultimoValore;

    public GeneratoreAuto(String prefisso, int cifre) {
        this.prefisso = prefisso;
        this.cifre = cifre;
        this.ultimoValore = 0;
    }

    public String genera() {
        if (ultimoValore >= Math.pow(10, cifre) - 1) {
            return "Codici esauriti";
        }
        ultimoValore++;
        String parteNumerica = String.format("%0" + cifre + "d", ultimoValore);
        return prefisso + parteNumerica;
    }

    public String toString() {
        return "Prefisso: " + prefisso + " ultimo valore generato: " + ultimoValore;
    }
}
