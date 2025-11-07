interface Area {
    double Compute(double a, double b);
}

class Rectangle implements Area {
    public double Compute(double l, double b) {
        return l * b;
    }
}

class Square implements Area {
    public double Compute(double side, double unused) {
        return side * side;
    }
}

public class MainArea {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        double RArea = rect.Compute(10, 10);
        System.out.println("The area of the Rectangle is " + RArea);

        Square square = new Square();
        double SArea = square.Compute(8, 0); // second parameter unused
        System.out.println("The area of the Square is " + SArea);
    }
}
