package org.aDesigners.aDesignersProject.service;

import java.util.Optional;

import org.aDesigners.aDesignersProject.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository  extends JpaRepository<Producto, Long> {
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")
	Optional<Producto> findByNombre(String nombre);
	
}// interface ProductoRepository
