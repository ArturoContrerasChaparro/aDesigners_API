package org.backend.backend;


public class Producto {
	private int id;
	private static int total=0;
	private String nombre;
	private double precio;
	private String imagen;
	private String imgagenTwo;
	private String descripcion;
	private String descripcion2;
	public Producto(String nombre, double precio, String imagen, String imgagenTwo, String descripcion,
			String descripcion2) {
		super();
		total ++;
		this.id = total;
		this.nombre = nombre;
		this.precio = precio;
		this.imagen = imagen;
		this.imgagenTwo = imgagenTwo;
		this.descripcion = descripcion;
		this.descripcion2 = descripcion2;
	}//Constructor
	
	public Producto() {
		total ++;
		this.id = total;
	}//constructor

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getImgagenTwo() {
		return imgagenTwo;
	}

	public void setImgagenTwo(String imgagenTwo) {
		this.imgagenTwo = imgagenTwo;
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
