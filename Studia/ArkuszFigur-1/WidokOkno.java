import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WidokOkno extends JFrame implements WidokInterfejs{
    private static String TYTUL_OKNA = "Arkusz Figur";
    private static int SZEROKOSC_OKNA = 800, WYSOKOSC_OKNA = 600;

    private final WidokMenu menu;
    private final JTable tabela;
    private final DefaultTableModel zawartoscTabeli;
    private final WidokKarty karty;

    private KontrolerInterfejs kontroler = null;

    public WidokOkno() {
        super();

        setTitle(TYTUL_OKNA);
        setSize(SZEROKOSC_OKNA, WYSOKOSC_OKNA);

        menu = new WidokMenu();

        zawartoscTabeli = new DefaultTableModel();
        tabela = new JTable(zawartoscTabeli);
        tabela.setEnabled(false);

        karty = new WidokKarty();

        setJMenuBar(menu);
        add(new JScrollPane(tabela), BorderLayout.CENTER);
        add(karty, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        dodajAkcjeMenu();
    }

    private void dodajAkcjeMenu() {
        menu.wyczysc.setEnabled(true);
        menu.wyczysc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                kontroler.akcjaSkasuj();
            }
        });

        menu.sortuj.setEnabled(true);
        menu.sortuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kontroler.akcjaPrzemieszaj();
            }
        });

        menu.przemieszaj.setEnabled(true);
        menu.przemieszaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                kontroler.akcjaPrzemieszaj();
            }
        });

        menu.zamknij.setEnabled(true);
        menu.zamknij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int potwierdzenie = JOptionPane.showConfirmDialog(null, "Zakończyć aplikację?",
                        "Potwierdzenie", JOptionPane.YES_NO_OPTION);
                if (potwierdzenie == 0) {

                    System.exit(0);
                }
            }
        });

        menu.oProgramie.setEnabled(true);
        menu.oProgramie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Aplikacja Arkusz Figur\n" +
                        "ćwiczenie porjektowe \n" +
                        "Programowanie obiektowe w Java");
            }
        });

        menu.zapiszTekstowo.setEnabled(true);
        menu.zapiszTekstowo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean wynik = kontroler.akcjaZapiszTekstowo("figury.txt");
                String info = wynik ? "Zaspisano do pliku tekstowego" : "Bład zapisu do pliku tekstowego";
                JOptionPane.showMessageDialog(null, info);
            }
        });

        menu.zapiszBinarnie.setEnabled(true);
        menu.zapiszBinarnie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean wynik = kontroler.akcjaZapiszBinarnie("Figury.fig");
                String info = wynik ? "Zapisano do pliku binarnego" : "Blad zapisu do pliku binarnego";
                JOptionPane.showMessageDialog(null, info);
            }
        });

        menu.otworz.setEnabled(true);
        menu.otworz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                kontroler.akcjaSkasuj();
                boolean wynik = kontroler.akcjaPrzeczytajBinarnie("figury.fig");
                String info = wynik ? "Odczytano z pliku binarnego" : "Błąd zapisu do pliku";
                JOptionPane.showMessageDialog(null, info);
            }
        });
    }
    @Override
    public void przygotujArkusz(String... naglowki) {
        for(String s : naglowki) {
            zawartoscTabeli.addColumn(s);
        }
    }

    @Override
    public void dodajWiersz(String... dane) {
        zawartoscTabeli.addRow(dane);
    }

    @Override
    public void usunWiersz(int i) {
        zawartoscTabeli.removeRow(i);
    }

    public void podlaczKontroler(KontrolerInterfejs kontroler) {
        this.kontroler = kontroler;
    }

    @Override
    public void ustawStatystyke(String statystyka) {
        karty.statystyka(statystyka);
    }
}
