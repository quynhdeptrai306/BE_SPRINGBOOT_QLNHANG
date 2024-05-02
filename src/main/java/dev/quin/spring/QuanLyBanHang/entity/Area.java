package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "area")
public class Area {
    @Id
    @Column(name = "area_id",length = 10)
    private String area_id;
    @Column(name = "area_name",length = 100)
    private String area_name;
    @Column(name = "descriptions",length = 250)
    private String descriptions;

    public Area() {
    }

    public Area(String area_id, String area_name, String descriptions) {
        this.area_id = area_id;
        this.area_name = area_name;
        this.descriptions = descriptions;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
