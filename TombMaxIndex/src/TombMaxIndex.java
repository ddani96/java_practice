import java.util.Scanner;

public class TombMaxIndex {

    public static int maxIndex(double[] a) {
        int i, maxi = 0;
        double max = -100;
        for (i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxi = i;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a tömb elemszámát: ");
        int i;
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Kérem a tömb elemeit:");
        for (i = 0; i < n; i++){
            double tombe = sc.nextDouble();
            a[i] = tombe;
        }
        System.out.println("A tömb legnagyobb elemének indexe: " + maxIndex(a));
    }
}
