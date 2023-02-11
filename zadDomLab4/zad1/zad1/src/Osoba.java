public class Osoba {
    private String imie;
    private String nazwisko;
    private final int rokUrodzenia;
    private Adres adres;

    public Osoba (String imie, String nazwisko, int rokUrodzenia, Adres adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = adres;
    }

    public Osoba (String imie, String nazwisko, int rokUrodzenia, String miejscowosc, String kodPoocztowy, String nazwaUlicy, int nrDomu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;

        this.adres = new Adres(miejscowosc, kodPoocztowy, nazwaUlicy, nrDomu);
    }

    public String toString() {
        return imie + " " + nazwisko + ", ur: " + rokUrodzenia + ", mieszka pod adresem: " + adres;
    }

}
