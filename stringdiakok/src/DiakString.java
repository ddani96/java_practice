import java.util.Arrays;
import java.util.Scanner;

public class DiakString {

    private String nev;
    private int szuletesiEv;
    private double atlag;
    
     

    public DiakString(String nev, int szuletesiEv, double atlag) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.atlag = atlag;
    }

   public DiakString(String vezetekNev, String[] keresztNevek, int szuletesiEv, double atlag) {
        this.nev = vezetekNev;
        for (String kNev : keresztNevek) {
            this.nev += " " + kNev;
        }
        this.szuletesiEv = szuletesiEv;
        this.atlag = atlag;
    }

    public String getNev() {
        return nev;
    }

    public String getVezetekNev() {
        String vezNev="";
        int i;
        if (nev.contains(" ")) {
            int a = nev.indexOf(" ");
            for(i=0; i<a;i++){
                vezNev += nev.charAt(i);
            }
            return vezNev;
        } else {
            return this.nev = vezNev ;
        }

    }


    public String[] getKeresztNevek() {
        if (nev.contains(" ")) {
        String kerNev = nev.substring(nev.indexOf(" ")+1);
        return kerNev.split(" ");
        } else {
           String[] uresKer = {""};
            return uresKer;
        }
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setSzuletesiEv(int szul) {
        this.szuletesiEv = szul;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    public void beolvas(Scanner sc) {
        System.out.println("Kérem a diák nevét!");
        this.nev = sc.nextLine();
        System.out.println("Kérem a diák születési évét!");
        this.szuletesiEv = sc.nextInt();
        System.out.println("Kérem a diák átlagát!");
        this.atlag = sc.nextDouble();
    }

    public void kiir() {
        System.out.println(this.nev + " (" + this.szuletesiEv + "; " + this.atlag + ")");
    }

}
/*package pkg1304;

import java.util.Scanner;

/**
 *
 * @author Pasztuhov Daniel

public class DiakString {
    private String nev;
    private int szuletesiEv;
    private double atlag;

    public DiakString(String nev, int szuletesiEv, double atlag) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.atlag = atlag;
    }

    public DiakString(String vezetekNev, String[] keresztNevek, int szuletesiEv, double atlag) {
        this.nev = vezetekNev;
        for (String kNev : keresztNevek) {
            this.nev += " " + kNev;
        }
        this.szuletesiEv = szuletesiEv;
        this.atlag = atlag;
    }

    public void kiir() {
        System.out.println(nev + " (" + szuletesiEv + "; " + atlag + ")");
    }

    public void beolvas(Scanner sc) {
        System.out.println("Kérem a diák nevét!");
        this.nev = sc.nextLine();
        System.out.println("Kérem a diák születési évét!");
        this.szuletesiEv = sc.nextInt();
        System.out.println("Kérem a diák átlagát!");
        this.atlag = sc.nextDouble();
    }

    public String getVezetekNev() {
        return this.nev.split(" ")[0];
    }

    public String[] getKeresztNevek() {
        String[] darabok = this.nev.split(" ");
        String[] keresztNevek = new String[darabok.length-1];
        for (int i = 0; i < keresztNevek.length; i++) {
            keresztNevek[i] = darabok[i+1];
        }
        return keresztNevek;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public void setSzuletesiEv(int szuletesiEv) {
        this.szuletesiEv = szuletesiEv;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

}*/
