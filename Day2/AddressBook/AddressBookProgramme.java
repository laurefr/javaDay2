package Day2.AddressBook;

import java.io.File;

/**
 * Created by student on 04-May-16.
 */
public class AddressBookProgramme {

    public static void main(String[] args) {
        //load contact from our file
        System.out.println(System.getProperty("user.dir"));

        AddressBook addressBook = new AddressBook();
        try {
            addressBook.loadContactFromFile(new File("ContactDetails.txt"));
            System.out.println("WE BOOM IT");
        } catch (Exception e)
        {
            System.out.println("FAILED MAN! NOT BOOM!");
        }

        addressBook.printAllContacts();

        //after sort
        addressBook.sortByLastName();
        addressBook.printAllContacts();

        System.out.println(addressBook.seachContactByLastName("Kennedy"));

    }
}
