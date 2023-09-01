
import java.util.Scanner;

    
public class TestInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter social security number: ");
        String ssn = scanner.nextLine();

        System.out.print("Enter wage per piece: $");
        double wage = scanner.nextDouble();

        System.out.print("Enter number of pieces produced: ");
        int pieces = scanner.nextInt();

        PieceWorker worker = new PieceWorker(firstName, lastName, ssn, wage, pieces);

        System.out.println("\nEmployee Information:\n");
        System.out.println(worker.toString());

        scanner.close();
    }
}

class Emp {
    private String firstName;
    private String lastName;
    private String ssn;

    public Emp(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nSSN: " + ssn;
    }
}

class PieceWorker extends Emp{
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String ssn, double wage, int pieces) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.pieces = pieces;
    }

    public String toString() {
        String employeeInfo = super.toString();
        return employeeInfo + "\nWage: $" + wage + "\nPieces Produced: " + pieces;
    }
}

