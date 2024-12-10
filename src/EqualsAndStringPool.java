import java.util.Random;

public class EqualsAndStringPool {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        System.out.println(x == y);

        Client c1 = new Client();
        Client c2 = new Client();

        System.out.println(c1 == c2);

        System.out.println(System.identityHashCode(c1));
        System.out.println(System.identityHashCode(c2));

        boolean czyTakieSame = c1.equals(c2);

        System.out.println(czyTakieSame);

        String s1 = "WWW";
        String s2 = "WWW";
        // metoda();
        System.out.println(s1 == s2);

        String s3 = "WWWX";

        s1 = s1+"X";

        System.out.println(s3 == s1);

        s1 = "WWW";

        String s4 = s3.substring(0,3);

        System.out.println(s1 == s2);

        System.out.println(s4);

        System.out.println(s4 == s1);
    }
}
