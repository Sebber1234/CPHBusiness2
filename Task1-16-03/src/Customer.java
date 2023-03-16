public class Customer {
    private final String firstName;
    private final String lastName;
    private final String username;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Username: " + username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }
}