package it.scuola.esercizi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Inserisci y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Inserisci x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Inserisci y2: ");
        double y2 = scanner.nextDouble();

        Rettangolo r = new Rettangolo(x1, y1, x2, y2);

        System.out.println("Base: " + r.getBase());
        System.out.println("Altezza: " + r.getAltezza());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimetro: " + r.getPerimetro());

        scanner.close();
    }
}
