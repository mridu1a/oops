
class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}
class Person {
    private int age;

    public Person(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Age must be 18 or above to create a Person object.");
        }
        this.age = age;
    }


    public void displayAge() {
        System.out.println("Person's age: " + age);
    }
}
public class exceptionhandling2 {
    public static void main(String[] args) {
        try {
            
            Person person1 = new Person(20);
            person1.displayAge();

            Person person2 = new Person(15);
            person2.displayAge();

        } catch (AgeRestrictionException e) {
            // Catch the custom exception and print the message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
