package Day2.AddressBook;

/**
 * Created by student on 04-May-16.
 */
public class Contact extends Person {
    private Address address;
    private String phoneNumber;
    private String email;
    private String twitterAccount;
    private String faceBookLink;

    public Contact(String firstName, String lastName, String phoneNumber, Address address,
                   String email, String tw, String fb)
    {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.twitterAccount = tw;
        this.faceBookLink = fb;
    }

    public Contact(String firstName, String lastName, Address address) {
        super(firstName, lastName);
        this.address = address;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Phone Number: " + phoneNumber + " " +
                address + " Email: " + email + " Twitter: " + twitterAccount +
                " Facebook: " + faceBookLink;
    }
}
