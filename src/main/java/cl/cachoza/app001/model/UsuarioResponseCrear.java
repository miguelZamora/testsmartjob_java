package cl.cachoza.app001.model;

import java.util.Date;

public class UsuarioResponseCrear {
	
	
		private Long id;
		private Date created;
		private Date modified;
		private Date last_login;
		private String token;
		private Boolean isactive;
		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * @return the created
		 */
		public Date getCreated() {
			return created;
		}
		/**
		 * @param created the created to set
		 */
		public void setCreated(Date created) {
			this.created = created;
		}
		/**
		 * @return the modified
		 */
		public Date getModified() {
			return modified;
		}
		/**
		 * @param modified the modified to set
		 */
		public void setModified(Date modified) {
			this.modified = modified;
		}
		/**
		 * @return the last_login
		 */
		public Date getLast_login() {
			return last_login;
		}
		/**
		 * @param last_login the last_login to set
		 */
		public void setLast_login(Date last_login) {
			this.last_login = last_login;
		}
		/**
		 * @return the token
		 */
		public String getToken() {
			return token;
		}
		/**
		 * @param token the token to set
		 */
		public void setToken(String token) {
			this.token = token;
		}
		/**
		 * @return the isactive
		 */
		public Boolean getIsactive() {
			return isactive;
		}
		/**
		 * @param isactive the isactive to set
		 */
		public void setIsactive(Boolean isactive) {
			this.isactive = isactive;
		}
		
		
		public String getMessageEmail(String mensaje)	{
			mensaje = "email no valido";
			
			
			
			return mensaje;

		}

}
