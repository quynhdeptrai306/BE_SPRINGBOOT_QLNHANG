package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Timer;

@Entity
@Table(name ="")
public class Attendance {
    @Id
    @Column(name = "attendance",length = 10)
    private String attendance;
    @Column(name = "date_of_employee")
    private Date date_of_employee;
    @Column(name = "clock_in_time")
    private String clock_in_time;
    @Column(name = "clock_out_time")
    private String clock_out_time;
    @Column(name = "employee_id")
    private String employee_id;

    public Attendance() {
    }

    public Attendance(String attendance
            , Date date_of_employee, String clock_in_time
            , String clock_out_time, String employee_id) {
        this.attendance = attendance;
        this.date_of_employee = date_of_employee;
        this.clock_in_time = clock_in_time;
        this.clock_out_time = clock_out_time;
        this.employee_id = employee_id;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public Date getDate_of_employee() {
        return date_of_employee;
    }

    public void setDate_of_employee(Date date_of_employee) {
        this.date_of_employee = date_of_employee;
    }

    public String getClock_in_time() {
        return clock_in_time;
    }

    public void setClock_in_time(String clock_in_time) {
        this.clock_in_time = clock_in_time;
    }

    public String getClock_out_time() {
        return clock_out_time;
    }

    public void setClock_out_time(String clock_out_time) {
        this.clock_out_time = clock_out_time;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}
