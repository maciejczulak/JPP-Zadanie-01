public class osobaklasa {

    private String kolorOczu;
    private String charakter;
    private int wzrot;
    private static int iloscPracowników = 0;
    private int id = 0;
    private String imie;



    public static int getIloscPracowników() {
        return iloscPracowników;
    }

    public static void setIloscPracowników(int iloscPracowników) {
        osobaklasa.iloscPracowników = iloscPracowników;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public osobaklasa(String kolorOczu, String charakter, int wzrot, int id, String imie) {
        this.kolorOczu = kolorOczu;
        this.charakter = charakter;
        this.wzrot = wzrot;
        this.id = id;
        this.imie = imie;
    }

    public osobaklasa(String imie){
        this.
    }


    public String getKolorOczu() {
        return kolorOczu;
    }

    public String getCharakter() {
        return charakter;
    }

    public int getWzrot() {
        return wzrot;
    }

    public void setKolorOczu(String kolorOczu) {
        this.kolorOczu = kolorOczu;
    }

    public void setCharakter(String charakter) {
        this.charakter = charakter;
    }

    public void setWzrot(int wzrot) {
        this.wzrot = wzrot;
    }

    public osobaklasa(String kolorOczu, String charakter, int wzrot) {
        this.kolorOczu = kolorOczu;
        this.charakter = charakter;
        this.wzrot = wzrot;

    }
}
