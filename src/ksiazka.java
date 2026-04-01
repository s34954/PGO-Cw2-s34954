public class ksiazka {
    public class Ksiazka {
        private String tytul;
        private String autor;
        private int liczbaStron;
        private boolean dostepna;
        private int liczbaWypozyczen; // bonus

        public Ksiazka(String tytul, String autor, int liczbaStron) {
            this.tytul = tytul;
            this.autor = autor;
            this.liczbaStron = liczbaStron;
            this.dostepna = true;
            this.liczbaWypozyczen = 0;
        }

        public void wypiszInfo() {
            System.out.println("Tytul: " + tytul);
            System.out.println("Autor: " + autor);
            System.out.println("Strony: " + liczbaStron);
            System.out.println("Dostepna: " + dostepna);
            System.out.println("Wypozyczenia: " + liczbaWypozyczen);
            System.out.println("----------------------");
        }

        public void wypozycz() {
            if (dostepna) {
                dostepna = false;
                liczbaWypozyczen++;
                System.out.println("Wypozyczono: " + tytul);
            } else {
                System.out.println("Ksiazka niedostepna: " + tytul);
            }
        }

        public void zwroc() {
            dostepna = true;
            System.out.println("Zwrocono: " + tytul);
        }

        public String getTytul() {
            return tytul;
        }

        public String getAutor() {
            return autor;
        }

        public boolean isDostepna() {
            return dostepna;
        }
    }
}
