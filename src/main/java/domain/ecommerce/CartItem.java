package domain.ecommerce;

import java.math.BigDecimal;

public class CartItem {
    private Integer id;
    private int amount;
    private BigDecimal price;

    //CONSTRUCTOR

    public CartItem(Integer id, int amount, BigDecimal price) {
        this.id = id;
        this.amount = amount;
        this.price = price;
    }

    // GETTER Y SETTER


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
