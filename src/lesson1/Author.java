package lesson1;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
