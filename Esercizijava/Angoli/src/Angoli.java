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
        int seconditot = this.gradi * 3600 + this.minuti * 60 + this.secondi;
        int unGiro = 360 * 3600;

        seconditot = seconditot % unGiro;
        if (seconditot < 0){
            seconditot += unGiro;
        }
        this.gradi = seconditot / 3600;
        seconditot %= 3600;
        this.minuti = seconditot / 60;
        this.secondi = seconditot % 60;
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
