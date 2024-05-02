package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @Column(name = "food_id" ,length = 10)
    private String food_id;
    @Column(name = "food_name",length = 100)
    private String food_name;
    @Column(name = "descriptions",length = 200)
    private String descriptions;
    @Column(name = "price")
    private double price;
    @Column(name = "cotegory_id",length = 10)
    private String cotegory_id;
    @Column(name = "image",length = 150)
    private String image;
    @Column(name = "status",length = 10)
    private String status;

    public Food() {
    }

    public Food(String food_id
            , String food_name, String descriptions
            , double price, String cotegory_id
            , String image, String status) {
        this.food_id = food_id;
        this.food_name = food_name;
        this.descriptions = descriptions;
        this.price = price;
        this.cotegory_id = cotegory_id;
        this.image = image;
        this.status = status;
    }

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCotegory_id() {
        return cotegory_id;
    }

    public void setCotegory_id(String cotegory_id) {
        this.cotegory_id = cotegory_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
