public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    Triangle(double a, double b, double c) throws TriangleException {
        if (!isValidTriangle(a, b, c)) throw new TriangleException();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isEquilateral() {
        return (a == b) && (b == c) && (a == c);
    }

    boolean isIsosceles() {
        return ( (a == b) || (b == c) || (c == a) );
    }

    boolean isScalene() {
        return (a != b) && (b != c) && (a != c);
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return isAllSidesGreaterThanZero(a, b, c) && triangleInequality(a, b, c);
    }

    private boolean isAllSidesGreaterThanZero(double a, double b, double c) {
        return ( (a * b * c) > 0 );
    }

    private boolean triangleInequality(double a, double b, double c) {
        return (a + b >= c) && (b + c >= a) && (a + c >= b);
    }

}
