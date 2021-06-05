public class Prostokat extends Figura2D {

    public static final String opis = "PROSTOKAT";

    protected double a;
    private double b;

    private static int licznik = 0;

    public Prostokat(double bok1, double bok2) {
        super(WSTEP_OPISU + Prostokat.opis);
        a = bok1;
        b = bok2;
        przelicz();
        licznik++;
    }

    protected Prostokat(double bok, String pelnaNazwa) {
        super(pelnaNazwa);
        a = b = bok;
        przelicz();
    }

    public static int ileWszystkich() {
        return licznik;
    }

    @Override
    protected final void obliczPole() {
        pole = a * b;
    }

    @Override
    protected final void obliczObwod() {
        obwod = 2 * (a + b);
    }

    @Override
    public String reprezentacjaTekstowa() {
        return "|------|\n"
                + "|      |\n"
                + "|------|\n";
    }

    @Override
    public String toString() {
        return opis + String.format(" a=%.3f b%.3f obwod=%.3f pole=%.3f", a, b, obwod, pole);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Prostokat)) {
            return false;
        }
        Prostokat p = (Prostokat) o;

        return Double.compare(a, p.a) == 0 && Double.compare(b, p.b) == 0;
    }

}