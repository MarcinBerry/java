import javax.swing.*;
import java.io.*;

public class Kontroler implements KontrolerInterfejs {
    private ModelInterfejs model = null;
    private WidokInterfejs widok = null;

    public void podlaczModel(ModelInterfejs model) {
        this.model = model;
    }

    public void podlaczWidok(WidokInterfejs widok) {
        this.widok = widok;
    }

    private void wyczyscWidok() {
        for (int i = 0; i < model.ileWierszy(); i++) {
            widok.usunWiersz(0);
        }
        widok.ustawStatystyke(model.podajStatystyke());
    }

    private void wypelnijWidok() {
        for (int i = 0; i < model.ileWierszy(); i++) {
            widok.dodajWiersz(model.pobierzWiersz(i));
        }
        widok.ustawStatystyke(model.podajStatystyke());
    }

    private void odswierzWidok() {
        wyczyscWidok();
        wypelnijWidok();
    }
    @Override
    public void wystartuj() {
        widok.przygotujArkusz(model.naglowkiKolumn());
        wypelnijWidok();
    }

    @Override
    public void akcjaPosortuj() {
        model.posortuj();
        odswierzWidok();
    }

    @Override
    public void akcjaPrzemieszaj() {
        model.przemieszaj();
        odswierzWidok();
    }

    @Override
    public void akcjaSkasuj() {
        wyczyscWidok();
        while(model.ileWierszy() > 0)
            model.skasujWiersz(0);
        wypelnijWidok();
    }

    @Override
    public boolean akcjaZapiszTekstowo(String nazwaPliku) {
        try {
            JFileChooser fileChooser = new JFileChooser();
            FileWriter w = new FileWriter(nazwaPliku);
            int jf = fileChooser.showOpenDialog(null);
            if(jf == JFileChooser.APPROVE_OPTION)
                w = new FileWriter(fileChooser.getSelectedFile());
            BufferedWriter bw = new BufferedWriter(w);
            for(int i = 0; i < model.ileWierszy(); i++) {
                bw.write(model.pobierzFigure(i).toString() + '\n');
            }
            bw.close();
            return true;
        } catch(IOException ex) {
            return false;
        }
    }

    @Override
    public boolean akcjaZapiszBinarnie(String nazwaPliku) {
        try {
            JFileChooser fileChooser = new JFileChooser();
            FileOutputStream strumienPlikowy = new FileOutputStream(nazwaPliku);
            int jf = fileChooser.showOpenDialog(null);
            if(jf == JFileChooser.APPROVE_OPTION)
                strumienPlikowy = new FileOutputStream(fileChooser.getSelectedFile());
            ObjectOutputStream strumienObiektowy = new ObjectOutputStream(strumienPlikowy);
            for(int i = 0; i < model.ileWierszy(); i++)
                strumienObiektowy.writeObject(model.pobierzFigure(i));
            strumienObiektowy.writeObject(null);
            strumienObiektowy.close();
            strumienPlikowy.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println("!Blad strumienia plikowego");
            return false;
        } catch (IOException ex) {
            System.out.println("Blad strumienia obiektowego");
            return false;
        }
    }

    @Override
    public boolean akcjaPrzeczytajBinarnie(String nazwaPliku) {
        try {
            JFileChooser fileChooser = new JFileChooser();
            int i = fileChooser.showOpenDialog(null);
            FileInputStream strumienPlikowy;
            if(i == JFileChooser.APPROVE_OPTION)
                strumienPlikowy = new FileInputStream(fileChooser.getSelectedFile());

            strumienPlikowy = new FileInputStream(nazwaPliku);
            ObjectInputStream strumienObiektowy = new ObjectInputStream(strumienPlikowy);
            Object obiektZpliku;
            while ((obiektZpliku = strumienObiektowy.readObject()) != null) {
                wyczyscWidok();
                model.dodajFigure((Figura2D) obiektZpliku);
                wypelnijWidok();
            }
            strumienObiektowy.close();
            strumienPlikowy.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println("!Blad strumienia plikowego");
            return false;
        } catch (IOException ex) {
            System.out.println("!Błąd strumienia obiektowgo");
            return false;
        } catch (ClassNotFoundException ex) {
            System.out.println("!Błąd konwersji do docelowego typu");
            return false;
        }
    }

    @Override
    public void ustawStatystyke(String statystyka) {

    }

}
