import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    // Class to represent a Student
    static class Student {
        private int id;
        private String name;
        private int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Age: " + age;
        }
    }

    // Main program
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Display menu
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();
                    students.add(new Student(id, name, age));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // View all students
                    System.out.println("\n--- Student List ---");
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 3:
                    // Exit program
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
