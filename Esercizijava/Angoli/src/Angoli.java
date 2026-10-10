public class Angoli {
    private int gradi;
    private int minuti;
    private int secondi;


    public Angoli(int gradi, int minuti, int secondi) {
        this.gradi = gradi;
        this.minuti = minuti;
        this.secondi = secondi;
        semplifica();
    }

    private void semplifica(){
        int ST = this.gradi * 3600 + this.minuti * 60 + this.secondi;
        int unGiro = 360 * 3600;

        ST = ST % unGiro;
        if (ST < 0){
            ST += unGiro;
        }
        this.gradi = ST / 3600;
        ST %= 3600;
        this.minuti = ST / 60;
        this.secondi = ST % 60;
    }

    public Angoli sommaAngoli(Angoli a){
        int nGradi = this.gradi + a.gradi;
        int nMinuti = this.minuti + a.minuti;
        int nSecondi = this.secondi + a.secondi;
        return new Angoli(nGradi, nMinuti, nSecondi);
    }

    public Angoli sottraiAngoli(Angoli a){
        int nGradi = this.gradi - a.gradi;
        int nMinuti = this.minuti - a.minuti;
        int nSecondi = this.secondi - a.secondi;
        return new Angoli(nGradi, nMinuti, nSecondi);
    }

    @Override
    public String toString() {
        return gradi + "° " + minuti + "' " + secondi + "\"";
    }

}
