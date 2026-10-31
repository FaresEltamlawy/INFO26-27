public class Risposta {
    private String testo;
    private boolean corretta;

    public Risposta(String testo, boolean corretta) {
        this.testo = testo;
        this.corretta = corretta;
    }

    public Risposta(Risposta altra) {
        this.testo = altra.testo;
        this.corretta = altra.corretta;
    }

    public String getTesto() {
        return testo;
    }

    public boolean isCorretta() {
        return corretta;
    }

    @Override
    public String toString() {
        return testo;
    }
}