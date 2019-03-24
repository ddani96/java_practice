import java.util.Scanner;
public class Faktor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Faktoriális számítás.");
        System.out.print("n= ");
        int n = sc.nextInt();
        int fakt = 1;
        if(n>=0){
            for (i = 1; i <= n; i++){
                fakt *= i;
            }
            System.out.println(n + "!= "+ fakt);
        } else {
                System.out.println(n + " faktoriálisát nem értelmezzük.");
            }

        }

    }

