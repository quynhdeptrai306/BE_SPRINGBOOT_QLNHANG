package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Employee {
    @Id
    @Column(name = "employee_id",length = 10)
    private String employee_id;
    @Column(name = "full_name", length = 200)
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
    @Column(name = "employment_status",length = 100)
    private String employment_status;
    @Column(name = "manager_id",length = 10)
    private String manager_id;
    @Column(name = "timekeeping_id",length = 10)
    private String timekeeping_id;
    public Employee() {
    }

    public Employee(String employee_id, String full_name
            , Date dob, String phone_number, String gender, String email
            , String address, Date start_date, double salary, String employment_status
            , String manager_id, String timekeeping_id) {
        this.employee_id = employee_id;
        this.full_name = full_name;
        this.dob = dob;
        this.phone_number = phone_number;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.start_date = start_date;
        this.salary = salary;
        this.employment_status = employment_status;
        this.manager_id = manager_id;
        this.timekeeping_id = timekeeping_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
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

    public String getEmployment_status() {
        return employment_status;
    }

    public void setEmployment_status(String employment_status) {
        this.employment_status = employment_status;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }
    public String getTimekeeping_id() {
        return timekeeping_id;
    }

    public void setTimekeeping_id(String timekeeping_id) {
        this.timekeeping_id = timekeeping_id;
    }
}
