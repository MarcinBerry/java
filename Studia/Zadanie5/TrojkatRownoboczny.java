public class TrojkatRownoboczny extends Trojkat {

    public static final String opis = "TROJKAT ROWNOBOCZNY";

    private static int licznik = 0;

    public TrojkatRownoboczny(double a) {
        super(a, WSTEP_OPISU + opis);
        licznik++;
    }

    public static int ileWszystkich() {
        return licznik;
    }

    @Override
    public String reprezentacjaTekstowa() {
        return   "  /\\ \n"
                +" /  \\ \n"
                +"/----\\ \n";
    }

    @Override
    public String toString() {
        return opis + String.format(" a=%.3f obwod=%.3f pole=%.3f", a, obwod, pole);
    }
}
