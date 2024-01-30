package cl.cachoza.app001.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_phonos")
public class Telefono {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;

	@Column(name = "number")
	private String number;
	
	@Column(name = "citycode")
	private String citycode;
	
	@Column(name = "contrycode")
	private String contrycode;
	
	@Column(name = "usuario_id")
	private String usuario_id;
	
	@Column(name = "active")
	private Boolean active = true;
	
	
	@Column(name = "create")
	@Temporal(TemporalType.DATE)
	private Date create;
	@PrePersist
	public void prePersist() {
		create = new Date();
	}
	

	public Telefono() {

	}

	Telefono(String number, String citycode, String contrycode) {
		this.number = number;
		this.citycode = citycode;
		this.contrycode = contrycode;
	}

	public Telefono(long id, String number, String citycode, String contrycode, String usuario_id) {

		this.id = id;
		this.number = number;
		this.citycode = citycode;
		this.contrycode = contrycode;
		this.usuario_id = usuario_id;
	}

	

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
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}


	@Override
	public String toString() {
		return "Telefono [id=" + id + ", number=" + number + ", citycode=" + citycode + ", contrycode=" + contrycode
				+ ", usuario_id=" + usuario_id + ", active=" + active + ", create=" + create + ", getId()=" + getId()
				+ ", getNumber()=" + getNumber() + ", getCitycode()=" + getCitycode() + ", getContrycode()="
				+ getContrycode() + ", getUsuario_id()=" + getUsuario_id() + ", getActive()=" + getActive()
				+ ", getCreate()=" + getCreate() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}


	
	
	
	
	
}
