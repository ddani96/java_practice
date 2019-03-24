import java.util.Scanner;

import static java.lang.Math.*;

public class Szamatlag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a számokat (-1-re kilép):");
        int number = sc.nextInt();
        int a = 2;
        double sum = 0;
        int count = 1;
        double ave = 0.0;
        double roundOff = 0;
        if(number == -1){
            System.out.println("Az átlag: NaN");
        } else {
            sum = number;
            number = 0;
            while(number != -1){
                number = sc.nextInt();
                if(number == -1){
                }else{
                    sum = sum + number;
                    count++;
                }
                ave = sum/(double)count;
                roundOff = Math.round(ave*100.00)/100.00;
            }
            System.out.printf("Az átlag: %.2f\n" , ave);
            System.out.println("A másik: " + roundOff);
        }

    }
}
