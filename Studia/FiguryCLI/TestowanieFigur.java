public class TestowanieFigur {

    Figura2D f0, f1, f2, f3, f4, f5;

    private void utworzFigury(){
        f0 = new Prostokat(2,3);
        f1 = new Kolo(1);
        f2 = new Prostokat(4,5);
        f3 = new Kolo(3);
        f4 = new Kwadrat(6);
        f5 = new Prostokat(2,2);
    }

    private void podajStatystyke(){
        System.out.println("\nStatystyka figur");
        System.out.println("Liczba prostokatow :" + Prostokat.ileWszystkich());
        System.out.println("Liczba kwadratow   :" + Kwadrat.ileWszystkich());
        System.out.println("Liczba kol         :" + Kolo.ileWszystkich());
        System.out.println("Liczba figur       :" + Figura2D.ileWszystkich());
    }

    private void wypiszFigury(){
        System.out.println("\nLista figur");
        System.out.println(f0);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
    }

    private void narysujFiguryTekstowo(){
        System.out.println("\nSymbole tekstowe figur");
        System.out.println(f0.reprezentacjaTekstowa());
        System.out.println(f1.reprezentacjaTekstowa());
        System.out.println(f2.reprezentacjaTekstowa());
        System.out.println(f3.reprezentacjaTekstowa());
        System.out.println(f4.reprezentacjaTekstowa());
        System.out.println(f5.reprezentacjaTekstowa());

    }

    public void run(){

        TestowanieFigur test = new TestowanieFigur();
        test.utworzFigury();
        test.podajStatystyke();
        test.wypiszFigury();
        test.narysujFiguryTekstowo();

    }

}