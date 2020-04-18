package com.example.edu.microsvc.user.repository;

import com.example.edu.microsvc.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
