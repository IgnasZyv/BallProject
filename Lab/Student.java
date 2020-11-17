package Lab;

public class Student extends Person {
    private String idNumber;

    public Student(String n, int a, String i, String h) {
        super(n, a, h);
        idNumber = i;

    }

    public void setId(String id) {
        idNumber = id;
    }

    public String getId() {
        return idNumber;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("ID: " + getId());
    }

}
