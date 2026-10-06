public class Playlist {

    private String nome;
    private int numeroBrani;
    private int branoCorrente;

    private boolean inPlay;
    private boolean inPausa;
    private boolean inStop;

    public Playlist(String nome, int numeroBrani) {
        this.nome = nome;

        if (numeroBrani > 0) {
            this.numeroBrani = numeroBrani;
        } else {
            this.numeroBrani = 1;
        }

        this.branoCorrente = 1;

        this.inPlay = false;
        this.inPausa = false;
        this.inStop = true;
    }

    public Playlist(Playlist p) {
        this.nome = p.nome;
        this.numeroBrani = p.numeroBrani;
        this.branoCorrente = p.branoCorrente;
        this.inPlay = p.inPlay;
        this.inPausa = p.inPausa;
        this.inStop = p.inStop;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantiBrani() {
        return numeroBrani;
    }

    public void play() {
        this.inPlay = true;
        this.inPausa = false;
        this.inStop = false;
    }

    public void pause() {
        if (this.inStop == false) {
            this.inPlay = false;
            this.inPausa = true;
            this.inStop = false;
        }
    }

    public void stop() {
        if (this.inStop == true) {
            this.branoCorrente = 1;
        }

        this.inPlay = false;
        this.inPausa = false;
        this.inStop = true;
    }

    public void branoSuccessivo() {
        this.branoCorrente++;
        if (this.branoCorrente > this.numeroBrani) {
            this.branoCorrente = 1;
        }
    }

    public void branoPrecedente() {
        this.branoCorrente--;
        if (this.branoCorrente < 1) {
            this.branoCorrente = this.numeroBrani;
        }
    }

    @Override
    public String toString() {
        String statoAttuale = "";

        if (this.inPlay == true) {
            statoAttuale = "PLAY";
        } else if (this.inPausa == true) {
            statoAttuale = "PAUSE";
        } else if (this.inStop == true) {
            statoAttuale = "STOP";
        }

        return "Playlist " + this.nome + ", " + this.numeroBrani +
                " brani, in " + statoAttuale + " sul brano " + this.branoCorrente;
    }
}