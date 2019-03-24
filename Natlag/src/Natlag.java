import java.util.Scanner;
public class Natlag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int count = 0;
        double ave = 0.0;
        System.out.println("Átlagszámoló.\nHány számot ad be?");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Az \"n\" értékének pozitívnak kell lennie.");
        } else {
            for (i = 1 ; i <= n ; i++){
                System.out.print(i + ". szám: ");
                double number = sc.nextDouble();
                count += number;
            }
            ave = (double)count/n;
            System.out.println("A beírt számok átlaga "+ ave);
        }
    }
}
