package com.example.db.repo;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.entities.ERole;
import com.example.db.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Serializable>{
	
	Optional<Role> findByRoleName(ERole name);

}
