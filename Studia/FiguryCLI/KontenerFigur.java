import java.util.List;
import java.util.ArrayList;

public class KontenerFigur {

    private List<Figura2D> listaFigur = new ArrayList<Figura2D>();

    private void utworzFigury() {

        listaFigur.add(new Prostokat(2, 3));
        listaFigur.add(new Kolo(1));
        listaFigur.add(new Prostokat(4, 5));
        listaFigur.add(new Kolo(3));
        listaFigur.add(new Kwadrat(6));
        listaFigur.add(new Prostokat(2, 2));
    }

    private void podajStatystyke() {
        System.out.println("\nStatystyka figur");
        System.out.println("Liczba prostokatow :" + Prostokat.ileWszystkich());
        System.out.println("Liczba kwadratow   :" + Kwadrat.ileWszystkich());
        System.out.println("Liczba kol         :" + Kolo.ileWszystkich());
        System.out.println("Liczba figur       :" + Figura2D.ileWszystkich());
    }

    private void wypiszFigury() {
        System.out.println("\nLista figur");

        for (Figura2D f : listaFigur) {
            System.out.println(f);
        }
    }

    private void narysujFiguryTekstowo() {
        System.out.println("\nSymbole tekstowe figur");

        for (Figura2D f : listaFigur) {
            System.out.println(f.reprezentacjaTekstowa());
        }

    }

    public void run() {

        KontenerFigur test = new KontenerFigur();
        test.utworzFigury();
        test.podajStatystyke();
        test.wypiszFigury();
        test.narysujFiguryTekstowo();

    }
}