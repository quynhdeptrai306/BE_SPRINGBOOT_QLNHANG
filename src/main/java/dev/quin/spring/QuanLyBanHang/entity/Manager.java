package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "manager")
public class Manager {
    @Id
    @Column(name = "manager_id",length = 10)
    private String manager_id;
    @Column(name = "full_name",length = 200)
    private String full_name;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "phone_number",length = 10)
    private String phone_number;
    @Column(name = "gender",length = 20)
    private String gender;
    @Column(name = "email",length = 150)
    private String email;
    @Column(name = "address",length = 300)
    private String address;
    @Column(name = "start_date")
    private Date start_date;
    @Column(name = "salary")
    private double salary;
    @Column(name = "status",length = 100)
    private String status;
    @Column(name = "admin_id",length = 10)
    private String admin_id;

    public Manager() {
    }

    public Manager(String manager_id
            , String full_name, Date dob
            , String phone_number, String gender
            , String email, String address
            , Date start_date, double salary
            , String status, String admin_id) {
        this.manager_id = manager_id;
        this.full_name = full_name;
        this.dob = dob;
        this.phone_number = phone_number;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.start_date = start_date;
        this.salary = salary;
        this.status = status;
        this.admin_id = admin_id;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }
}
