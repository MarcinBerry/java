public class Kolo extends Figura2D {

    public static final String opis = "KOLO";

    private double r;

    private static int licznik = 0;

    public Kolo(double r) {
        super(WSTEP_OPISU + Kolo.opis);
        this.r = r;
        przelicz();
        licznik++;
    }

    public static int ileWszystkich() {
        return licznik;
    }

    @Override
    protected void obliczPole() {
        pole = Math.PI * Math.pow(r, 2);
    }

    @Override
    protected void obliczObwod() {
        obwod = 2 * Math.PI * r;
    }

    @Override
    public String reprezentacjaTekstowa() {
        return "/  \\ \n"
                + "\\  / \n";
    }

    @Override
    public String toString() {
        return opis + String.format(" f=%.3f obwod=%.3f pole=%.3f", r, obwod, pole);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Kolo)) {
            return false;
        }

        Kolo k = (Kolo) o;

        return Double.compare(r, k.r) == 0 ;
    }

}