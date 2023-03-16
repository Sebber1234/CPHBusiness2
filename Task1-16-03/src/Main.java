import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        customers.add(new Customer("Marcus", "Anastasiades", "Guf10"));
        customers.add(new Customer("Sebastian", "Dragør", "Hjemmeboende2791"));
        customers.add(new Customer("Bob", "Haansen", "Sr7005230"));
        customers.add(new Customer("Julle", "Bobsen", "Fedbob"));
        customers.add(new Customer("Mikkel", "Dragør", "Mikk"));
        customers.add(new Customer("Thomas", "Errikson", "Terminator"));

        printCustomers();
    }

    public static void printCustomers() {
        for (Customer c :
                customers) {
            System.out.println(c);
        }
    }
}