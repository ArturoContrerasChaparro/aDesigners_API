package org.backend.backend;

public class Login {

	private String correo;
	private String contrasena;
	private int id;
	private static int total=0;
	public Login(String correo, String contrasena) {
		super();
		this.correo = correo;
		this.contrasena = contrasena;
		total ++;
		this.id = total;
		
	}//constructor
	
	public Login() {
		total ++;
		this.id = total;
	}//constructor

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
//class Login