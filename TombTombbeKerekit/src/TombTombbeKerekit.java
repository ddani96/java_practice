import java.util.Scanner;
public class TombTombbeKerekit {

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


   /* public static int[] roundNew(int[] numbers){
       int i, n=numbers.length;
       int[] b = new int [n];
       return b;
    }

    public static void roundSelf(int[] numbers){
        int i,j;
        int [] c = roundNew(numbers);
        for(i= 0; i < numbers.length; i++){
            c[i] = round(numbers[i]);
            System.out.println(c[i]);
        }
    }*/

    public static void roundSelf(int[] numbers){
        int i;
        for(i = 0; i< numbers.length;i++){
            numbers[i] = round(numbers[i]);
        }
    }

    public static int[] roundNew(int[] numbers){
        int i, n=numbers.length;
        int[] b = new int [n];
        roundSelf(numbers);
        for(i = 0; i< b.length; i++){
            b[i] = numbers[i];
        }
        return b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Kérem az összegek számát: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Kérem az összegeket: ");
        for(i = 0; i <n ; i++){
            int tombe = sc.nextInt();
            a[i] = tombe;
        }
        System.out.println("Kerekítve: ");
        int[] c = roundNew(a);
        for(i = 0; i < n ; i++){
            System.out.println(c[i]);
        }


    }
}
