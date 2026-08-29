package domain.ecommerce;

public class Category {
    private Integer id;
    private String name;
    private String description;

    //CONSTRUCTOR

    public Category(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // GETTER Y SETTER


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //MÉTODOS (CRUD):
    public void create() {

    }

    public void selectById(int id) {

    }

    public void selectAll() {

    }

    public void update() {

    }

    public void delete(int id) {

    }
}


