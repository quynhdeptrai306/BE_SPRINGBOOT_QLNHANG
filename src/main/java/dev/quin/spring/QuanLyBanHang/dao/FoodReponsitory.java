package dev.quin.spring.QuanLyBanHang.dao;

import dev.quin.spring.QuanLyBanHang.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "foods")
public interface FoodReponsitory extends JpaRepository<Food,String> {
}
