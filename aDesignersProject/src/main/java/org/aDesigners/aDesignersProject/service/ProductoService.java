package org.aDesigners.aDesignersProject.service;


import java.util.List;
import java.util.Optional;

import org.aDesigners.aDesignersProject.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

	private final ProductoRepository productoRepository;
	   // repositorio dentro de productoservice para conectarse a base de datos
		@Autowired
		public ProductoService(ProductoRepository productoRepository) {
			this.productoRepository = productoRepository;
		}// constructor
		
		public List<Producto> getProductos() {
			return productoRepository.findAll();
		}//getProductos
		
		public Producto getProducto(Long id) {
			return productoRepository.findById(id).orElseThrow(
					()->new IllegalArgumentException("Ël producto con el id "+ id + " no existe."));
		}//getProducto

		public Producto deleteProducto(Long id) {
			Producto tmpProd = null;
			if (productoRepository.existsById(id)) {
				tmpProd = productoRepository.findById(id).get();
				productoRepository.deleteById(id);
			}//if exist
			return tmpProd;
		}//deleteProducto
		
		public Producto addProducto(Producto producto) {
			Producto tmpProd = null;
			Optional<Producto> prodByName = productoRepository.findByNombre(producto.getNombre());
			
			if (prodByName.isPresent()) {
				throw new IllegalArgumentException("Ël producto con el nombre ["+producto.getNombre() + "] ya existe.");
			} else {
				productoRepository.save(producto);
				tmpProd = producto;
			}//else //if isPresent
			return tmpProd;
		}//addProducto
		
		public Producto updateProducto(Long id, String nombre, Double precio,Integer categoria_id, String img, String img2, String descripcion,
				String descripcion2) {
			Producto tmpProd = null;
			if(productoRepository.existsById(id)) {
				tmpProd= productoRepository.findById(id).get();
				if(nombre!=null) tmpProd.setNombre(nombre);
				if(precio!=null) tmpProd.setPrecio(precio.doubleValue());
				if(categoria_id!=null) tmpProd.setCategoria_id(categoria_id);
				if(img!=null) tmpProd.setImg(img);
				if(img2!=null) tmpProd.setImg2(img2);
				if(descripcion!=null) tmpProd.setDescripcion(descripcion);
				if(descripcion2!=null) tmpProd.setDescripcion2(descripcion2);
				
				
				
				productoRepository.save(tmpProd);
			} else {
				System.out.println("El producto con el id " + id + " no existe." );
				
			}//if
			return tmpProd;
		}//updateProducto
		
	}//class ProductoService


