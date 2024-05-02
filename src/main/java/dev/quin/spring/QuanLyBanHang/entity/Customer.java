package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customner")
public class Customer {
    @Id
    @Column(name = "customer_id",length = 10)
    private String customer_id;
    @Column(name = "full_name",length = 200)
    private String full_name;
    @Column(name = "phone_number",length = 10)
    private String phone_number;
    @Column(name = "email",length = 50)
    private String email;
    @Column(name = "address",length = 200)
    private String address;

    public Customer() {
    }

    public Customer(String customer_id
            , String full_name, String phone_number
            , String email, String address) {
        this.customer_id = customer_id;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email = email;
        this.address = address;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
