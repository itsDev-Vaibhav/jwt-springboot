package com.example.db.repo;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.entities.User;

public interface UserRepository extends JpaRepository<User, Serializable>{

	Optional<User> findByUserName(String username);

	  Boolean existsByUserName(String username);

	  Boolean existsByEmail(String email);

}
