package org.backend.backend.controllers;

import java.util.List;

import org.backend.backend.Producto;
import org.backend.backend.services.ProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping (path="/products/")
public class FirstController {
private final ProductoServices productoServices;
	
	@Autowired
	public FirstController (ProductoServices productoServices) {
		this.productoServices = productoServices;
	}// constructor
	@GetMapping
	public List<Producto>  getAllProducts() {
		return productoServices.getProductos();
	}//getAll Products
	//public String inicio() {
		//return "CH13 Rules !!!";
	@GetMapping  (path="{prodId}")
	public Producto getProduct(@PathVariable("prodId")Long id) {
		return productoServices.getProducto(id);
	
	}//getProduct
	
	@DeleteMapping  (path="{prodId}")
	public Producto deleteProduct(@PathVariable("prodId")Long id) {
		return productoServices.deleteProducto(id);
	}//DeleteMapping
	
	@PostMapping 
	public Producto addProduct(@RequestBody Producto producto) {
		return productoServices.addProducto(producto);
	}//addProduct
	@PutMapping (path="{prodId}")
	public Producto updateProduct(@PathVariable("prodId")Long id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) Double precio,
			@RequestParam(required = false) String imagen,
			@RequestParam(required = false) String imagenTwo,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String descripcion2) {
		return productoServices.updateProduct(id, 
				nombre, precio, imagen, imagenTwo, descripcion,
				descripcion2);
	}//PutMapping
	
	

}//class FirstController
