package dev.quin.spring.QuanLyBanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @Column(name = "invoice_id",length = 10)
    private String invoice_id;
    @Column(name = "customer_id",length = 10)
    private String customer_id;
    @Column(name = "employee_id",length = 10)
    private String employee_id;
    @Column(name = "table_id",length = 10)
    private String table_id;
    @Column(name = "oder_date")
    private Date oder_date;
    @Column(name = "total_amount")
    private double total_amount;
    @Column(name = "payment_status",length = 50)
    private String payment_status;
    @Column(name = "payment_method",length = 50)
    private String payment_method;

    public Invoice() {
    }

    public Invoice(String invoice_id
            , String customer_id, String employee_id
            , String table_id, Date oder_date
            , double total_amount, String payment_status
            , String payment_method) {
        this.invoice_id = invoice_id;
        this.customer_id = customer_id;
        this.employee_id = employee_id;
        this.table_id = table_id;
        this.oder_date = oder_date;
        this.total_amount = total_amount;
        this.payment_status = payment_status;
        this.payment_method = payment_method;
    }

    public String getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(String invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getTable_id() {
        return table_id;
    }

    public void setTable_id(String table_id) {
        this.table_id = table_id;
    }

    public Date getOder_date() {
        return oder_date;
    }

    public void setOder_date(Date oder_date) {
        this.oder_date = oder_date;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }
}
