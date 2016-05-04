package Day2.AddressBook;

/**
 * Created by student on 04-May-16.
 */
public class Person {
    private String firstName;
    private String lastName;
    char gender;
    int age;
    double height;
    boolean smoker;
    boolean available;

    public Person()
    {
        available = true;
    }

    public Person(String fn, String ln)
    {
        this.firstName = fn;
        this.lastName = ln;

    }

    public Person(String firstname,String lastname, char gender, int age, double height,
                  boolean smoker) {
        this(); // invokes the default constructor
        this.firstName = firstname;
        this.lastName = lastname;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.smoker = smoker;
    }

    public void setName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }


    public String getfirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return "Person name: " + firstName + " " + lastName;
    }

}
