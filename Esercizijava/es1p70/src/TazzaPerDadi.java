public class TazzaPerDadi {
    private Dado[] dadi;
    private int nContenuti;
    private boolean uniforme;
    private int facceUniformi;

    public TazzaPerDadi(int capienza) {
        this.dadi = new Dado[capienza];
        this.nContenuti = 0;
        this.uniforme = false;
    }

    public TazzaPerDadi(int N, int F) {
        this.dadi = new Dado[N];
        this.nContenuti = N;
        this.uniforme = true;
        this.facceUniformi = F;
        for (int i = 0; i < N; i++) {
            this.dadi[i] = new Dado(F);
        }
    }

    public boolean add(Dado d) {
        if (nContenuti >= dadi.length) {
            return false;
        }
        dadi[nContenuti] = d;
        nContenuti++;
        uniforme = false;
        return true;
    }

    public int quanti() {
        return nContenuti;
    }

    public int size() {
        return dadi.length;
    }

    public boolean isEmpty() {
        return nContenuti == 0;
    }

    public int getMassimo() {
        int max = 0;
        for (int i = 0; i < nContenuti; i++) {
            max += dadi[i].getFacce();
        }
        return max;
    }

    public int getMinimo() {
        return nContenuti;
    }

    public int lancia() {
        int somma = 0;
        for (int i = 0; i < nContenuti; i++) {
            somma += dadi[i].lancia();
        }
        return somma;
    }

    public String toString() {
        if (uniforme && nContenuti == dadi.length) {
            return "Questa tazza contiene esattamente " + nContenuti + " dadi, tutti con " + facceUniformi + " facce";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Questa tazza può contenere al massimo ").append(dadi.length).append(" dadi.\n");
            sb.append("Dadi attualmente contenuti: ").append(nContenuti).append("\n");
            sb.append("Lista dei dadi:");
            for (int i = 0; i < nContenuti; i++) {
                sb.append("\n- dado da ").append(dadi[i].getFacce());
            }
            return sb.toString();
        }
    }
}