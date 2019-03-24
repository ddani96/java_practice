import java.util.Scanner;
public class Nszorzat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Szorzatszámoló.");
        System.out.println("Hány számot ad be?");
        int n = sc.nextInt();
        int szorzat = 1;
        if(n > 0){
            for (i =1 ; i<=n ; i++){
                System.out.print(i + ". szám: ");
                int number = sc.nextInt();
                szorzat *= number;

            }
            System.out.println("A beírt számok szorzata " + szorzat);
        } else {
            System.out.println("Az 'n' értékének pozitívnak kell lennie.");
        }
    }


}
