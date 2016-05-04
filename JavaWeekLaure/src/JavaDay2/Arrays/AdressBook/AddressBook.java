package JavaDay2.Arrays.AdressBook;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
/**
 * Created by student on 5/4/2016.
 */
public class AddressBook {

    private Contact[] contacts = new Contact [50];
    private int counter;

    public void printAllContacts()

    {
        for ( Contact c : contacts  )
        {
            System.out.println(c);
        }}

        public Contact searchContact (String lastName)
    {
    Contact resultContact = null;
        for (int i =  0 ; i < contacts.length; i ++) {
            Contact p = contacts[i];
            if (p.getlastName().equalsIgnoreCase(lastName));
            resultContact= p ;
            break;

        }

        return resultContact;
    }

    public void loadContactFromFile(File  file) throws FileNotFoundException
    {
        Scanner fileReader = new Scanner (file);
        while (fileReader.hasNextLine()){

             String line = fileReader.nextLine();
            String [] data = line.split (",");
            Contact contact = new Contact(data[0],data[1], data[2],new Address(data[3],data[4],data[5],data[6]), data[7],data[8], data[9]);

            contacts [counter++ ]= contact;
        }
        fileReader.close();
    }


}
