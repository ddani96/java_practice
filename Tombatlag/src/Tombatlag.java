import java.util.Scanner;
public class Tombatlag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány szám lesz? ");
        double[] tomb = new double[100];
        int i,j;
        double sum = 0 , average;
        int n = sc.nextInt();
        while( n < 0 ){
            System.out.println("A számok darabszáma negatív.");
            System.out.print("Hány szám lesz? ");
            n = sc.nextInt();
        }
        if( n == 0){
        } else {
            System.out.println("Kérem írja be a számokat:");
            for( i = 0 ; i < n ; i++){
                double beker = sc.nextDouble();
                tomb[i] = beker;
                sum += beker;
            }
            average = sum / n;
            System.out.println("Az átlag feletti számok:");
            for(j = 0 ; j <tomb.length ; j++){
                if(tomb[j] > average){
                    System.out.print(tomb[j] + " ");
                }
            }
        }
    }
}
