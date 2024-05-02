package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "review")
public class Review {
    @Id
    @Column(name = "review_id",length = 10)
    private String review_id;
    @Column(name = "customer_id",length = 10)
    private String customer_id;
    @Column(name = "date_time")
    private Date date_time;
    @Column(name = "rating")
    private int rating;
    @Column(name = "comment",length = 500)
    private String comment;
    @Column(name = "food_id",length = 10)
    private String food_id;

    public Review() {
    }

    public Review(String review_id
            , String customer_id, Date date_time
            , int rating, String comment, String food_id) {
        this.review_id = review_id;
        this.customer_id = customer_id;
        this.date_time = date_time;
        this.rating = rating;
        this.comment = comment;
        this.food_id = food_id;
    }

    public String getReview_id() {
        return review_id;
    }

    public void setReview_id(String review_id) {
        this.review_id = review_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public Date getDate_time() {
        return date_time;
    }

    public void setDate_time(Date date_time) {
        this.date_time = date_time;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }
}
