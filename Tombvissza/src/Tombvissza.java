import java.util.Scanner;
public class Tombvissza {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        double[] tomb = new double[100];
        System.out.print("Hány szám lesz? ");
        int n = sc.nextInt();
        while(n < 0) {

                System.out.println("A számok darabszáma negatív.");
                System.out.print("Hány szám lesz? ");

            n = sc.nextInt();
        }
        if(n == 0){
        }else {
            System.out.println("Kérem írja be a számokat:");
            for(i = 0 ; i < n ; i++){
                double beker = sc.nextDouble();
                tomb[i]=beker;
            }
            System.out.println("A számok fordított sorrendben:");
            for(j = n - 1  ; j > -1; j--){

                System.out.print((double)tomb[j] + " ");
            }


        }


    }
}
