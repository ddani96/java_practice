import java.util.Scanner;

public class ItalVezerlo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Ember feri = new Ember();
        feri.nev = "Feri";
        feri.kilogramm = 98;
        Ital palinka = new Ital();
        palinka.ml = 50;
        palinka.szazalek = 50;
        System.out.println(palinka.getAlkoholGramm());
        feri.megiszik(palinka);
        System.out.println(feri.veralkoholEzrelek());
        System.out.println(feri.getJozanIdo());
        feri.pihen(9.3);
        System.out.println(feri.veralkoholEzrelek());
        System.out.println(feri.getJozanIdo());*/
        int step;

        Ember valaki = new Ember();
        System.out.print("Hogy hívnak? ");
        valaki.nev = sc.nextLine();
        System.out.print("Hány kiló vagy? ");
        valaki.kilogramm = sc.nextInt();
        Ital pia = new Ital();
        double piheno;
        int count = 0;
        do{

            System.out.println("Mit csinálsz?");
            System.out.println("1 - iszol");
            System.out.println("2 - pihensz");
            System.out.println("3 - kilépsz");
            step = sc.nextInt();
            if(step == 1){
                System.out.print("Mit iszol? ");
                pia.nev = sc.next();
                System.out.print("Hány százalékos alkoholtartalmú? ");
                pia.szazalek = sc.nextDouble();
                System.out.print("Mennyit iszol belőle? ");
                pia.ml = sc.nextInt();
                valaki.megiszik(pia);
                System.out.print(valaki.nev+" véralkoholszintje: ");
                System.out.printf("%.2f gramm, azaz %.2f ezrelék.%n",valaki.alkoholGramm, valaki.veralkoholEzrelek());
                } else if(step == 2){
                System.out.print("Mennyit pihensz? ");
                piheno = sc.nextDouble();
                valaki.pihen(piheno);
                System.out.print(valaki.nev+" véralkoholszintje: ");
                System.out.printf("%.2f gramm, azaz %.2f ezrelék.%n",valaki.alkoholGramm, valaki.veralkoholEzrelek());

                } else if(step == 3){
                System.out.print(valaki.nev+" véralkoholszintje: ");
                System.out.printf("%.2f gramm, azaz %.2f ezrelék.%n",valaki.alkoholGramm, valaki.veralkoholEzrelek());
                }
        }while(step!=3);
    }
}
