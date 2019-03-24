import java.util.Scanner;
public class Csillagrajz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány csillagot rajzoljak? ");
        int number = sc.nextInt();
        int count = 0;
        while(number != count && number>0 ) {
            if(number < 0){
                System.out.print("Hány csillagot rajzoljak? ");
                number = sc.nextInt();
            } else {
                System.out.print("*");
                count++;
            }

        }
    }
}
