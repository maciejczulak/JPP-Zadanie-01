public class PierwszyProjekt {
    public static void main(String[] args) {
    Dom dom = new Dom();                                                // konstruktor 1 - ma nazwe klasy
    Dom domzTekstem = new Dom("Mój pierwszy argument");             // konstruktor 2
    Dom domZwysKomina = new Dom (2.5);              // konstrukotr 3
    Dom domWartosci =  new Dom ("czerwony,", "zielony", "niebieski", "zolty", "rozowy", 2.5);
;

    System.out.println(domWartosci.getKolorDachu());  // drukowanie poszczegolnej zmiennej
    domWartosci.setKolorDzwi("Bialy");                // ustawienie poszczegonej zmiennej
        }
}
