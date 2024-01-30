package cl.cachoza.app001.model;

import java.util.Date;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "tbl_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "")
	private long id;

	private String name;

	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	private String email;

	private String password;

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

	
	

	@Column(name="token")
	@GeneratedValue(strategy = GenerationType.UUID)
    private String token ;
    
    
	
    

	private Boolean isactive = true;

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public Usuario() {

	}

	public Usuario(String name, String email, String password) {

		this.name = name;
		this.email = email;
		this.password = password;

	}

	
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

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
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
		return "Usuario [id=" + this.id + ", name=" + this.name + ", email=" + this.email + ", password="
				+ this.password + ", create=" + this.create + ", modified=" + this.modified + ", last_login="
				+ this.last_login + ", token=" + this.token + ", isactive=" + this.isactive + "]";

	}

}