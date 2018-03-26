package sort;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPerson() {
        System.out.print(String.format(" Last name: %s, First name: %s, Age: %s\n", lastName, firstName, age));
    }

    public String getLast() {
        return lastName;
    }
}
