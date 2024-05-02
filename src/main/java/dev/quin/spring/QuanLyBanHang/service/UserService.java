package dev.quin.spring.QuanLyBanHang.service;

import dev.quin.spring.QuanLyBanHang.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    public User findByUsername(String username);
    public List<User> getUserByUsername(String username);


    public void save(User user);

}
