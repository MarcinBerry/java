import javax.swing.*;

public class WidokMenu extends JMenuBar {
    private static String PLIK = "Plik",
    PLIK_ZAPISZ_TEKSTOWO = "Zapisz tekstowo...",
    PLIK_ZAPISZ_BINARNIE = "Zapisz binarnie...",
    PLIK_OTWORZ = "Otwórz...",
    PLIK_ZAMKNIJ = "Zamknij";

    private static String EDYCJA = "Edycja",
    EDYCJA_COFNIJ = "Cofnij",
    EDYCJA_PRZYWROC = "Przywróć",
    EDYCJA_WYCZYSC = "Wyczyść";

    private static String NARZEDZIA = "Narzędzia",
    NARZEDZIA_SORTUJ = "Sortuj",
    NARZEDZIA_PRZEMIESZAJ = "Przemieszaj";

    private static String POMOC = "Pomoc",
    POMOC_O_PROGRAMIE = "O programie";

    private final JMenu plik, edycja, narzedzia, pomoc;

    public final JMenuItem //
            zapiszTekstowo, zapiszBinarnie, otworz, zamknij,
        cofnij, przywroc, wyczysc,
        sortuj, przemieszaj,
        oProgramie;

    public WidokMenu() {
        //Plik
        plik = new JMenu(PLIK);
        zapiszTekstowo = new JMenuItem(PLIK_ZAPISZ_TEKSTOWO);
        zapiszBinarnie = new JMenuItem(PLIK_ZAPISZ_BINARNIE);
        otworz = new JMenuItem(PLIK_OTWORZ);
        zamknij = new JMenuItem(PLIK_ZAMKNIJ);
        plik.add(zapiszTekstowo);
        plik.add(zapiszBinarnie);
        plik.add(otworz);
        plik.addSeparator();
        plik.add(zamknij);
        zapiszTekstowo.setEnabled(false);
        zapiszBinarnie.setEnabled(false);
        otworz.setEnabled(false);
        zamknij.setEnabled(false);

        //Edycja
        edycja = new JMenu(EDYCJA);
        cofnij = new JMenuItem(EDYCJA_COFNIJ);
        przywroc = new JMenuItem(EDYCJA_PRZYWROC);
        wyczysc = new JMenuItem(EDYCJA_WYCZYSC);
        edycja.add(cofnij);
        edycja.add(przywroc);
        edycja.addSeparator();
        edycja.add(wyczysc);
        cofnij.setEnabled(false);
        przywroc.setEnabled(false);
        wyczysc.setEnabled(false);

        //Narzedzia
        narzedzia = new JMenu(NARZEDZIA);
        sortuj = new JMenuItem(NARZEDZIA_SORTUJ);
        przemieszaj = new JMenuItem(NARZEDZIA_PRZEMIESZAJ);
        narzedzia.addSeparator();
        narzedzia.add(sortuj);
        narzedzia.add(przemieszaj);
        sortuj.setEnabled(false);
        przemieszaj.setEnabled(false);

        //Pomoc
        pomoc = new JMenu(POMOC);
        oProgramie = new JMenuItem(POMOC_O_PROGRAMIE);
        pomoc.add(oProgramie);
        oProgramie.setEnabled(false);

        //Wstawenie głównych pozycji menu do paska
        add(plik);
        add(edycja);
        add(narzedzia);
        add(pomoc);
    }
}
