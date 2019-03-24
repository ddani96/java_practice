import java.util.Scanner;

public class MatrixOszlop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int[][] a = {{1, 4, 7, 5, 3},
                {3, 7, 9, 10, 1},
                {4, -3, 2, -4, 1},
                {5, 9, 6, 4, 3},
                {1, 2, 3, 4, 5}};
        System.out.print("Melyik oszlopát szeretnéd kiíratni (0-4)? ");
        int n = sc.nextInt();
        while (!(n >= 0 && n < 5)) {
            System.out.println("Nem jó index.");
            System.out.print("Melyik oszlopát szeretnéd kiíratni (0-4)? ");
            n = sc.nextInt();
        }
        System.out.println("A mátrix " + n + ". indexű oszlopa:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (j == n) {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
