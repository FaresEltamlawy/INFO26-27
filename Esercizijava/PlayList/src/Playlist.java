public class Playlist {

    private String nomePL;
    private int numeroCanzoni;
    private boolean play = false;


    public Playlist(int numeroCanzoni, boolean play, String nomePL) {
        this.numeroCanzoni = numeroCanzoni;
        this.play = play;
        this.nomePL = nomePL;
    }

    public Playlist(){

    }

    public String getNomePL() {
        return nomePL;
    }

    public void setNomePL(String nomePL) {
        this.nomePL = nomePL;
    }

    public int getNumeroCanzoni() {
        return numeroCanzoni;
    }

    public void setNumeroCanzoni(int canzoni) {
        this.numeroCanzoni = canzoni;
    }


    public void Start() {
        if (play = false) {
            play = true;
        } else
            System.out.println("La playlist è già in produzione");
    }



    public void Stop(){
        if (play = true){
            play = false;
            System.out.println("La playlist non è più in produzione");
        }else
            System.out.println("La playlist è già in stop");

    }

    public void Pause(){
        if (play = true){
            play =false;
            System.out.println("La playlist ora è in pausa");
        }else
            System.out.println("La playlist è già in pausa");
    }



}
