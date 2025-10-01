// Base class
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

// Circle class
class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double width, height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    double area() {
        return width * height;
    }
    
    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

// Triangle class
class Triangle extends Shape {
    private double side1, side2, side3;
    
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

public class inheritence {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);
        
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
    }
}
// Base class
class Vehicle {
    private String make;
    private String model;
    
    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
}

// Derived class
class Car extends Vehicle {
    private int year;
    
    Car(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements Bank {
    private double balance = 0;
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CurrentAccount implements Bank {
    private double balance = 0;
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank savings = new SavingsAccount();
        Bank current = new CurrentAccount();
        
        savings.deposit(1000);
        savings.withdraw(500);
        
        current.deposit(2000);
        current.withdraw(1500);
    }
}
interface A {
    void myMethod();
}

class B {
    public void myMethod() {
        System.out.println("My Method");
    }
}

class C extends B implements A {
    // No need to override myMethod() as it's already provided by B
}

public class MainClass {
    public static void main(String[] args) {
        A a = new C();
        a.myMethod(); // Output: My Method
    }
}
abstract class Pen {
    abstract void write();
    abstract void refill();
}

class BallpointPen extends Pen {
    @Override
    void write() {
        System.out.println("Writing with a ballpoint pen.");
    }
    
    @Override
    void refill() {
        System.out.println("Refilling the ballpoint pen.");
    }
}

public class PenDemo {
    public static void main(String[] args) {
        Pen myPen = new BallpointPen();
        myPen.write();
        myPen.refill();
    }
}
class Parent {
    // Final variable
    final String finalVariable = "I am final";

    // Final method
    final void finalMethod() {
        System.out.println("This method cannot be overridden.");
    }
    
    // Method using super
    void display() {
        System.out.println("Parent class display method.");
    }
}

class Child extends Parent {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println("Static method in Child class. Static Variable: " + staticVariable);
    }

    // Overriding method using super
    @Override
    void display() {
        super.display();
        System.out.println("Child class display method.");
    }

    // Method using this
    void show() {
        System.out.println("This is the show method.");
        this.display();
    }
    
    // Trying to override final method (This will cause a compile-time error)
    /*
    @Override
    void finalMethod() {
        System.out.println("Trying to override final method.");
    }
    */
}

public class KeywordsDemo {
    public static void main(String[] args) {
        Child.staticMethod(); // Static method call
        
        Child child = new Child();
        child.show(); // Method using this
        child.display(); // Method using super

        // Accessing final variable
        System.out.println("Final Variable: " + child.finalVariable);
    }
}
