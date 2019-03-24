import java.util.Scanner;
public class Szamosszeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a számokat (-1-re kilép):");
        int szam = 0;
        int osszeg = 0;
        int kilep = -1;
        while(szam != kilep){
            szam = sc.nextInt();
            if(szam == -1){

            } else {
                osszeg = osszeg + szam;
            }

        }
        System.out.println("Az összeg: " + osszeg + ".");

    }
}
