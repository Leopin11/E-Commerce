package domain.ecommerce;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer id;
    private Date date;
    private boolean status;
    private BigDecimal total;

    //CONSTRUCTOR

    public Order(Integer id, Date date, boolean status, BigDecimal total) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.total = total;
    }

    // GETTER Y SETTER


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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
