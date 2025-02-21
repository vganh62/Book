package Book;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    String status;

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, quantity, status);
        this.status = status;
    }

    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter status: ");
        status = scanner.nextLine();
    }

    public void updateBook() {
        super.updateBook(id);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter status: ");
        status = scanner.nextLine();
    }

    public void displayBook() {
        super.displayBook();
        System.out.print("status: " + status);
    }
}
