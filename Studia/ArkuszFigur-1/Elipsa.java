public class Elipsa extends Figura2D {
    public static final String opis = "ELIPSA";

    protected double a;
    private double b;

    private static int licznik = 0;

    public Elipsa(double a, double b) {
        super(WSTEP_OPISU + Elipsa.opis);
        this.a = a;
        this.b = b;
        przelicz();
        licznik++;
    }

    protected Elipsa(double r, String pelnaNazwa) {
        super(pelnaNazwa);
        a = b = r;
        przelicz();
    }
    public static int ileWszystkich() {
        return licznik;
    }

    @Override
    protected void obliczPole() {
        pole = Math.PI * a * b;
    }

    @Override
    protected void obliczObwod() {
        obwod = (((3/2)*(a+b)) - Math.sqrt(a*b))*Math.PI;
    }

    @Override
    public String reprezentacjaTekstowa() {
        return "/ \\ \n"
                + "| |\n"
                + "\\ / \n";
    }
    @Override
    public String toString() {
        return opis + String.format(" a=%.3f b=%.3f obwod=%.3f pole=%.3f", a, b, obwod, pole);
    }

    @Override
    public boolean equals(Object o) {
        if(o== this) {
            return true;
        }
        if(!(o instanceof Elipsa)) {
            return false;
        }
        Elipsa e = (Elipsa) o;

        return Double.compare(a, e.a) == 0 && Double.compare(b, e.b) == 0;
    }
}
