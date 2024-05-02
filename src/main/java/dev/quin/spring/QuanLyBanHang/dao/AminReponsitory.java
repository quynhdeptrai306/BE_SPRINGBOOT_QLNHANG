package dev.quin.spring.QuanLyBanHang.dao;

import dev.quin.spring.QuanLyBanHang.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "admins")
public interface AminReponsitory extends JpaRepository<Admin,String> {

}
