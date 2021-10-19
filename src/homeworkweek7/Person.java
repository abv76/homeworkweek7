package homeworkweek7;

public class Person {

    //Instance variable

    private String firstName;
    private String lastName;
    private int age;

    // constructor
    public Person(String firstName, String lastName, int age) {

        // initialize the instance variable

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    // constructor method name same as class name
    public Person() {

    }

    // (1) get method with return result

    public String getFirstName() {

        return firstName;
    }

    // (2) get method
    public String getLastName() {

        return lastName;
    }

    // (3) get method
    public int getAge() {
        return age;
    }

    // (1)set method with initialized variables/
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    //(2)set method

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    // boolean result

    //(4) set method
    public boolean setAge(int age) {

        this.age = age;

        if (age < 0 || age > 100) {
            return true;

        } else {
            return false;
        }

    }

    public boolean isTeen() {

        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }


    public String getFullName() {

        return this.firstName + " " + this.lastName;


    }


    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }


}