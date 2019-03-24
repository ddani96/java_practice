import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A Fibonacci-számsorozatot meddig írjam ki? ");
        int number = sc.nextInt();
        int sum = 0;
        int a=1;
        int b=1;
        int db = 0;
        if(number < 0){

        }else {
            while(number >= sum) {
                if(db<2 && number > 1){
                    System.out.print(a + " ");
                    db++;
                }else{
                    sum = a+b;
                    b=a;
                    a= sum;
                    if(number > sum){
                        System.out.print(sum + " ");
                    }else{
                        sum = number +1;
                    }
                }




            }
        }

    }
}
