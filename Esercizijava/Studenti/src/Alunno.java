public class Alunno {

    private String nome;
    private String cognome;
    private int eta;
    private float altezza;
    private float peso;


    public Alunno() {
        this.nome = "";
        this.cognome = "";
        this.eta = 5;
        this.altezza = 0;
        this.peso = 0;
    }


    public Alunno(Alunno a) {
        if (a.eta < 5 || a.altezza <= 0 || a.peso <= 0) {
            System.out.println("cambia i valori che hai messo.");
            this.nome = "";
            this.cognome = "";
            this.eta = 0;
            this.altezza = 0;
            this.peso = 0;
        } else {
            this.nome = a.nome;
            this.cognome = a.cognome;
            this.eta = a.eta;
            this.altezza = a.altezza;
            this.peso = a.peso;
        }
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    public String calcolaIndice() {
        if (altezza <= 0 || peso <= 0) {
            return "Impossibile calcolare il BMI: valori sbagliati.";
        }

        double bmi = (peso / (altezza * altezza));
        String messaggio;

        if (bmi < 18.5) {
            messaggio = "Sottopeso";
        } else if (bmi < 25) {
            messaggio = "Normopeso";
        } else if (bmi < 30) {
            messaggio = "Sovrappeso";
        } else {
            messaggio = "Obesità";
        }

        return  "eta:" + eta + " " + "bmi:"+ bmi + "  " + messaggio;
    }


    public void stampa() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Età: " + eta);
        System.out.println("Altezza: " + altezza + " m");
        System.out.println("Peso: " + peso + " kg");

    }
}
