package cl.cachoza.app001.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_phonos")

public class Telefono {
	
	private long id;
	private String number;
	private String citycode;
	private String contrycode;
	private String usuario_id;
	private Boolean active = true;
	
	
	@Column(name = "create")
	@Temporal(TemporalType.DATE)
	private Date create;
	@PrePersist
	public void prePersist() {
		create = new Date();
	}
	
 
	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}


	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}


	/**
	 * @return the create
	 */
	public Date getCreate() {
		return create;
	}


	/**
	 * @param create the create to set
	 */
	public void setCreate(Date create) {
		this.create = create;
	}


	public Telefono() {
	
	}
	
	public Telefono(String number, String citycode, String contrycode) {
		this.number = number;
		this.citycode = citycode;
		this.contrycode = contrycode;
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
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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
	
	
	
	
	

}
