package introinheritance.employee;

public class Person {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public Person() {
    }

    public String getAddress() {
        return address;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void migrate(String newAddress) {
        address = newAddress;
    }
}
