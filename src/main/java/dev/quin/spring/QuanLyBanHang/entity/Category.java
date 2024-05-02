package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_id",length = 10)
    private String category_id;
    @Column(name = "name",length =150 )
    private String name;
    @Column(name = "descriptions",length = 200)
    private String descriptions;

    public Category() {
    }

    public Category(String category_id, String name, String descriptions) {
        this.category_id = category_id;
        this.name = name;
        this.descriptions = descriptions;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
