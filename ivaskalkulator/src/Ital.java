public class Ital {
    String nev;
    int ml;
    double szazalek;

    public double getAlkoholGramm( ){
        return 0.8*ml*szazalek/100.0;
    }
}
