package shop.entity;

public class Entity {
    protected Long id;

    public Entity() {
        super();
    }

    public Entity(Long id) {
        super();
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long value) {
        this.id = value;
    }

}
