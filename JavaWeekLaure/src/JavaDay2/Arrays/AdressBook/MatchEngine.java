package JavaDay2.Arrays.AdressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 5/4/2016.
 */
public class MatchEngine {


    public person[] generateSampleData;
    final person[] clients;
    {

        clients = new person[6];
        clients[0] = new person("Laure", "Guery", 28, 'F', 1.74, false);
        clients[1] = new person("David", "Beckham", 38, 'M', 1.80, true);
        clients[2] = new person("Natalie", "Portman", 34, 'F', 1.65, false);
        clients[3] = new person("Laura", "Robson", 22, 'F', 1.80, false);
       // return clients;
    }

    private final List<person> people2 = new ArrayList<>();


    public void askUserToInputData() {

        Scanner kb = new Scanner(System.in);

        person person = new person();

        System.out.println("-----------------------------");
    }
    public void retrievePeople(person client[])
    {
        for (person p : client )
        {
            System.out.println(p);
            System.out.println("Age: " + p.Age);
            System.out.println("Gender: " + p.gender);

            System.out.println("Height: " + p.height);
            System.out.println("Smoker?: " + p.Smoker);
            System.out.println();
        }

    }
}

