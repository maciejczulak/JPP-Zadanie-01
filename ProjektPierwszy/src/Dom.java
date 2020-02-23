public class Dom {
    private String kolorScian;           // wszystkie pola w klasie rezprentuej stan obiektu i sluza do przechowywania danych
    private String kolorDachu;
    private String kolorDzwi;
    private String kolorOkna;
    private String kolorKomina;
    private double wysokoscKominaWmetrach;
    /*protected String poleprotected;     // modyfikator protected -> dziedziczenie itd z javy zaawansowanej
    String brakmodyfikatora;            // brak modyfikatora -> tak samo jak protected
    public String polePublic;           // modyfikaotr public -> dostepne też poza klasa
    private String polePrivate;         // modyfikator private -> dostepne tylko wewnatrz klasy


    public Dom() {                      // konstruktor bezparamtrowy

    public Dom(String czerwony) {       // konstruktor z parametrem
        kolorDachu = czerwony;
    }
    */
    public Dom() {                                                                                  // konstrukor 1
        System.out.println("To jest obkekt klasy Dom");
    }

    public Dom(String kolorScian, String kolorDachu, String kolorDzwi, String kolorOkna, String kolorKomina, double wysokoscKominaWmetrach) {
        this.kolorScian = kolorScian;
        this.kolorDachu = kolorDachu;
        this.kolorDzwi = kolorDzwi;
        this.kolorOkna = kolorOkna;                             // PPM, Generate.., Construktor
        this.kolorKomina = kolorKomina;
        this.wysokoscKominaWmetrach = wysokoscKominaWmetrach;
        System.out.println("kolor scian to: " + this.kolorScian);
        System.out.println("kolor dachu to: " + this.kolorDachu);
        System.out.println("kolor dzwi to: " + this.kolorDzwi);
        System.out.println("kolor okien to: " + this.kolorOkna);
        System.out.println("kolor komina to: " + this.kolorKomina);
        System.out.println("wysokosc komina to: " + this.wysokoscKominaWmetrach + " metrow");
    }

    public Dom (String tekst) {                                                                     // konstruktor 2
        System.out.println("Utworzono obiek klasy dom " + "z otrzymanym argumentem: " + tekst);

    }

    public Dom(double wysokoscKominaWmetrach) {                                                     // konstrukor 3
        this.wysokoscKominaWmetrach = wysokoscKominaWmetrach;       // this odnosi się do tej konkretnej klasy
    System.out.println("Wysokosc komina w metrach to: " + this.wysokoscKominaWmetrach);
    }


    public void paliSie () {            // metoda - zachowanie obiektu opisuje metoda

    }
    private void swieciSie() {          // void - metoda nic nie zwraca (bez return)

        /* public int pow (int a, int b) {
        int c = a*b;
        return c;                       // kiedy zamiast void jest inne słowo (tutaj pow) to na koniec zawsze musi byc return (cos zwraca).
         */

    }
// ALT+INSERT -> getter i setter - stworzeniem metod dla kazdej ze zmiennych

    public String getKolorScian() {
        return kolorScian;
    }

    public String getKolorDachu() {
        return kolorDachu;
    }

    public String getKolorDzwi() {
        return kolorDzwi;
    }

    public String getKolorOkna() {
        return kolorOkna;
    }

    public String getKolorKomina() {
        return kolorKomina;
    }

    public double getWysokoscKominaWmetrach() {
        return wysokoscKominaWmetrach;
    }

    public void setKolorScian(String kolorScian) {
        this.kolorScian = kolorScian;
    }

    public void setKolorDachu(String kolorDachu) {
        this.kolorDachu = kolorDachu;
    }

    public void setKolorDzwi(String kolorDzwi) {
        this.kolorDzwi = kolorDzwi;
    }

    public void setKolorOkna(String kolorOkna) {
        this.kolorOkna = kolorOkna;
    }

    public void setKolorKomina(String kolorKomina) {
        this.kolorKomina = kolorKomina;
    }

    public void setWysokoscKominaWmetrach(double wysokoscKominaWmetrach) {
        this.wysokoscKominaWmetrach = wysokoscKominaWmetrach;
    }
}
