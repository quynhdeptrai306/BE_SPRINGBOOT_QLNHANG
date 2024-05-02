package dev.quin.spring.QuanLyBanHang.dao;

import dev.quin.spring.QuanLyBanHang.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "areas")
public interface AreaReponsitory extends JpaRepository<Area,String> {
}
