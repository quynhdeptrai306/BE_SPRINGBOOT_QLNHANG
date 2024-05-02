package dev.quin.spring.QuanLyBanHang.dao;

import dev.quin.spring.QuanLyBanHang.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "invoices")
public interface InvoiceReponsitory extends JpaRepository<Invoice,String> {
}
