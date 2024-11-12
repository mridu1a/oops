import java.util.Scanner;

class BookDetails {  // Changed class name to follow Java naming conventions
    String title, author;
    float price;

    public void read(String a, String b, float c) {
        title = a;
        author = b;
        price = c;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDetails b1 = new BookDetails();

        System.out.println("Enter the title:");
        String title = sc.nextLine();

        System.out.println("Enter the author name:");
        String author = sc.nextLine();

        System.out.println("Enter the price:");
        float price = sc.nextFloat();

        b1.read(title, author, price);
        b1.display();

        sc.close(); // It's good practice to close the scanner after use
    }
}
