package cl.cachoza.app001.model;

import java.util.HashMap;

public class UsuarioRequest {

	private String name;
	private String email;
	private String password;
	
	private String token;
	private Long usuario_id;
	
	private String number;
	private String citycode;
	private String contrycode;

   // private String  phones[] = new String [3]; 

    private HashMap<String, String>  phones = new HashMap<String, String>();
    
    
    
    public UsuarioRequest() {
	}
    
    public UsuarioRequest(String number, String citycode, String contrycode) {
		super();
		this.number = number;
		this.citycode = citycode;
		this.contrycode = contrycode;
	}
  
	
    
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}
	
 
	
	public HashMap<String, String> getPhones() {
		return phones;
	}

	public void setPhones(HashMap<String, String> phones) {
		this.phones = phones;
	}

	


	
	
	
	
	
	
	


}
