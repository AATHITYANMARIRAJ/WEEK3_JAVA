public class TestInheritance {
    static class Employee {
        // Employee class implementation
    }

    static class Pieceworker extends Employee {
        // Pieceworker class implementation

        public Pieceworker(String firstName, String lastName, String socialSecurityNumber) {
            // Calling superclass Employee's constructor
            super();
            // Pieceworker specific initialization
        }

        @Override
        public String toString() {
            return super.toString(); // Calling superclass Employee's toString method
        }
    }

    public static void main(String[] args) {
        // Task a) Specify that class Pieceworker inherits from class Employee
        // This is done by defining the Pieceworker class as a subclass of the Employee class.

        // Task b) Call superclass Employee's toString method from subclass Pieceworker's toString method
        Pieceworker pieceworker = new Pieceworker("John", "Doe", "123-456-7890");
        String employeeString = pieceworker.toString();
        System.out.println("Employee String: " + employeeString);

        // Task c) Call superclass Employee's constructor from subclass Pieceworker's constructor
        // The constructor of Pieceworker calls the constructor of its superclass (Employee) using the super keyword.
    }
}

