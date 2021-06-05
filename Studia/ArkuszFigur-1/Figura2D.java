abstract public class Figura2D extends Object implements NarysujSie, Comparable<Figura2D> {

    protected static final String WSTEP_OPISU = "Jest to ";

    public final String opis;

    protected double pole, obwod;

    private static int licznik = 0;

    public Figura2D(String opis){
        this.opis = opis;
        pole = obwod = 0;
        licznik++;
    }

    public static int ileWszystkich() {
        return licznik;
    }

    public final double poleFigury(){
        return pole;
    }

    public final double obwodFigury(){
        return obwod;
    }

    abstract protected void obliczPole();

    abstract protected void obliczObwod();

    protected final void przelicz(){
        obliczObwod();
        obliczPole();
    }

    @Override
    public int compareTo(Figura2D F){
        if(this.pole > F.pole) return 1;
        else if(this.pole< F.pole) return -1;
        else return 0;
    }

}