// Custom Exception class
class MyOwnException extends Exception {
    MyOwnException(String msg) {
        super(msg);
    }
}

// Main demo class
public class MyExceptDemo {
    public static void main(String args[]) {
        int age = 15;  // Hardcoded for testing

        try {
            if (age < 21) {
                throw new MyOwnException("Your age is less than the required condition!");
            }
            System.out.println("You are eligible.");
        }
        catch (MyOwnException e) {
            System.out.println("This is My Exception block");
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block: End of the Program");
        }
    }
}
