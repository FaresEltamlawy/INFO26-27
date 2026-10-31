public class Quiz {
    private String titolo;
    private Domanda[] domande;
    private int numeroDomande;
    private static final int MAX_DOMANDE = 100;

    public Quiz(String titolo) {
        this.titolo = titolo;
        this.domande = new Domanda[MAX_DOMANDE];
        this.numeroDomande = 0;
    }

    public Quiz(Quiz altro) {
        this.titolo = altro.titolo;
        this.numeroDomande = altro.numeroDomande;
        this.domande = new Domanda[MAX_DOMANDE];
        for (int i = 0; i < altro.numeroDomande; i++) {
            this.domande[i] = new Domanda(altro.domande[i]);
        }
    }

    public boolean add(Domanda d) {
        if (numeroDomande < MAX_DOMANDE) {
            domande[numeroDomande++] = new Domanda(d);
            return true;
        }
        return false;
    }

    public int getQuanteDomande() {
        return numeroDomande;
    }

    public int getQuanteRisposte() {
        int conteggio = 0;
        for (int i = 0; i < numeroDomande; i++) {
            if (domande[i].completata()) {
                conteggio++;
            }
        }
        return conteggio;
    }

    public int[] getDomandeNonDate() {
        int[] temp = new int[numeroDomande];
        int count = 0;
        for (int i = 0; i < numeroDomande; i++) {
            if (!domande[i].completata()) {
                temp[count] = i + 1;
                count++;
            }
        }

        int[] nonDate = new int[count];
        for (int i = 0; i < count; i++) {
            nonDate[i] = temp[i];
        }
        return nonDate;
    }

    public Domanda getDomanda(int indice) {
        if (indice >= 1 && indice <= numeroDomande) {
            return domande[indice - 1];
        }
        return null;
    }

    public int getTotale() {
        int totale = 0;
        for (int i = 0; i < numeroDomande; i++) {
            totale += domande[i].getValore();
        }
        return totale;
    }

    public int getPunteggio() {
        int punteggio = 0;
        for (int i = 0; i < numeroDomande; i++) {
            int p = domande[i].getPunteggio();
            if (p > 0) {
                punteggio += p;
            }
        }
        return punteggio;
    }

    @Override
    public String toString() {
        return "Quiz: " + titolo + "\n" +
                "Numero domande: " + numeroDomande + "\n" +
                "Punteggio totale: " + getTotale() + " punti";
    }
}