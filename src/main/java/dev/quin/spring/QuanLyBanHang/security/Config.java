//package dev.quin.spring.QuanLyBanHang.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class Config {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.authorizeHttpRequests(
//                cofigere->cofigere
//                        .requestMatchers(HttpMethod.GET).hasAnyRole("ADMIN","MANAGER")
//        );
//        return http.build();
//    }
//}
