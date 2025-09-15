import java.util.Scanner;

class Employee {
    String emp_name;
    int emp_id;
    String address;
    String mail_id;
    int mobile_no;

    void display() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Mail ID: " + mail_id);
        System.out.println("Mobile No: " + mobile_no);
    }
}

class Programmer extends Employee {
    int BP; // Basic Pay

    void display() {
        super.display();
        System.out.println("BP: " + BP);
        System.out.println("DA: " + 0.97 * BP);
        System.out.println("HRA: " + 0.10 * BP);
        System.out.println("PF: " + 0.12 * BP);
        System.out.println("STAFF CLUB FUND: " + 0.001 * BP);
    }
}

class Assistant_Professor extends Employee {
    int BP;

    void display() {
        super.display();
        System.out.println("BP: " + BP);
        System.out.println("DA: " + 0.97 * BP);
        System.out.println("HRA: " + 0.10 * BP);
        System.out.println("PF: " + 0.12 * BP);
        System.out.println("STAFF CLUB FUND: " + 0.001 * BP);
    }
}

class Associate_Professor extends Employee {
    int BP;

    void display() {
        super.display();
        System.out.println("BP: " + BP);
        System.out.println("DA: " + 0.97 * BP);
        System.out.println("HRA: " + 0.10 * BP);
        System.out.println("PF: " + 0.12 * BP);
        System.out.println("STAFF CLUB FUND: " + 0.001 * BP);
    }
}

class Professor extends Employee {
    int BP;

    void display() {
        super.display();
        System.out.println("BP: " + BP);
        System.out.println("DA: " + 0.97 * BP);
        System.out.println("HRA: " + 0.10 * BP);
        System.out.println("PF: " + 0.12 * BP);
        System.out.println("STAFF CLUB FUND: " + 0.001 * BP);
    }
}

public class EmployeeInfo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n1. Programmer\n2. Assistant Professor\n3. Associate Professor\n4. Professor\n5. Exit");
        System.out.print("Enter your choice: ");
        int ch = input.nextInt();

        switch (ch) {
            case 1:
                Programmer p1 = new Programmer();
                p1.emp_name = "ABC";
                p1.address = "A-city";
                p1.mail_id = "praw@gmail.com";
                p1.emp_id = 567;
                p1.mobile_no = 2345678;
                p1.BP = 15000;
                p1.display();
                break;

            case 2:
                Assistant_Professor p2 = new Assistant_Professor();
                p2.emp_name = "DEF";
                p2.address = "A-city";
                p2.mail_id = "rajan@gmail.com";
                p2.emp_id = 123;
                p2.mobile_no = 987321;
                p2.BP = 30000;
                p2.display();
                break;

            case 3:
                Associate_Professor p3 = new Associate_Professor();
                p3.emp_name = "GHF";
                p3.address = "B-city";
                p3.mail_id = "main@gmail.com";
                p3.emp_id = 456;
                p3.mobile_no = 98710;
                p3.BP = 30000;
                p3.display();
                break;

            case 4:
		        Professor p4 = new Professor();
                p4.emp_name = "KANNAN";
                p4.address = "TRICHY";
                p4.mail_id = "kanna@gmail.com";
                p4.emp_id = 789;
                p4.mobile_no = 9810;
                p4.BP = 30000;
                p4.display();
                break;

            case 5:
                System.exit(0);

            default:
                System.out.println("Enter correct choice!");
        }

        input.close();
    }
}
