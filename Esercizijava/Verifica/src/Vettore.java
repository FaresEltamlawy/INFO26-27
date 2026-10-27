public class Vettore {
    private Punto origine;
    private Punto vertice;

    public Vettore(Punto origine, Punto vertice) {
        this.origine = origine;
        this.vertice = vertice;
    }

    public Punto getOrigine() {
        return origine;
    }

    public void setOrigine(Punto origine) {
        this.origine = origine;
    }

    public Punto getVertive() {
        return vertice;
    }

    public void setVertice(Punto vertice) {
        this.vertice = vertice;
    }


    public double calcolaLunghezza(){

        double dx = vertice.getX() - origine.getX();
        double dy = vertice.getY() - origine.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public Vettore spostaorigine(Punto p){

        double dx = p.getX() - origine.getX();
        double dy = p.getY() - origine.getY();
        Punto nuovoOrigine = new Punto(origine.getX() + dx, origine.getY());
        return new Vettore(p, nuovoOrigine);
    }

    public boolean verificaOrigine(Punto p) {
        return this.origine.getX() == p.getX() && this.origine.getY() == p.getY();
    }

    @Override
    public String toString() {
        return "Origine: " + origine + ", Vertice: " + vertice;
    }

}
