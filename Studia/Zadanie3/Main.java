class Main {
  public static void main(String[] args) {
     FabrykaTekstu2 state = new FabrykaTekstu2();
        state.setTekst("state1");
        System.out.println("Stan przed zapisem: " + state.getTekst());

        System.out.println("Zapisywanie stanu.");
        state.saveState(state);

        System.out.println("Zamiana stanu na: state2");
        state.setTekst("state2");

        System.out.println("Stan przed przywróceniem: " + state.getTekst());

        System.out.println("Przywracanie stanu.");
        state = state.getState();

        System.out.println("Stan po przywróceniu: " + state.getTekst());
  }
}
class FabrykaTekstu2 implements Cloneable {
    private FabrykaTekstu2 oldState;
    private String tekst;

    public void saveState(FabrykaTekstu2 objectToSave) {
        try {
            oldState = (FabrykaTekstu2) objectToSave.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public FabrykaTekstu2 getState() {
        return oldState;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}