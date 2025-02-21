package Book;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter status: ");
        tax = scanner.nextDouble();
    }

    public void updateBook() {
        super.updateBook(id);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tax: ");
        tax = scanner.nextDouble();
    }

    public void displayBook() {
        super.displayBook();
        System.out.print("tax: " + tax);
    }
}
