public class Address {
    String city = "domyslna";
    String country;
    String street;
    String no;

    Address(String city, String country, String street, String no) {
        this(city, country);
        this.street = street;
        this.no = no;
    }

    Address(String city, String country) {
        if(city != null) {
            this.city = city;
        }
        this.country = country;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", no='" + no + '\'' +
                '}';
    }
}
