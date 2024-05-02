package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoiceDetail")
public class InvoiceDetail {
    @Id
    @Column(name = "invoice_detail_id", length = 10)
    private String invoiceDetail_id;
    @Column(name = "invoice_id", length = 10)
    private String invoice_id;
    @Column(name = "food_id",length = 10)
    private String food_id;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "unit_price")
    private double unit_price ;

    public InvoiceDetail() {
    }

    public InvoiceDetail(String invoiceDetail_id
            , String invoice_id, String food_id
            , int quantity, double unit_price) {
        this.invoiceDetail_id = invoiceDetail_id;
        this.invoice_id = invoice_id;
        this.food_id = food_id;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }

    public String getInvoiceDetail_id() {
        return invoiceDetail_id;
    }

    public void setInvoiceDetail_id(String invoiceDetail_id) {
        this.invoiceDetail_id = invoiceDetail_id;
    }

    public String getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(String invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }
}
