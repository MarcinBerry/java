public class Kolo extends Elipsa {

    public static final String opis = "KOLO";

    private double r;

    private static int licznik = 0;

    public Kolo(double r) {
        super(r, WSTEP_OPISU + Kolo.opis);
        licznik++;
    }

    public static int ileWszystkich() {
        return licznik;
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
}