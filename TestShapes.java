
public class TestShapes {
static class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

static class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
        point4 = p4;
    }

    public double calculateArea() {
        return 0.0; // Quadrilateral does not have a specific area calculation
    }
}

static class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double calculateArea() {
        // Implement the area calculation for Trapezoid
        return 0.0;
    }
}

static class Parallelogram extends Quadrilateral {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double calculateArea() {
        // Implement the area calculation for Parallelogram
        return 0.0;
    }
}

static class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double calculateArea() {
        // Implement the area calculation for Rectangle
        return 0.0;
    }
}

static class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double calculateArea() {
        // Implement the area calculation for Square
        return 0.0;
    }
}

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 5);
        Point p3 = new Point(5, 0);
        Point p4 = new Point(5, 5);

        Quadrilateral quadrilateral = new Quadrilateral(p1, p2, p3, p4);
        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4);
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        Square square = new Square(p1, p2, p3, p4);

        System.out.println("Area of Quadrilateral: " + quadrilateral.calculateArea());
        System.out.println("Area of Trapezoid: " + trapezoid.calculateArea());
        System.out.println("Area of Parallelogram: " + parallelogram.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}

