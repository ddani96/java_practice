import java.util.Scanner;

public class Piramis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, fel = 1;
        System.out.printf("Piramisrajzoló program.\n" + "Mekkora legyen a magassága? n=");
        int n = sc.nextInt();
        int s = n - 1;
        if(n <= 0){
            System.out.println("A magasságnak pozitívnak kell lennie.");
        } else {
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
        }


    }
}
