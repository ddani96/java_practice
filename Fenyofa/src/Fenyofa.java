import java.util.Scanner;

public class Fenyofa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, l, m, o, koz, fel = 1;
        System.out.println("Fenyőfarajzoló program.");
        System.out.print("Kérem a magasságot: ");
        int n = sc.nextInt();
        int s = n - 1;
        if (n <= 2) {
            System.out.println("A magasság csak 2-nél nagyobb lehet.");
        } else {
            System.out.print("Kérem a szintek számát: ");
            int lvl = sc.nextInt();
            if (lvl <= 0) {
                System.out.println("A szintek száma csak pozitív lehet.");
            } else {
                for( l = 0 ; l < lvl ; l++){
                    for (j = 0; j < n; j++) {
                        for (i = 0; i < s; i++) {
                            System.out.print(" ");
                        }
                        s--;
                        for (k = 0; k < fel; k++) {
                            if (k == fel - 1) {
                                System.out.println("*");
                            } else {
                                System.out.print("*");
                            }

                        }
                        fel += 2;
                    }
                    fel = 1 ;
                    s = n-1 ;
                }

             for(o = 0; o < 3; o++){

                 for(m = 0 ; m < n+1; m++){
                     if(m <= n-3 || m > n ){
                         System.out.print(" ");
                     } else {
                         if(m == n){
                             System.out.println("*");
                         } else {
                             System.out.print("*");
                         }

                     }
             }

            }
            }
        }


    }
}
