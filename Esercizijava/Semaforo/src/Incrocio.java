public class Incrocio {

    private Semaforo nord;
    private Semaforo sud;
    private Semaforo est;
    private Semaforo ovest;

    public Incrocio() {
        this.nord = new Semaforo();
        this.sud = new Semaforo();
        this.est = new Semaforo();
        this.ovest = new Semaforo();
    }

    public void accendi() {
        this.nord.accendi();
        this.sud.accendi();
        this.est.accendi();
        this.ovest.accendi();

        this.nord.avanza();
        this.nord.avanza();

        this.sud.avanza();
        this.sud.avanza();
    }

    public void spegni() {
        this.nord.spegni();
        this.sud.spegni();
        this.est.spegni();
        this.ovest.spegni();
    }

    public void avanza(char strada) {
        strada = Character.toUpperCase(strada);

        if (!isAcceso()) {
            return;
        }

        switch (strada) {
            case 'N':
                if (puoAvanzare(nord, est, ovest)) {
                    nord.avanza();
                }
                break;
            case 'S':
                if (puoAvanzare(sud, est, ovest)) {
                    sud.avanza();
                }
                break;
            case 'E':
                if (puoAvanzare(est, nord, sud)) {
                    est.avanza();
                }
                break;
            case 'O':
                if (puoAvanzare(ovest, nord, sud)) {
                    ovest.avanza();
                }
                break;
            default:
                break;
        }
    }

    private boolean puoAvanzare(Semaforo bersaglio, Semaforo trasversale1, Semaforo trasversale2) {
        if (bersaglio.getColore().equals("ROSSO")) {
            boolean trasversaleHaVerde = trasversale1.getColore().equals("VERDE") || trasversale2.getColore().equals("VERDE");
            if (trasversaleHaVerde) {
                return false;
            }
        }
        return true;
    }

    public boolean isAcceso() {
        return nord.isAcceso();
    }

    public String getColore(char strada) {
        if (!isAcceso()) {
            return "";
        }

        switch (Character.toUpperCase(strada)) {
            case 'N': return nord.getColore();
            case 'S': return sud.getColore();
            case 'E': return est.getColore();
            case 'O': return ovest.getColore();
            default: return "";
        }
    }

    private String getInizialeColore(Semaforo s) {
        if (!s.isAcceso()) return " ";
        String col = s.getColore();
        if (col.equals("VERDE")) return "V";
        if (col.equals("GIALLO")) return "G";
        if (col.equals("ROSSO")) return "R";
        return " ";
    }

    @Override
    public String toString() {
        if (!isAcceso()) {
            return "L'incrocio è spento.";
        }

        String cN = getInizialeColore(nord);
        String cS = getInizialeColore(sud);
        String cE = getInizialeColore(est);
        String cO = getInizialeColore(ovest);

        return "   | " + cN + " |\n" +
                "   |   |\n" +
                "   | N |\n" +
                "------- -------\n" +
                " " + cO + " O   E " + cE + "\n" +
                "------- -------\n" +
                "   | S |\n" +
                "   |   |\n" +
                "   | " + cS + " |";
    }
}