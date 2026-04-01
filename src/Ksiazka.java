public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = true;
    }

    public void wypiszInfo() {
        System.out.println(tytul + " - " + autor);
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
        }
    }

    public void zwroc() {
        dostepna = true;
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}