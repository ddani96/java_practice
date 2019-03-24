import java.util.Scanner;
public class TelefonDij {

    public static int callCost(int a,int b, int c, int d){
        if(c > 0 ){
            c = 1;
        }
        return 60*a*d + b*d + c*d;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Meddig tartott a hívás? ");
        System.out.print("óra: ");
        int a = sc.nextInt();
        System.out.print("perc: ");
        int b = sc.nextInt();
        System.out.print("másodperc: ");
        int c = sc.nextInt();
        System.out.print("Mennyi a percdíj? ");
        int d = sc.nextInt();
        System.out.println("A hívás díja: " + callCost(a,b,c,d) + " Ft volt.");

    }
}
