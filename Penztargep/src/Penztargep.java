import java.util.Scanner;
public class Penztargep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, min = 0 ,max = 0;
        double average = 0, maximum = 0;
        System.out.println("Pénztárgép program. Kérem a tételeket, a vége 0.");
        double number = sc.nextDouble();
        while( number != 0){
                sum += number;
                count++;
            if(number < 500){
                min++;
            }
                number = sc.nextDouble();
                if(number > max){
                    max = (int)number;
                }
        }

        average = (double) sum / count;
        Math.round(average);
        maximum = (( max / average ) - 1) *100;
        Math.round(maximum);
        System.out.println("Összesen " + sum + " Ft.");
        System.out.printf("Átlag %.2f Ft.\n", average);
        System.out.println("Legdrágább " + max + " Ft.");
        System.out.printf("A legdrágább %.2f%%-kal volt drágább az átlagnál.\n", maximum);
        System.out.println("Összesen " + min + " db. 500 Ft-nál olcsóbb termék volt az áruk közt.");
    }
}
