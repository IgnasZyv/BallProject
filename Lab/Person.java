package Lab;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String n, int a, String h) {
        name = n;
        age = a;
        address = h;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void writeOutput() {
        System.out.println("Name: " + getName() + " Age: " + getAge() + " Address: " + getAddress());

    }

    public String getAddress() {
        return address;
    }
}
