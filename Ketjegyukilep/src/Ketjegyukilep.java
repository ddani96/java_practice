import java.util.Scanner;
public class Ketjegyukilep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Írj be számokat! Ha kétjegyű, kilép!");
        int number= 0;
        while(!((number / 10 >= 1) && (number / 10 < 10)) && !((number / -10 >= 1) && (number / -10 < 10))){
            number = sc.nextInt();
            if(((number / 10 >= 1) && (number / 10 < 10)) || ((number / -10 >= 1) && (number / -10 < 10))) {

            }
            else{
                System.out.println("jó szám");
            }

        }
    }
}
