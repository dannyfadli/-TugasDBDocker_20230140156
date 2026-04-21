package com.example.pratikum6.repository;

import com.example.pratikum6.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,String> {
}
