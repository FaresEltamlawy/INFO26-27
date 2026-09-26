public class LampadinaIntelligente {

    private int potenza;
    private int illuminazione;
    private String colore;
    private String nome;
    private boolean accesa;


    public LampadinaIntelligente(int potenza) {
        this.potenza = potenza;
        this.illuminazione = 50;
        this.colore = "bianco";
        this.nome = "";
        this.accesa = false;
    }


    public LampadinaIntelligente(LampadinaIntelligente altra) {
        this.potenza = altra.potenza;
        this.illuminazione = altra.illuminazione;
        this.colore = altra.colore;
        this.nome = altra.nome;
        this.accesa = altra.accesa;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    // Metodi funzionali
    public void accendi() {
        accesa = true;
    }

    public void spegni() {
        accesa = false;
    }

    public void aumentaIlluminazione() {
        if (illuminazione < 100) {
            illuminazione += 10;
            if (illuminazione > 100) illuminazione = 100;
        }
    }

    public void diminuisciIlluminazione() {
        if (illuminazione > 0) {
            illuminazione -= 10;
            if (illuminazione < 0) illuminazione = 0;
        }
    }

    @Override
    public String toString() {
        String stato = accesa ? "accesa" : "spenta";
        return "Nome: " + nome + ", Potenza: " + potenza + " watt, Stato: " + stato +
                ", Luminosita: " + illuminazione + "%, Colore: " + colore;
    }
}
