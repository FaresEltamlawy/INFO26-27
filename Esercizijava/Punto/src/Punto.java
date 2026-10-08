public class Punto {

    private double x;
    private double y;

    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto altro) {
        this.x = altro.x;
        this.y = altro.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanza(Punto altro) {
        double dx = this.x - altro.x;
        double dy = this.y - altro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Punto puntoMedio(Punto altro) {
        double mx = (this.x + altro.x) / 2.0;
        double my = (this.y + altro.y) / 2.0;
        return new Punto(mx, my);
    }

    public void ruota(double alfaGradi) {
        double rad = Math.toRadians(alfaGradi);
        double nuovaX = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double nuovaY = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        this.x = nuovaX;
        this.y = nuovaY;
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ")";
    }
}