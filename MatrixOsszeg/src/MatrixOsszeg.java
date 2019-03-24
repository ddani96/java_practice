import java.util.Scanner;
public class MatrixOsszeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j;
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        System.out.println("Kérem az első mátrix elemeit:");
        for(i = 0; i<2; i++){
            for(j =0 ; j<2 ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Kérem a második mátrix elemeit:");
        for(i = 0; i<2; i++){
            for(j =0 ; j<2 ; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Az eredmény:");
        for(i = 0 ; i< 2 ; i++){
            for( j=0 ; j<2 ; j++){
                if(i != 1 || i==1 && j==1){
                    if(j < 1 ){
                        System.out.print((c[i][j] = a[i][j] + b[i][j]) + " ");
                    } else {
                        System.out.print((c[i][j] = a[i][j] + b[i][j]));
                    }

                }else {
                    System.out.println();
                    if(j < 1 ){
                        System.out.print((c[i][j] = a[i][j] + b[i][j]) + " ");
                    } else {
                        System.out.print((c[i][j] = a[i][j] + b[i][j]));
                    }
                }

            }
        }
    }
}
