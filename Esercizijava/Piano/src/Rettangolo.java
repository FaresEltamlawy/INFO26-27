public class Rettangolo {
    private Punto a;
    private Punto b;

    public Rettangolo(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    private double valoreAssoluto(double n) {
        if (n < 0)
            n = -n;
        return n;
    }

    public double calcolaPerimetro() {
        double base = valoreAssoluto(b.getX() - a.getX());
        double altezza = valoreAssoluto(b.getY() - a.getY());
        return 2 * (base + altezza);
    }

    public double calcolaArea() {
        double base = valoreAssoluto(b.getX() - a.getX());
        double altezza = valoreAssoluto(b.getY() - a.getY());
        return base * altezza;
    }

    public String toString() {
        return "Rettangolo con vertici A(" + a.getX() + ", " + a.getY() + ") e B(" + b.getX() + ", " + b.getY() + ")";
    }
}
