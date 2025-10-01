import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LibraryManagementSystem extends Frame implements ActionListener {
    // Components
    Label lTitle, lAuthor, lSearch, lOutput;
    TextField tfTitle, tfAuthor, tfSearch;
    Button btnAdd, btnView, btnSearch, btnClear;
    TextArea taBooks;
    
    // Book storage
    ArrayList<String> books = new ArrayList<>();
    
    // Constructor
    public LibraryManagementSystem() {
        // Frame settings
        setTitle("Library Management System");
        setSize(600, 400);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        
        // Initialize components
        lTitle = new Label("Title:");
        lAuthor = new Label("Author:");
        lSearch = new Label("Search by Title:");
        lOutput = new Label("Output:");
        tfTitle = new TextField();
        tfAuthor = new TextField();
        tfSearch = new TextField();
        btnAdd = new Button("Add Book");
        btnView = new Button("View All Books");
        btnSearch = new Button("Search Book");
        btnClear = new Button("Clear");
        taBooks = new TextArea();
        taBooks.setEditable(false);
        
        // Set bounds for components
        lTitle.setBounds(50, 50, 50, 30);
        tfTitle.setBounds(120, 50, 200, 30);
        lAuthor.setBounds(50, 90, 50, 30);
        tfAuthor.setBounds(120, 90, 200, 30);
        btnAdd.setBounds(340, 50, 100, 30);
        btnView.setBounds(340, 90, 100, 30);
        lSearch.setBounds(50, 130, 100, 30);
        tfSearch.setBounds(160, 130, 160, 30);
        btnSearch.setBounds(340, 130, 100, 30);
        btnClear.setBounds(450, 130, 100, 30);
        lOutput.setBounds(50, 180, 100, 30);
        taBooks.setBounds(50, 220, 500, 120);
        
        // Add components to frame
        add(lTitle);
        add(tfTitle);
        add(lAuthor);
        add(tfAuthor);
        add(btnAdd);
        add(btnView);
        add(lSearch);
        add(tfSearch);
        add(btnSearch);
        add(btnClear);
        add(lOutput);
        add(taBooks);
        
        // Add action listeners
        btnAdd.addActionListener(this);
        btnView.addActionListener(this);
        btnSearch.addActionListener(this);
        btnClear.addActionListener(this);
        
        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            // Add book to the list
            String title = tfTitle.getText().trim();
            String author = tfAuthor.getText().trim();
            if (!title.isEmpty() && !author.isEmpty()) {
                books.add("Title: " + title + ", Author: " + author);
                taBooks.setText("Book added successfully!");
                tfTitle.setText("");
                tfAuthor.setText("");
            } else {
                taBooks.setText("Please fill in both fields.");
            }
        } else if (e.getSource() == btnView) {
            // View all books
            if (books.isEmpty()) {
                taBooks.setText("No books available.");
            } else {
                StringBuilder bookList = new StringBuilder("Books in Library:\n");
                for (String book : books) {
                    bookList.append(book).append("\n");
                }
                taBooks.setText(bookList.toString());
            }
        } else if (e.getSource() == btnSearch) {
            // Search for a book
            String searchTitle = tfSearch.getText().trim();
            if (!searchTitle.isEmpty()) {
                boolean found = false;
                for (String book : books) {
                    if (book.toLowerCase().contains(searchTitle.toLowerCase())) {
                        taBooks.setText("Book Found:\n" + book);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    taBooks.setText("No book found with the given title.");
                }
            } else {
                taBooks.setText("Please enter a title to search.");
            }
        } else if (e.getSource() == btnClear) {
            // Clear output area
            taBooks.setText("");
        }
    }
    
    public static void main(String[] args) {
        new LibraryManagementSystem();
    }
}
