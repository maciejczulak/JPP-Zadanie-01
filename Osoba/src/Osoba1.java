public class Osoba1 {
    private String kolorOczu;
    private String charakter;
    private int wzrot;


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

    public Osoba1(String kolorOczu, String charakter, int wzrot) {
        this.kolorOczu = kolorOczu;
        this.charakter = charakter;
        this.wzrot = wzrot;

    }
}
