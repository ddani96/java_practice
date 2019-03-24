import java.util.Scanner;
import static java.lang.Math.round;

public class Homerseklet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , number , minus = 0 , sum = 0, plus = 0, max= -100 , max1= 0;
        for( i = 1 ; i <=7 ; i++ ){
            System.out.print("Kérem a(z) " + i + ". nap középhőmérsékletét: ");
            number = sc.nextInt();
            if(number < 0){
                minus++;
            } else if(number > 25){
                plus++;
            }
            sum += number;
            if(number > max){
                max = number;
                max1 = i;
            }
        }
        if(minus > 0){
            System.out.println("Volt 0 fok alatti középhőmérsékletű nap.");
        } else {
            System.out.println("Nem volt 0 fok alatti középhőmérsékletű nap.");
        }
        double average = (double)sum / 7;
        average = Math.round(average * 100.00) / 100.00;;
        System.out.println("A heti átlaghőmérséklet " + String.format("%,.2f", average) + " fok volt.");
        System.out.println("A héten " + plus + " olyan nap volt, amikor 25 foknál melegebb volt.");
        System.out.println("A legmelegebb nap a(z) " + max1 + ". volt, amikor " + max + " fok volt.");

    }
}
