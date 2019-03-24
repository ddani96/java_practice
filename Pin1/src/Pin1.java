import java.util.Scanner;

public class Pin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PIN: ");
        int pin = sc.nextInt();
        while(pin != 5936){
            System.out.println("Hibás PIN.");
            System.out.print("PIN: ");
            pin = sc.nextInt();
        }
        System.out.println("Titkos információ");
    }
}
