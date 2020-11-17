package Lab;

/**
 * StudentTester
 */
public class StudentTester {

    public static void main(String args[]) {
        Student x = new Student("Stu Dent ", 18, "20012345 ", " New ave. Chistmas Street.");
        System.out.println("Student name: " + x.getName());
        System.out.println("Student full details: ");
        x.writeOutput();
    }

}