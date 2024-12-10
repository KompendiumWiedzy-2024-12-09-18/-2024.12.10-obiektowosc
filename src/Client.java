public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    public Client() {
        System.out.println("Nowy obiekt klienta !!");
        age = 10;
        address = new Address();
    }

    int dodaj(int skladnikPierwszy, int skladnikDrugi) {
        int wynik = skladnikPierwszy + skladnikDrugi;
        return wynik;
    }

    double dodaj(double skladnikPierwszy, double skladnikDrugi) {
        double wynik = skladnikPierwszy + skladnikDrugi;
        return wynik;
    }

    void powiedzSwojeImie() {
        System.out.println(name);
    }

    void skomplikowanyAlgorytm() {
        int wczytaneDane = mniejszaCzynnosc1();
        mniejszaCzynnosc2(wczytaneDane);
        mniejszaCzynnosc3();
    }

    int mniejszaCzynnosc1() {
        //krok 1
        //krok 2
        //krok 3
        //krok 4
        //krok 5
        //krok 6
        return 7;
    }

    void mniejszaCzynnosc2(int dane) {
        //krok 7
        //krok 8
        //krok 9
        //krok 10
        //krok 11
        //krok 12
    }

    void mniejszaCzynnosc3() {
        //krok 13
        //krok 14
        //krok 15
        //krok 16
        //krok 17
        //krok 18
    }
}
