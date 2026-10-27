public class Dado {
    private int facce;

    public Dado(int facce) {
        this.facce = facce;
    }

    public int lancia() {
        return (int) (Math.random() * facce) + 1;
    }

    public int getFacce() {
        return facce;
    }
}