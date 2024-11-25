package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // dùng để khai bao với Spring Boot rang đay là 1 entity biểu diễn table
@Data // annotation này sẽ tự động khai bao getter va setter cho class
@AllArgsConstructor // dùng để khai báo constructor với tất cả các properties
@NoArgsConstructor // dùng để khai báo constructor rỗng không có param
public class UserInfo {
@Id
@GeneratedValue(strategy = GenerationType. IDENTITY)
private int id;
private String name;
private String email;
private String password;
private String roles;
}