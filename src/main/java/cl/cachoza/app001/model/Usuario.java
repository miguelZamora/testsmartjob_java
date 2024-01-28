package cl.cachoza.app001.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


 
@Entity
@Table(name = "tbl_usuarios")
public class Usuario {

	private long id;
	private String name;

	
	private String email;
	private String password;

	
	 /* 
	  * actualizacion uso de aspectos   
	  * */
	
	@Column(name = "modified")
	@Temporal(TemporalType.DATE)
	private Date modified;
	@PostUpdate 
	public void postUpdate() {
		modified = new Date();
	}
		
	@Column(name = "last_login")
	@Temporal(TemporalType.DATE)
	private Date last_login;
		@PostLoad 
	private void postLoad() {
		last_login = new Date();
	}
	
	@Column(name = "create")
	@Temporal(TemporalType.DATE)
	private Date create;
	@PrePersist
	public void prePersist() {
		create = new Date();
	}
	

	
	
	private String token;
	public Usuario() {

	}

	public Usuario( String name, String email, String password, String token) {
		this.name 		= name;
		this.email 		= email;
		this.password 	= password;
		this.token 		= token;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date  getCreate() {
		return create;
	}

	public void setCreate(Date  create) {
		this.create = create;
	}

	public Date  getModified() {
		return modified;
	}

	public void setModified(Date  modified) {
		this.modified =  modified ;
	}

	public Date  getLast_login() {
		return last_login;
	}

	public void setLast_login(Date  last_login) {
		this.last_login = last_login;
	}

	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}

	
	@Override
	public String toString() {
		return "Usuario [id=" + this.id + ", name=" + this.name + ", email=" + this.email + ", password=" + this.password + ", create=" + this.create + ", modified=" + this.modified +  ", last_login=" + this.last_login +  ", token=" + this.token +"]";
	}
	
}
