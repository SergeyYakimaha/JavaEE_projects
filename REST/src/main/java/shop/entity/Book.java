package shop.entity;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "book")
public class Book extends Product {

    protected List<String> author;
    protected String isbn;

    public Book() {
        super();
    }

    public Book(Long id, String title, double price, List<String> categories, String description, List<String> author,
                String isbn) {
        super(id, title, price, categories, description);
        this.author = author;
        this.isbn = isbn;
    }

    public List<String> getAuthor() {
        if (author == null) {
            author = new ArrayList<String>();
        }
        return this.author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String value) {
        this.isbn = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Book [id=");
        builder.append(id);
        builder.append(", title=");
        builder.append(title);
        builder.append(", price=");
        builder.append(price);
        builder.append(", categories=");
        builder.append(categories);
        builder.append(", description=");
        builder.append(description);
        builder.append(", author=");
        builder.append(author);
        builder.append(", isbn=");
        builder.append(isbn);
        builder.append("]");
        return builder.toString();
    }

}
