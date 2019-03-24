public class Ember {
    String nev;
    int kilogramm;
    double alkoholGramm;

    public void megiszik(Ital ital) {
        alkoholGramm += ital.getAlkoholGramm();
    }

    public void pihen(double ora) {
        alkoholGramm -= ora * 9;
        if (alkoholGramm <= 0) {
            alkoholGramm = 0;
        }
    }

    public double veralkoholEzrelek(){
            return alkoholGramm/kilogramm;
    }

    public double getJozanIdo(){
        return alkoholGramm / 9;
    }
}
