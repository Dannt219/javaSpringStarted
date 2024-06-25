package com.aidan.starter_spring_boot.repository;

import com.aidan.starter_spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRopository extends JpaRepository<User, String> {

}
