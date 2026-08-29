package domain.ecommerce;

import java.util.Date;

public class Cart {
    private Integer id;
    private Date creationDate;
    private boolean status;

    //CONSTRUCTOR


    public Cart(Integer id, Date creationDate, boolean status) {
        this.id = id;
        this.creationDate = creationDate;
        this.status = status;
    }

    // GETTER Y SETTER


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
