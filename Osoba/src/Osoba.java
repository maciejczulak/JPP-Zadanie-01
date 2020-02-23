public class Osoba {
    public static void main(String[] args) {
       Osoba1 osoba = new Osoba1("niebieski", "trudny", 193);
       osoba.setWzrot(170);
       System.out.println("kolor oczu: " + osoba.getKolorOczu());
       System.out.println("charakter: " + osoba.getCharakter());
       System.out.println("Wzrost: " + osoba.getWzrot());
    }

}
