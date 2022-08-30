package lesson1;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", author1, 1865);
        System.out.println("book1 = " + book1);

        Author author2 = new Author("Вениамин", "Каверин");
        Book book2 = new Book("Два капитана", author2, 1945);
        System.out.println("book2 = " + book2);

        book2.setYearPublication(1938);

        System.out.println("book2 = " + book2);
        System.out.println();

        Book[] books = new Book[5];
        books[0] =book1;
        addBook(books, book2);
        System.out.println(books[1]);

    }

    public static void addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            }
            System.out.println(books[i]);
        }
    }
}
