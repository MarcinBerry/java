import javax.swing.*;
import java.awt.*;

public class WidokKarty extends JTabbedPane {

    //Dwie karty komponentu
    private final JTextPane zakladkaStatystyka = new JTextPane();
    private final JPanel zakladkaDodawanie = new JPanel();

    //Kartę dodawania należy zamotnować z innych komponnetów
    //Kolumna 1: wybór figut z listy
    private static final String[] RODZAJE = {"Prostokat", "Kwadrat", "Koło"};
    private final JComboBox rodzaj = new JComboBox(RODZAJE);
    //Kolumna 2: dane geometryczne
    private final JLabel etykieta1 = new JLabel("Bok1 ", SwingConstants.RIGHT);
    private final JLabel etykieta2 = new JLabel("Bok2 ", SwingConstants.RIGHT);
    private final JLabel etykieta3 = new JLabel("Bok3 ", SwingConstants.RIGHT);
    private final JTextField bok1 = new JTextField();
    private final JTextField bok2 = new JTextField();
    private final JTextField bok3 = new JTextField();
    private final Dimension rozmiarEdycji = new Dimension(100, 25);
    //Kolumna 3: przycisk do wprowadzania
    private final JButton przycisk = new JButton("Dodaj");

    public WidokKarty() {
        super();

        //Kolumna 2 - organizacja elementów w 1 grupę
        bok1.setPreferredSize(rozmiarEdycji);
        bok2.setPreferredSize(rozmiarEdycji);
        bok3.setPreferredSize(rozmiarEdycji);
        JPanel kolumna2 = new JPanel();
        kolumna2.add(etykieta1);
        kolumna2.add(bok1);
        kolumna2.add(etykieta2);
        kolumna2.add(bok2);
        kolumna2.add(etykieta3);
        kolumna2.add(bok3);
        kolumna2.setLayout(new GridLayout(3,2));

        //Dodanie 3 kolum do zakładki
        zakladkaDodawanie.add(rodzaj);
        zakladkaDodawanie.add(kolumna2);
        zakladkaDodawanie.add(przycisk);
        zakladkaDodawanie.setLayout(new FlowLayout(FlowLayout.LEFT));

        //Dodanie zakladek do komponentu
        this.addTab("Statystyka", zakladkaStatystyka);
        this.addTab("Dodawanie figur", zakladkaDodawanie);
    }

    public void statystyka(String info){
        zakladkaStatystyka.setText(info);
    }
}
