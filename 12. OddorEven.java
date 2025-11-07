import java.util.Scanner;

class Test {
    int n, i, p = 1;
    Scanner sc = new Scanner(System.in);

    Test() {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }

    void check() {
        if (n % 2 == 0) {
            System.out.println("Number is even: " + n);
        } else {
            System.out.println("Number is odd: " + n);
        }
    }
}

class OddorEven {
    public static void main(String args[]) {
        Test obj = new Test();
        obj.check();
    }
}
