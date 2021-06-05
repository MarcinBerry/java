import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModelDane implements ModelInterfejs {
    private List<Figura2D> listaFigur = new ArrayList<>();
private static String NAGLOWKI[] = {"OPIS", "POLE", "OBWOD", "SZECZEGOLY"};

    public ModelDane() {
        listaFigur.add(new Prostokat(2,3));
        listaFigur.add(new Kolo(1));
        listaFigur.add(new Prostokat(4,5));
        listaFigur.add(new Kolo(3));
        listaFigur.add(new Kwadrat(6));
        listaFigur.add(new Prostokat(2,2));
    }

    @Override
    public String[] naglowkiKolumn() {
        return NAGLOWKI;
    }

    @Override
    public int ileWierszy() {
        return listaFigur.size();
    }

    @Override
    public String[] pobierzWiersz(int i) {
        Figura2D figura = listaFigur.get(i);
        return new String[] {
                figura.opis,
                String.format("%.3f", figura.poleFigury()),
                String.format("%.3f", figura.obwodFigury()),
                "Jeszcze nie zaimplementowane"
        };
    }

    @Override
    public void posortuj() {
        Collections.sort(listaFigur);
    }

    @Override
    public void przemieszaj() {
        Collections.shuffle(listaFigur);
    }

    @Override
    public void skasujWiersz(int i) {
        listaFigur.remove(i);
    }

    @Override
    public Figura2D pobierzFigure(int i) {
        return listaFigur.get(i);
    }

    @Override
    public void dodajFigure(Figura2D figura2D) {
        listaFigur.add(figura2D);
    }

    @Override
    public String podajStatystyke() {

        int liczbaProstokatow = 0, liczbaKwadratow = 0, liczbaKol = 0;
        float sumaPol = 0;

        for (Figura2D figura : listaFigur) {
            sumaPol += figura.pole;
            if (figura instanceof Prostokat) {
                liczbaProstokatow++;
            }
            if (figura instanceof Kwadrat) {
                liczbaKwadratow++;
            }
            if (figura instanceof Kolo) {
                liczbaKol++;
            }
        }

        String info = "Statytyka figur:\n"
                + " wszystkich figur jest " + listaFigur.size() + "\n"
                + " suma pol tych figur wynosi " + sumaPol +"\n"
                + " prostokatow jest " + liczbaProstokatow + "\n"
                + " kwadratow jest " + liczbaKwadratow + "\n"
                + " kol jest " + liczbaKol + "\n";

        return info;
    }
}
