public class Main {
    public static void main(String[] args) {

        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 300);
        Ksiazka k2 = new Ksiazka("Hobbit", "Tolkien", 250);

        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 1);

        Biblioteka b = new Biblioteka(10);

        b.dodajKsiazke(k1);
        b.dodajKsiazke(k2);

        b.wypiszDostepneKsiazki();
    }
}