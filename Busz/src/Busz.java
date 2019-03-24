import java.util.Scanner;
public class Busz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0, minus = 0, minusmini = 1, minusmin = 40, negyedik = 0, summa, max = 0, maxi = 0, count =1;
        System.out.print("Kérem a(z) 1. megállónál felszálló utasok számát! ");
        int plus = sc.nextInt();
        minusmin= plus;
        if (plus > 40) {
            System.out.print("Túl sok utas a(z) 1. megállónál.");
        } else {
            sum += plus;
            summa = sum;
            for (i = 2; i < 6; i++) {
                if (i != 5) {

                    System.out.print("Kérem a(z) " + i + ". megállónál leszálló utasok számát! ");
                    minus = sc.nextInt();
                    count++;
                    sum -= minus;
                    System.out.print("Kérem a(z) " + i + ". megállónál felszálló utasok számát! ");
                    plus = sc.nextInt();
                    sum += plus;
                    if (sum > 40) {
                        System.out.print("Túl sok utas a(z) " + i + ". megállónál.");
                        break;
                    }
                    if (sum < 0) {
                        System.out.print("Negatív utasszám a(z) " + i + ". megállónál.");
                        break;
                    }   else {

                            if (plus < minusmin) {
                                minusmin = plus;
                                minusmini = i;
                            }
                            if (i == 4) {
                                negyedik = sum;
                            }
                            if (sum > max) {
                                max = sum;
                                maxi = i;
                            }
                            summa += sum;
                            }
                }
                    else{
                        System.out.print("Kérem a(z) " + i + ". megállónál leszálló utasok számát! ");
                        minus = sc.nextInt();
                        sum -= minus;
                        if(sum > 0){
                            System.out.println("Fennmaradó utas a végállomás után.");
                        }

                    }
                }
                if(sum < 0 && count <5 || sum > 0){
                    System.out.println();
                } else{
                    double average = (double) summa / 4;
                    System.out.println("A 4. megálló elhagyása után " + negyedik + " utas volt a buszon.");
                    System.out.println("Az adatok helyesek.");
                    System.out.println("A(z) " + minusmini + ". megállónál volt a legkevesebb a felszállók száma: " + minusmin + " utas.");
                    System.out.println("A buszon átlagosan " + average + " utas tartózkodott.");
                    System.out.println("A legtöbb utas a(z) " + maxi + ". megálló után volt: " + max);
                }

    }
}

}