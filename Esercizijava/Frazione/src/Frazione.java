public class Frazione {
    private int num;
    private int den;
    private int nuovoNum;
    private int nuovoDen;


    public Frazione(int num, int den) {
        if(den == 0){
            System.out.println("Il den non può essere 0");
            this.num = num;
            this.den = 1;
        }else{
            this.num = num;
            this.den = den;
        }
        semplificaFrazione();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    private int MCD(int a, int b){
        if (a<0){
            a = -a;
        }
        if(b<0){
            b=-b;
        }
        while(b!=0){
            int resto = a%b;
            a=b;
            b=resto;
        }
        return a;
    }

    public void semplificaFrazione(){
        if(this.den<0){
            this.num = -this.num;
            this.den = -this.den;
        }
        int divisore=MCD(this.num, this.den);
        if(divisore!=0){
            this.num= this.num / divisore;
            this.den= this.den / divisore;
        }
    }

    public Frazione reciprovaFrazione(){
        if(this.num==0){
            System.out.println("Non si può invertire con il numeratore uguale a 0");
            return new Frazione(0, 1);
        }
        return new Frazione(this.den, this.num);
    }

    public Frazione oppostaFrazione(){
        return new Frazione(-this.num,this.den);
    }

    public Frazione sommaFrazione(Frazione frazione){
         nuovoNum=(this.num * frazione.den) + (frazione.num * this.den);
         nuovoDen=this.den * frazione.den;
        return new Frazione(nuovoNum,nuovoDen);
    }

    public Frazione sottraiFrazione(Frazione frazione){
         nuovoNum=(this.num * frazione.den) - (frazione.num * this.den);
         nuovoDen=this.den * frazione.den;
        return new Frazione(nuovoNum,nuovoDen);
    }

    public Frazione moltiplicaFrazione(Frazione frazione){
        nuovoNum= this.num * frazione.num;
        nuovoDen= this.den * frazione.den;
        return new Frazione(nuovoNum,nuovoDen);
    }

    public Frazione dividiFrazione(Frazione frazione){
        if(frazione.num == 0){
            System.out.println("Impossibile dividerlo");
            return new Frazione(0, 1);
        }
        nuovoNum=this.num * frazione.den;
        nuovoDen=this.den * frazione.num;
        return new Frazione(nuovoNum, nuovoDen);
    }

    public Frazione potenzaFrazione(int potenza){
        if(potenza == 0){
            return new Frazione(1, 1);
        }
        int baseNum = this.num;
        int baseDen = this.den;
        int basePotenza = potenza;

    }


}
