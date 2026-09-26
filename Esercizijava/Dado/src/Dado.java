public class Dado {

    private int facce;

    public Dado() {
        this.facce = 6;
    }

    public Dado(int n) {
        if (n < 2 || n == 3) {
            this.facce = 6;
        } else {
            this.facce = n;
        }
    }

    public Dado(Dado d) {
        if (d.facce < 2 || d.facce == 3) {
            this.facce = 6;
        } else {
            this.facce = d.facce;
        }
    }

    public int lancia() {
        return (int)(Math.random() * facce) + 1;
    }

    public String toString() {
        return "Dado con " + facce + " facce";
    }
}
