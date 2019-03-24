public class Main {

    public static void main(String[] args) {
        DiakString jozsi = new DiakString("Nagy József Péter", 1999, 4.5);
        System.out.println(jozsi.getVezetekNev());
       for (String nev : jozsi.getKeresztNevek()) {
            System.out.println(nev);
        }
        String[] ker = {"András", "Leopold"};
        DiakString feri = new DiakString("Kovács", ker, 2000, 4.99);
        System.out.println(feri.getNev());
    }
}
