import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
      int [] v = new int[10];
       int n;


       do{
           System.out.println("Quanti elementi vuoi (parte da 0 e va  al massimo a 10)");
           n = sc.nextInt();

       }while(n<1 && n>10);


       for(int i=0 ; i <= n; i++ ){

           System.out.println("Inserisci il valor" + (i + 1) + ":");
           v[i] = sc.nextInt();
       }

       int pari = 0;
       int dispari = 0;
       for(int i = 0; i< n; i++){
           if(v[i] % 2 == 0){
               pari++;
           }
           dispari++;
       }

        System.out.println("Gli elementi pari nel vettore sono: " + pari );
        System.out.println("Gli elementi dispari nel vettore sono " + dispari);
       for(int i=0; i <n; i++){
           if(v[i] % 2 == 0){
               System.out.println("Elementi pari:" + v[i] + " ");
           }
           else{
               System.out.println("Elementi dispari" +  v[i]);
           }
       }



    }
}