package domain.ecommerce;

import java.util.Date;

public class Customer extends User{
    //NO HAY ATRIBUTOS PROPIOS. SE HEREDA TODO_.

    //CONSTRUCTOR


    public Customer(Integer id, String name, String phone, String email, String password, String address, Date registrationDate, int age) {
        super(id, name, phone, email, password, address, registrationDate, age);
    }



    //MÉTODOS (CRUD):
    @Override
    public void create() {

    }

    @Override
    public void selectById(int id) {

    }

    @Override
    public void selectAll() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {

    }
}
