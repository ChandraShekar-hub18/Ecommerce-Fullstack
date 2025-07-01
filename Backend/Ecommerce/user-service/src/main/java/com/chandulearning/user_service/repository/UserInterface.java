package com.chandulearning.user_service.repository;

import com.chandulearning.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<User, Integer> {
}
