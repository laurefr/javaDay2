package Day2.AddressBook;

/**
 * Created by student on 04-May-16.
 */
public class Address {
    private String street;
    private String city;
    private String country;
    private String postcode;

    public Address(){}

    public Address(String st, String city, String country, String postcode)
    {
        this.street = st;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
    }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return city; }
    public void setCountry(String country) { this.country = country; }

    public String getPostCode() { return postcode; }
    public void setPostCode(String postcode) { this.postcode = postcode; }

    @Override
    public String toString() {
        return String.format(
                "Street Adress: %s, City: %s, Country: %s,  PostCode: %s", street,
                city, country, postcode);
    }

}
