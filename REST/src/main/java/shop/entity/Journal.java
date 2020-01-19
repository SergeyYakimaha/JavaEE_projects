package shop.entity;

import java.util.List;

public class Journal
        extends Product {

    protected String isbn;

    public Journal() {
        super();
    }

    public Journal(Long id, String title, double price, List<String> categories, String description, String isbn) {
        super(id, title, price, categories, description);
        this.isbn = isbn;
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
        builder.append("Journal [id=");
        builder.append(id);
        builder.append(", title=");
        builder.append(title);
        builder.append(", price=");
        builder.append(price);
        builder.append(", categories=");
        builder.append(categories);
        builder.append(", description=");
        builder.append(description);
        builder.append(", isbn=");
        builder.append(isbn);
        builder.append("]");
        return builder.toString();
    }

}
