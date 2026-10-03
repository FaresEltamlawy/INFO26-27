import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Playlist pl = new Playlist();


        int scelta;


        do{
            System.out.println("\n--- MENU ---");
            System.out.println("1) Crea playlist");
            System.out.println("2) ");
            System.out.println("3) ");
            System.out.println("4) ");
            System.out.println("5) ");
            System.out.println("6) ");
            System.out.println("7) ");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();




        }while(scelta !=7);

            switch(scelta){
                case 1:
                    System.out.println("\nInserisci nome della playlist:");


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;


            }
    }
}