package domain.ecommerce;

import java.math.BigDecimal;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;

    //CONSTRUCTOR

    public Product(Integer id, String name, String description, BigDecimal price, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
