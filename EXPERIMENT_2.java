class areafind {

    double area(int radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        areafind a = new areafind();
        System.out.println("Area of square  = " + a.area(8.0));
        System.out.println("Area of rectangle = " + a.area(5.0, 7.0));
        System.out.println("Area of circle = " + a.area(4));
    }
}
