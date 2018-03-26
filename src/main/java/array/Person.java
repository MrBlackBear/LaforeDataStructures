package array;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        this.lastName = last;
        this.firstName = first;
        this.age = a;
    }

    public void displayPerson() {
        System.out.println(String.format(" Last name: %s, First name: %s, Age: %s", lastName, firstName, age));
    }

    public String getLast() {
        return lastName;
    }
}
