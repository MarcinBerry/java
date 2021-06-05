public class Main {
    public static void main(final String[] args) {
        (new AppGUI()).wystartuj();
    }
}

class AppGUI {
    private final WidokOkno widok;
    private final ModelDane model;
    private final Kontroler kontroler;

    public AppGUI() {
        widok = new WidokOkno();
        model = new ModelDane();
        kontroler = new Kontroler();

        kontroler.podlaczModel(model);
        kontroler.podlaczWidok(widok);
        widok.podlaczKontroler(kontroler);
    }

    public void wystartuj() {
        kontroler.wystartuj();
    }
}
