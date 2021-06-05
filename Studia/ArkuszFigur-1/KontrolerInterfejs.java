public interface KontrolerInterfejs {
    void wystartuj();

    void akcjaPosortuj();

    void akcjaPrzemieszaj();

    void akcjaSkasuj();

    boolean akcjaZapiszTekstowo(String nazwaPliku);

    boolean akcjaZapiszBinarnie(String nazwaPliku);

    boolean akcjaPrzeczytajBinarnie(String nazwaPliku);

    void ustawStatystyke(String statystyka);
}
