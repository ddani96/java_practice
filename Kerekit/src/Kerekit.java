import java.util.Scanner;
public class Kerekit {

    public static int round(int osszeg){
        int a = osszeg%5,b=0;
        if(a==0){
            b =osszeg;
        } else if( a <= 2){
            b = osszeg - a;
        } else if( a <= 4) {
            b = osszeg + 5 - a;
        }
        return b;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az összeget: ");
        int a= sc.nextInt();
        System.out.print("Kerekítve: ");
        System.out.println(round(a));

    }
}
