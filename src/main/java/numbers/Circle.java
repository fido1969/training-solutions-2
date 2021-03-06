package numbers;

public class Circle {

    private int diameter;
    private final double PI = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPI() {
        return PI;
    }

    public double perimeter(){
        return 2*PI*diameter;
    }

    public double area() {
        return Math.pow((double) diameter, 2 )*PI;
    }
}

