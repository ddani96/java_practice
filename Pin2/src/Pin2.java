import java.util.Scanner;

public class Pin2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int pin = 0;
            int db = 1;
            while(db < 4){
                System.out.print("PIN: ");
                pin = sc.nextInt();
                if(pin == 5936){
                    db = 10;

                } else {
                    System.out.println("Hibás PIN.");
                    db++;
                }
            }
            if(pin != 5936) {
                System.out.println("Nincs több próbálkozási lehetőség!");
            } else {
                System.out.println("Titkos információ");
            }
        }
    }

