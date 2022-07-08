package org.backend.backend.services;

import java.util.ArrayList;

import org.backend.backend.Login;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
public final ArrayList<Login> lista = new ArrayList <Login>();
	
	public LoginService() {
		lista.add(new Login ("omartinez2343@gmail.com","pajaroazul2") );
		lista.add(new Login ("jesusomartrco@hotmail.com","lerma1995") );
		lista.add(new Login ("superedir12pro@gmail.com","ireliaflow") );
		lista.add(new Login ("noobmaster69thortillero@gmail.com","diosdeltrueno") );
		lista.add(new Login ("fermontegrande@hotmail.com", "Fer34SD") );
		}// constructor
	
	public ArrayList<Login> getLogins(){
		return lista;
	}
	public Login getLogin(Long id) {
	Login tmpUser = null;
		for (Login user : lista) {
		if(user.getId()==id) {
			tmpUser= user;
			break;
		}//if
	}//foreach
		return tmpUser;
	}// getLogin
	
	public Login addLogin(Login login) {
		lista.add(login);
		return login;
	}//addLogin

}//class LoginService
