import java.util.*;

public class KatiKonyvei {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, oldalsz, sum = 0, count = 0, min = 10000;
        double average=0;
        System.out.print("Szia Kati!\nKérlek írd be, hány könyvet szeretnél elolvasni! ");
        n = sc.nextInt();
        if(n <= 0){
            System.out.println("Kati, a projekted biztosan legalább 1 könyvet tartalmaz!");
            System.out.print("Kérlek írd be, hány könyvet szeretnél elolvasni! ");
            n = sc.nextInt();
            for (i = 1; i <= n; i++){
                System.out.print("A(z) " + i + ". könyv hány oldalas? ");
                oldalsz = sc.nextInt();
                sum += oldalsz;
                if(min > oldalsz){
                    min = oldalsz;
                }
                if(oldalsz < 120){
                    count++;
                }

            }
            double hour = (double)sum/20.0;
            System.out.println("Összesen " + sum + " oldalt akarsz elolvasni.");
            System.out.println("A projekt " + String.format("%,.1f",hour) + " óráig fog tartani, és " + String.format("%,.2f",hour/2.5)+ " napot vesz igénybe.");
            System.out.println("A legrövidebb könyv " + min + " oldalas.");
            System.out.println("A könyvek között " + count +  " db. 120 oldalnál rövidebb könyv van.");
        } else {
            for (i = 1; i <= n; i++){
                System.out.print("A(z) " + i + ". könyv hány oldalas? ");
                oldalsz = sc.nextInt();
                sum += oldalsz;
                if(min > oldalsz){
                    min = oldalsz;
                }
                if(oldalsz < 120){
                    count++;
                }

            }
            double hour = (double)sum/20;
            System.out.println("Összesen " + sum + " oldalt akarsz elolvasni.");
            System.out.println("A projekt " + String.format("%,.1f",hour) + " óráig fog tartani, és " + String.format("%,.2f",hour/2.5) + " napot vesz igénybe.");
            System.out.println("A legrövidebb könyv " + min + " oldalas.");
            System.out.println("A könyvek között " + count +  " db. 120 oldalnál rövidebb könyv van.");
        }

    }
}
