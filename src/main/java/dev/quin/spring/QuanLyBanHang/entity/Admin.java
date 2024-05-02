package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @Column(name = "admin_id",length = 10)
    private String admin_id;
    @Column(name = "name",length = 150)
    private String name;
    @Column(name = "phone_number",length = 10)
    private String phone_number;
    @Column(name = "email",length = 150)
    private String email;

    public Admin() {
    }

    public Admin(String admin_id
            , String name, String phone_number
            , String email) {
        this.admin_id = admin_id;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
