public class Domanda {
    private String testoDomanda;
    private Risposta[] risposte;
    private int valore;
    private int rispostaUtente;

    public Domanda(String testoDomanda, Risposta[] risposte) {
        this.testoDomanda = testoDomanda;
        this.valore = 1;
        this.rispostaUtente = 0;
        this.risposte = new Risposta[4];
        for (int i = 0; i < 4 && i < risposte.length; i++) {
            this.risposte[i] = new Risposta(risposte[i]);
        }
    }

    public Domanda(Domanda altra) {
        this.testoDomanda = altra.testoDomanda;
        this.valore = altra.valore;
        this.rispostaUtente = 0;
        this.risposte = new Risposta[4];
        for (int i = 0; i < 4; i++) {
            if (altra.risposte[i] != null) {
                this.risposte[i] = new Risposta(altra.risposte[i]);
            }
        }
    }

    public boolean rispondi(int scelta) {
        if (scelta >= 1 && scelta <= 4) {
            this.rispostaUtente = scelta;
            return risposte[scelta - 1].isCorretta();
        }
        return false;
    }

    public void setValore(int nuovoValore) {
        if (nuovoValore >= 0) {
            this.valore = nuovoValore;
        }
    }

    public int getValore() {
        return valore;
    }

    public int getPunteggio() {
        if (rispostaUtente == 0) {
            return -1;
        }
        if (risposte[rispostaUtente - 1].isCorretta()) {
            return valore;
        } else {
            return 0;
        }
    }

    public boolean completata() {
        return rispostaUtente != 0;
    }

    public String getRispostaCorretta() {
        for (Risposta r : risposte) {
            if (r != null && r.isCorretta()) {
                return r.getTesto();
            }
        }
        return null;
    }

    public String getRispostaData() {
        if (rispostaUtente == 0) {
            return null;
        }
        return risposte[rispostaUtente - 1].getTesto();
    }

    @Override
    public String toString() {
        String risultato = testoDomanda + "\n";
        for (int i = 0; i < risposte.length; i++) {
            if (risposte[i] != null) {
                risultato = risultato + (i + 1) + ") " + risposte[i].getTesto() + "\n";
            }
        }
        return risultato.trim();
    }
}