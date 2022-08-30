package lesson1;

public class Book {

    private String nameBook;
    private Author author;
    private int yearPublication;

    public Book(String nameBook, Author author, int publicationYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = publicationYear;
    }

    public Book() {
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + ", автор: " + author + ", год публикации: " + yearPublication;
    }

}
