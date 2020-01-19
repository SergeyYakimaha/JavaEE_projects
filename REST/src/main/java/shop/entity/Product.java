package shop.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Product extends Entity {
    protected String title;
    protected double price;
    protected List<String> categories;
    protected String description;

    public Product() {
        super();
    }

    public Product(String params) {
        System.out.println(params);
    }

    public Product(Long id, String title, double price, List<String> categories, String description) {
        super(id);
        this.title = title;
        this.price = price;
        this.categories = categories;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double value) {
        this.price = value;
    }

    public List<String> getCategories() {
        if (categories == null) {
            categories = new ArrayList<String>();
        }
        return this.categories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

}