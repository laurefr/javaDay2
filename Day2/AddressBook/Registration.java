package Day2.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 04-May-16.
 */
public class Registration {

    Person clients[] = new Person[6];
    int counter = 0;

    public Person[] generateSampleData() {
        clients = new Person[6];
        clients[0] = new Person("Alex", "Kennedy", 'M', 33, 1.80, false);
        clients[1] = new Person("David", "Beckham", 'M', 38, 1.80, true);
        clients[2] = new Person("Natalie", "Portman", 'F', 34, 1.65, false);
        clients[3] = new Person("Laura", "Robson", 'F', 22, 1.80, false);

        return clients;
    }

    private final List<Person> people = new ArrayList<>();


    public Person[] askUserToInputData() {

        Scanner kb = new Scanner(System.in);

        Person person = new Person();

        System.out.println("-----------------------------");

        // asks the name
        System.out.print("Enter the First Name: ");
        String fn = kb.nextLine();

        System.out.print("Enter the Last Name: ");
        String ln = kb.nextLine();

        person.setName(fn, ln);

        // asks the gender
        System.out.print("Enter the Gender: (M or F) ");
        person.gender = kb.nextLine().charAt(0);

        // asks the age
        System.out.print("Enter the Age in years: ");
        person.age = Integer.parseInt(kb.nextLine());

        // asks the age
        System.out
                .print("Enter the Height in meters and centimeters: (e.g. 1.85) ");
        person.height = Double.parseDouble(kb.nextLine());

        // asks the age
        System.out.print("Smoker? (Y or N) ");
        String input = kb.nextLine();
        person.smoker = input.equals("Y") || input.equals("y");

        // stores the new client in the array
        clients[counter] = person;
        people.add(person);

        System.out.println("Input more data? Y / N");
        if (kb.nextLine() == "Y")
        {
            counter++;
            askUserToInputData();
        }


        return clients;
    }

    public void retrievePeople(Person client[])
    {
        for (Person p : client )
        {
            System.out.println(p);
            System.out.println("Gender: " + p.gender);
            System.out.println("Age: " + p.age);
            System.out.println("Height: " + p.height);
            System.out.println("Smoker?: " + p.smoker);
            System.out.println();
        }
    }

}