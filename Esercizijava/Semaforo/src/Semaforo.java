public class Semaforo {

    private boolean acceso;
    private String colore;

    public Semaforo() {
        this.acceso = false;
        this.colore = "";
    }

    public void accendi() {
        this.acceso = true;
        this.colore = "VERDE";
    }

    public void spegni() {
        this.acceso = false;
    }

    public void avanza() {
        if (this.acceso == true) {
            if (this.colore.equals("VERDE")) {
                this.colore = "GIALLO";
            } else if (this.colore.equals("GIALLO")) {
                this.colore = "ROSSO";
            } else if (this.colore.equals("ROSSO")) {
                this.colore = "VERDE";
            }
        }
    }

    public boolean isAcceso() {
        return this.acceso;
    }

    public String getColore() {
        if (this.acceso == false) {
            return "";
        }
        return this.colore;
    }

    @Override
    public String toString() {
        if (this.acceso == true) {
            return "Il semaforo è acceso sul " + this.colore;
        } else {
            return "Il semaforo è spento";
        }
    }
}