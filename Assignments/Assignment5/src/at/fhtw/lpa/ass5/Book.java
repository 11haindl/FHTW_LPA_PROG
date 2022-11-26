package at.fhtw.lpa.ass5;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book() {
    }

    public Book(String title, String author, int yearOfPublication) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setYearOfPublication(yearOfPublication);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return title + ", " + author + ", " + yearOfPublication;
    }
}
