public interface ModelInterfejs {
    String[] naglowkiKolumn();

    int ileWierszy();

    String[] pobierzWiersz(int i);

    void posortuj();

    void przemieszaj();

    void skasujWiersz(int i);

    Figura2D pobierzFigure(int i);

    void dodajFigure(Figura2D figura2D);

    public String podajStatystyke();
}
