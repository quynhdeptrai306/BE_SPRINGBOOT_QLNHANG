package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "table")
public class Tables {
    @Id
    @Column(name = "table_id",length = 10)
    private String table_id;
    @Column(name = "name",length = 100)
    private String name;
    @Column(name = "number_of_seats")
    private int number_of_seats;
    @Column(name = "area_id",length = 10)
    private String area_id;
    @Column(name = "status",length = 50)
    private String status;

    public Tables() {
    }

    public Tables(String table_id
            , String name, int number_of_seats
            , String area_id, String status) {
        this.table_id = table_id;
        this.name = name;
        this.number_of_seats = number_of_seats;
        this.area_id = area_id;
        this.status = status;
    }

    public String getTable_id() {
        return table_id;
    }

    public void setTable_id(String table_id) {
        this.table_id = table_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
