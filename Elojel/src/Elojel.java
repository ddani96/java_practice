import java.util.Scanner;
public class Elojel {

    public static int sign(int szam){
        if(szam == 0){
            return 0;
        } else if (szam <0){
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot: ");
        int a = sc.nextInt();
        if(sign(a)== 1){
            System.out.print("A szám signuma: +1" );
        } else{
            System.out.print("A szám signuma: " + sign(a));
        }


    }
}
