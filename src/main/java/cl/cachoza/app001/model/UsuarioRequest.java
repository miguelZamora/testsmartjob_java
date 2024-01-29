package cl.cachoza.app001.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRequest {
	
	
	private String name ;
	private String email ;
	private String password ;
	
	private String[]  phones;
	
	private String numero ; 
	private String citycode;  
	private String contrycode;
	
	

    ArrayList<String> lista = new ArrayList<>();


    //list

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

 
	public String getNumero() {
		return numero;
	}
 
	public void setNumero(String numero) {
		this.numero = numero;
	}
 
	public String getCitycode() {
		return citycode;
	}
 
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
 
	public String getContrycode() {
		return contrycode;
	}
 
	public void setContrycode(String contrycode) {
		this.contrycode = contrycode;
	}
 
 
	
	
	
}
