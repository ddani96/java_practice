import java.util.Scanner;
public class Negyzetszamok2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a négyzetszámok határszámát! ");
        int number = sc.nextInt();
        int n = 1;
        while(number >= n*n && number > 0) {
            System.out.print(n*n);
            System.out.print(" ");
            n++;
        }
    }
}
