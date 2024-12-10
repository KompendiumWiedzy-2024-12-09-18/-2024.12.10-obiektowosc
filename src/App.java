import java.util.Random;

public class App {
    public static void main(String[] args) {
        int x = 5;
        boolean b = true;
        Client client = new Client();

        System.out.println(client.name);
        System.out.println(client.surname);

        Client client2 = new Client();

        int[] tab = new int[10];
        Random random = new Random();

        client.name = "Mateusz";
        client.surname = "Bereda";
        client.age = 30;
        client.pesel = 123;

        client2.name = "Janusz";
        client2.surname = "Kowalski";
        client2.age = 20;
        client2.pesel = 234234;

        System.out.println(client.name);
        System.out.println(client2.name);

        Client Client = new Client();
        Client.age = 30;

        int i1 = 4;
        int i2 = 4;

        System.out.println(i1 == i2);

        Client c1 = new Client();
        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 30;
        c1.pesel = 123;

        Client c2 = new Client();
        c2.name = "Janusz";
        c2.surname = "Kowalski";
        c2.age = 30;
        c2.pesel = 123;

        System.out.println(c1 == c2);

        Client c3 = c1;

        System.out.println(c1 == c3);

        c1.name = "Wiesiek";

        System.out.println(c1.name);
        System.out.println(c3.name);

        c3.name = "Zbyszek";

        System.out.println(c1.name);
        System.out.println(c3.name);

        Client c4 = new Client();
        System.out.println(c4.name);
        String s = "ABC";
        c4.name = "Janusz";

        //c4.surname.replace(".", "");

        System.out.println(c4.address);

        c4.address = new Address();
        c4.address.city = "Krakow";
        c4.address.country = "Poland";
        c4.address.street = "Ogrodowa";
        c4.address.no = "34A";

        System.out.println(c4.dodaj(4,5));
        int y = random.nextInt(1001);
        System.out.println(y);
        System.out.println("ABC");

        c1.powiedzSwojeImie();
        c2.powiedzSwojeImie();
        c3.powiedzSwojeImie();
        c4.powiedzSwojeImie();

        c4.dodaj(3,5);
        c4.dodaj(5.5, 7.7);

        c4.dodaj(3.3, 5);

        Address address = new Address("Krakow", "Poland", "Ogrodowa", "22A");
        System.out.println(address.city);
        System.out.println(address.country);
        System.out.println(address.street);
        System.out.println(address.no);

        Address address2 = new Address("Poznan", "Poland");
        System.out.println(address2);

        Address address3 = new Address(null, "sdfsd");
    }
}
