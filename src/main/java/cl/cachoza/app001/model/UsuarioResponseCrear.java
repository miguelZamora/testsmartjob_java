package cl.cachoza.app001.model;

import java.util.Date;

public class UsuarioResponseCrear {
	
	
		private Long id;
		private String name;
		private Date created;
		private Date modified;
		private Date last_login;
		private String token;
		private Boolean isactive;
 
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Date getCreated() {
			return created;
		}
		public void setCreated(Date created) {
			this.created = created;
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
		public Boolean getIsactive() {
			return isactive;
		}
		public void setIsactive(Boolean isactive) {
			this.isactive = isactive;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMessageEmail(String mensaje)	{
			mensaje = "email no valido";
			return mensaje;

		}

}
