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
}