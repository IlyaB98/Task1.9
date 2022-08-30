package lesson1;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            }
        }
    }

    public void printBook(String nameBook) {
        for (int i = 0; i < books.length - 1; i++) {
            if (Objects.equals(books[i].getNameBook(), nameBook)) {
                System.out.println(books[i].getNameBook() + " was published in " + books[i].getYearPublication());
                break;
            }
        }
    }

    public void replaceYearPublication(String nameBook, int newYearPublication) {
        for (int i = 0; i < books.length - 1; i++) {
            if (Objects.equals(books[i].getNameBook(), nameBook)) {
                books[i].setYearPublication(newYearPublication);
                break;
            }
        }
    }

    @Override
    public String toString() {
       String stringLibrary = Arrays.toString(books);
       stringLibrary = stringLibrary.replace("[", "")
                .replace("]", "")
                .replace(", ", "\n");

        return "Library:" + "\n" + stringLibrary;

    }
}
