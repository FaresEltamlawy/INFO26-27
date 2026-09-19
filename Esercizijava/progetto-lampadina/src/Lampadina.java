
public class Lampadina {

    int potenza;
    public String colore;
    int intensita;
    boolean accesa;
    public String nome;

    public Lampadina(int potenza, String colore, int intensita, boolean accesa, String nome) {
        this.potenza = potenza;
        this.colore = colore;
        this.intensita = intensita;
        this.accesa = accesa;
        this.nome = nome;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getIntensita() {
        return intensita;
    }

    public void setIntensita(int intensita) {
        this.intensita = intensita;
    }

    public boolean isAccesa() {
        return accesa;
    }

    public void setAccesa(boolean accesa) {
        this.accesa = accesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
