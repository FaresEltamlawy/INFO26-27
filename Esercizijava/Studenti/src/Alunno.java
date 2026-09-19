public class Alunno {

    String nome;
    int eta;
    int anno;

    public Alunno(int eta, String nome, int anno) {
        this.eta = eta;
        this.nome = nome;
        this.anno = anno;
    }


    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }


}
