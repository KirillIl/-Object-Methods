import java.util.Objects;

public class Book {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && bookName.equals(book.bookName) && author.equals(book.author);
    }

    private final String bookName;
    private final Author author;
    private int publishingYear;
    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public Author getAuthorName() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
        return bookName + ": " + author + " " + publishingYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishingYear);
    }

}