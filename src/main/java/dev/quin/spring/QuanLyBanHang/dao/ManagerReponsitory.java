package dev.quin.spring.QuanLyBanHang.dao;

import dev.quin.spring.QuanLyBanHang.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "managers")
public interface ManagerReponsitory extends JpaRepository<Manager,String> {
}
