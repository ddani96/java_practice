import java.util.Scanner;
public class Prim {

    public static boolean isPrime(int a){
        int i,count=0;
        for(i = 2 ; i < a ; i++){
            if( a%i == 0){
                count++;
            }
        }
        if(count < 1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot, amiről el kell döntenem, hogy prím-e: ");
        int a = sc.nextInt();
        if(isPrime(a) == true){
            System.out.println("A szám prím.");
        } else {
            System.out.println("A szám nem prím.");
        }
    }
}
