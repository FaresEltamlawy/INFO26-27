//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("==QUIZ==");


        Risposta[] opzioniD1= {
                new Risposta("Zurigo", false), new Risposta("Berna", true),
                new Risposta("Basilea", false), new Risposta("Gievra", false)
        };

        Domanda d1 = new Domanda("Capitale della svizzera?", opzioniD1);
        d1.setValore(2);

        System.out.println("--Domanda--");
        System.out.println(d1);
        System.out.println();
    }
}