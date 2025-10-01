class Shape {
    // Method to calculate the area of a square
    public int area(int side) {
        System.out.println("Calculating the area of a square...");
        return side * side;
    }

    // Overloaded method to calculate the area of a rectangle
    public int area(int length, int width) {
        System.out.println("Calculating the area of a rectangle...");
        return length * width;
    }

    // Overloaded method to calculate the area of a circle
    public double area(double radius) {
        System.out.println("Calculating the area of a circle...");
        return Math.PI * radius * radius;
    }
}

public class moverload {
    public static void main(String[] args) {
        // Create an object of the Shape class
        Shape shape = new Shape();

        // Call the overloaded methods and display the results
        System.out.println("Area of square: " + shape.area(5));
        System.out.println("Area of rectangle: " + shape.area(4, 6));
        System.out.println("Area of circle: " + shape.area(7.5));
    }
}
