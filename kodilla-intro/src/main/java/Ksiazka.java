public class Ksiazka {
    String tytul;
    String autor;
}

class KsiazkaTester {
    public static void main(String[] args) {

        Ksiazka[] mojeKsiazki = new Ksiazka[3];
        int x = 0;
        mojeKsiazki[0] = new Ksiazka();
        mojeKsiazki[1] = new Ksiazka();
        mojeKsiazki[2] = new Ksiazka();
        mojeKsiazki[0].tytul = "Czterej koderzy i Java";
        mojeKsiazki[1].tytul = "Java nocy letniej";
        mojeKsiazki[2].tytul = "Java. Receptury";
        mojeKsiazki[0].autor = "Janek";
        mojeKsiazki[1].autor = "Wilhelm";
        mojeKsiazki[2].autor = "Ian";
        while (x < 3) {
            System.out.print(mojeKsiazki[x].tytul);
            System.out.print(", autor ");
            System.out.println(mojeKsiazki[x].autor);
            x = x + 1;
        }
    }
}
