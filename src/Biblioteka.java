public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int rozmiar) {
        ksiazki = new Ksiazka[rozmiar];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka k) {
        ksiazki[liczbaKsiazek++] = k;
    }

    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public void wypozyczKsiazke(String tytul, Czytelnik c) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);

        if (k != null && k.isDostepna()) {
            k.wypozycz();
            c.zwiekszLiczbeWypozyczen();
            System.out.println("Wypozyczono!");
        }
    }

    public void zwrocKsiazke(String tytul, Czytelnik c) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);

        if (k != null) {
            k.zwroc();
            c.zmniejszLiczbeWypozyczen();
            System.out.println("Zwrocono!");
        }
    }
}