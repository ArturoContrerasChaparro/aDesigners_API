package org.backend.backend;

public class User {
	private String nombre;
	private String correo;
	private String tel;
	private String contrasena;
	private int id;
	private static int total=0;
	public User(String nombre, String correo, String tel, String contrasena) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.tel = tel;
		this.contrasena = contrasena;
		total ++;
		this.id =total;
	}//consructor
	
	public User() {
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
