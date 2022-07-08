package org.aDesigners.aDesignersProject.service;

import java.util.Optional;

import org.aDesigners.aDesignersProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository  extends JpaRepository<User, Long> {
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")
	Optional<User> findByNombre(String nombre);

}// interface UserRepository
