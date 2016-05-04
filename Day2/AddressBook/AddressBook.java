package Day2.AddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by student on 04-May-16.
 */
public class AddressBook {
    private Contact[] contacts = new Contact[100];
    private int counter;

    public void printAllContacts()
    {
        for (int i=0; i < counter; i++)
            System.out.println(contacts[i]);
    }

    public Contact seachContactByLastName(String lastName)
    {
        Contact resultContact = null;
        for(int i = 0; i < counter; i++) {
            Contact p = contacts[i];
            if(p.getLastName().equalsIgnoreCase(lastName))
                resultContact = p;
            break;
        }
     return resultContact;
    }

    public void loadContactFromFile(File file) throws FileNotFoundException
    {
        Scanner fileReader = new Scanner(file);
        while(fileReader.hasNextLine())
        {
            String line = fileReader.nextLine();
            String[] data = line.split(",");
            Contact contact = new Contact(data[0], data[1], data[2],
                    new Address(data[3], data[4], data[5], data[6]), data[7], data[8], data[9]);

            contacts[counter++] = contact;
        }
        fileReader.close();
    }

    public void sortByLastName()
    {
        //bubble sort
        for(int i=0; i < counter - 1; i++)
        {
            String temp1 = contacts[i].getLastName();
            for(int j= i + 1; j < counter; j++)
            {
                String temp2 = contacts[j].getLastName();
                if(temp1.compareToIgnoreCase(temp2) > 0)
                {
                    //swap
                    Contact tempContact = contacts[i];
                    contacts[i] = contacts[j];
                    contacts[j] = tempContact;
                }
            }
        }
    }
}
