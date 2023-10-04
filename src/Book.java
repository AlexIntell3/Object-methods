import java.util.Objects;
public class Book {

    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author,int year) {
        this.title = title;
        this.author=author;
        this.year = year;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getAuthorFullName(){
        return author.getName()+" "+ author.getSurname();
    }
    @Override
    public String toString(){
        return getTitle()+" "+author+" "+getYear();
    }
    @Override
    public boolean equals (Object o){
        if (o==null || getClass() != o.getClass()) {
            return false;
        }
        if (this == o){
            return true;
        }
        Book book = (Book) o;
        return book.title.equals(title) && book.author.equals(author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}


