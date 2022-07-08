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
@Table(name="usuario") // aqui indicas la tabla a la que te conectas
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false) //indicas la columna id y sus valores nulo y unico 
	private Long id;
	private String nombre;
	private String correo;
	private String tel;
	private String contrasena;
	public User(Long id, String nombre, String correo, String tel, String contrasena) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.tel = tel;
		this.contrasena = contrasena;
	
}//constructor

	public User () {}//constructor

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	
	}//class User
