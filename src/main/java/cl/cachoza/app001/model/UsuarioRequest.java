package cl.cachoza.app001.model;





public class UsuarioRequest {

	private String name;
	private String email;
	private String password;
	private String usuario_id;

	private String numero;

	

	private String citycode;
	private String contrycode;

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

	public String getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(String usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	public UsuarioRequest() {
	}

	public UsuarioRequest(String name, String email, String password, String numero, String citycode,
			String contrycode, String usuario_id) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.numero = numero;
		this.citycode = citycode;
		this.contrycode = contrycode;
		this.usuario_id = usuario_id;
	}

}
