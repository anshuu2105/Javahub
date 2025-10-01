import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class StudentManagementSystemGUI {
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

    // Main Application Frame
    static class StudentManagementFrame extends JFrame {
        private ArrayList<Student> students = new ArrayList<>();
        private JTextArea outputArea;

        public StudentManagementFrame() {
            // Set up the frame
            setTitle("Student Management System");
            setSize(500, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // Create the top panel for buttons
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(1, 4, 5, 5));

            JButton addStudentButton = new JButton("Add Student");
            JButton viewStudentsButton = new JButton("View Students");
            JButton searchStudentButton = new JButton("Search Student");
            JButton deleteStudentButton = new JButton("Delete Student");

            buttonPanel.add(addStudentButton);
            buttonPanel.add(viewStudentsButton);
            buttonPanel.add(searchStudentButton);
            buttonPanel.add(deleteStudentButton);

            // Add button panel to the frame
            add(buttonPanel, BorderLayout.NORTH);

            // Create output area
            outputArea = new JTextArea();
            outputArea.setEditable(false);
            outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
            JScrollPane scrollPane = new JScrollPane(outputArea);
            add(scrollPane, BorderLayout.CENTER);

            // Add action listeners
            addStudentButton.addActionListener(e -> addStudentDialog());
            viewStudentsButton.addActionListener(e -> viewStudents());
            searchStudentButton.addActionListener(e -> searchStudentDialog());
            deleteStudentButton.addActionListener(e -> deleteStudentDialog());
        }

        private void addStudentDialog() {
            JTextField idField = new JTextField();
            JTextField nameField = new JTextField();
            JTextField ageField = new JTextField();

            Object[] message = {
                "ID:", idField,
                "Name:", nameField,
                "Age:", ageField,
            };

            int option = JOptionPane.showConfirmDialog(this, message, "Add Student", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                try {
                    int id = Integer.parseInt(idField.getText());
                    String name = nameField.getText();
                    int age = Integer.parseInt(ageField.getText());
                    students.add(new Student(id, name, age));
                    outputArea.setText("Student added successfully!\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid data.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        private void viewStudents() {
            if (students.isEmpty()) {
                outputArea.setText("No students found.\n");
            } else {
                StringBuilder sb = new StringBuilder("Student List:\n");
                sb.append(String.format("%-10s %-20s %-5s\n", "ID", "Name", "Age"));
                sb.append("-------------------------------------------------\n");
                for (Student student : students) {
                    sb.append(String.format("%-10d %-20s %-5d\n", student.id, student.name, student.age));
                }
                outputArea.setText(sb.toString());
            }
        }

        private void searchStudentDialog() {
            String input = JOptionPane.showInputDialog(this, "Enter Student ID to search:");
            if (input != null) {
                try {
                    int id = Integer.parseInt(input);
                    for (Student student : students) {
                        if (student.id == id) {
                            outputArea.setText("Student Found:\n" + student + "\n");
                            return;
                        }
                    }
                    outputArea.setText("No student found with ID " + id + ".\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        private void deleteStudentDialog() {
            String input = JOptionPane.showInputDialog(this, "Enter Student ID to delete:");
            if (input != null) {
                try {
                    int id = Integer.parseInt(input);
                    Student toDelete = null;
                    for (Student student : students) {
                        if (student.id == id) {
                            toDelete = student;
                            break;
                        }
                    }
                    if (toDelete != null) {
                        students.remove(toDelete);
                        outputArea.setText("Student removed successfully!\n");
                    } else {
                        outputArea.setText("No student found with ID " + id + ".\n");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }   
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> {
            StudentManagementFrame frame = new StudentManagementFrame();
            frame.setVisible(true);
        });
    }
}
