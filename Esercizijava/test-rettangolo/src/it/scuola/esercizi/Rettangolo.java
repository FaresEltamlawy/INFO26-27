package it.scuola.esercizi;

public class Rettangolo {
    private double x1 , y1, x2, y2;

    public Rettangolo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getBase(){
        return Math.abs(x2-x1);
    }

  public double getAltezza(){
        return Math.abs(y2-y1);
  }

  public double getArea(){
        return getBase() * getAltezza();
  }

  public double getPerimetro(){
      return 2 * (getBase() + getAltezza());
  }


}
