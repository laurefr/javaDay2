package JavaDay2.Arrays.AdressBook;

/**
 * Created by student on 5/4/2016.
 */
public class person {

    private String firstName;
    private String lastName;
    public int Age;
    char gender;
    double height;
    boolean Smoker;
    boolean available;


    public person() {available = true;}


    public person (String fn, String ln)
    {
        this.firstName=fn;
        this.lastName=ln;
    }

    public person (String fn , String ln, int age,char gender, double Height, boolean smoker )
    {
        this();
        this. firstName = fn;
        this.lastName = ln;
        this.Age = age;
        this.gender = gender;
        this.height = Height;
        this.Smoker = smoker;

    }

    public void setName ( String fn, String ln,int age, char gender,double Height, boolean smoker){


        this. firstName = fn;
        this.lastName = ln;
        this.Age = age;
        this.gender = gender;
        this.height = Height;
        this.Smoker = smoker;

    }

    public String getfirstName (){ return firstName;}
    public String getlastName (){ return lastName;}
    public int getAge (){ return Age;}
    public void setAge(int Age) {
        this.Age =Age;
    }
    public char getGender (){ return gender;}
    public void setGender(char gender) {
        this.gender =gender;
    }
    public double height (){ return height;}
    public void setHeight(Double Height) {
        this.height = Height;
    }

    public boolean Smoker (){ return Smoker;}
    public void setSmoker(Boolean Smoker) {
        this.Smoker = Smoker;
    }



    @Override

    public String toString (){

        return  " Person name " + firstName + "  " + lastName;
    }
}






