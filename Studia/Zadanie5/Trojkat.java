public class Trojkat extends Figura2D {

    public static final String opis = "TROJKAT";

    protected double a,b,c;

    private static int licznik = 0;

    public Trojkat(double a, double b, double c) {
        super(WSTEP_OPISU + Trojkat.opis);
        this.a = a;
        this.b = b;
        this.c = c;
        przelicz();
        licznik++;
    }

    public Trojkat(double a, String pelnaNazwa) {
        super(pelnaNazwa);
        this.a = b = c = a;
        przelicz();
    }

    public static int ileWszystkich() {
        return licznik;
    }

    @Override
    protected final void obliczPole() {
        double p = (a + b + c)/2;
        pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    protected final void obliczObwod() {
        obwod = a + b + c;
    }

    @Override
    public String reprezentacjaTekstowa() {
        return    "   /\\ \n"
                + "  /  \\ \n"
                + " /    \\ \n"
                + "/------\\ \n";
    }

    @Override
    public String toString() {
        return opis + String.format(" a=%.3f b%.3f c%.3f obwod=%.3f pole=%.3f", a, b, c, obwod, pole);
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Trojkat)) {
            return false;
        }
        Trojkat t = (Trojkat) o;

        return Double.compare(a, t.a) == 0 && Double.compare(b, t.b) == 0 && Double.compare(c, t.c) == 0;
    }
}
