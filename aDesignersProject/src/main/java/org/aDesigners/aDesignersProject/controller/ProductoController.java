package org.aDesigners.aDesignersProject.controller;


import java.util.List;

import org.aDesigners.aDesignersProject.model.Producto;
import org.aDesigners.aDesignersProject.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping (path="/api/products/")
public class ProductoController {
	private final ProductoService productoService;
	@Autowired
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}// constructor
	
	//CRUD
	@GetMapping
	public List<Producto> getAllProductos(){
		return productoService.getProductos();
	}//getAllProductos
	
	@GetMapping(path="{prodId}")
	public Producto getProducto(@PathVariable("prodId") Long id){
		return productoService.getProducto(id);
	}//getProducto
	
	@DeleteMapping(path="{prodId}")
	public Producto deleteProducto(@PathVariable("prodId") Long id){
		return productoService.deleteProducto(id);
	}//deleteProducto
	
	@PostMapping
	public Producto addProducto(@RequestBody Producto producto){
		return productoService.addProducto(producto);
	}//addProducto
	
	@PutMapping(path="{prodId}")
	public Producto updateProducto(@PathVariable("prodId") Long id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) Double precio,
			@RequestParam(required = false) Integer categoria_id,
			@RequestParam(required = false) String img,
			@RequestParam(required = false) String img2,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String descripcion2) {
		return productoService.updateProducto(id, nombre, precio, categoria_id, img, img2, descripcion, descripcion2);
	}//deleteProducto
	
}//class ProdictpController
