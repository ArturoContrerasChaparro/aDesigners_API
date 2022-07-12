package org.aDesigners.aDesignersProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO
//Plain old Java Object
@Entity    // conectarse a base de datos
@Table(name="producto") // aqui indicas la tabla a la que te conectas
public class Producto {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false) //indicas la columna id y sus valores nulo y unico 
	private Long id;
	private String nombre;
	private double precio;
	private Integer categoria_id;
	@Column(name="img")
	private String img;
	@Column(name="img2")
	private String img2;
	private String descripcion;
	private String descripcion2;
	public Producto(Long id, String nombre, double precio,Integer categoria_id, String img, String img2, String descripcion,
			String descripcion2 ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria_id= categoria_id;
		this.img = img;
		this.img2 = img2;
		this.descripcion = descripcion;
		this.descripcion2 = descripcion2;
	}//constructor
	
	public Producto() {}//constructor
	
	public Long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Integer getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Integer categoria_id) {
		this.categoria_id = categoria_id;
	}

	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcion2() {
		return descripcion2;
	}
	public void setDescripcion2(String descripcion2) {
		this.descripcion2 = descripcion2;
	}
	

	
	

	
	
	
	

}//class Producto
