package cl.cachoza.app001.controller;

 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.cachoza.app001.exception.ErrorDetails;
import cl.cachoza.app001.exception.ResourceNotFoundException;
import cl.cachoza.app001.model.Usuario;
import cl.cachoza.app001.model.Telefono;
import cl.cachoza.app001.model.UsuarioRequest;
import cl.cachoza.app001.model.UsuarioResponseCrear;

import cl.cachoza.app001.repository.TelefonosRepository;
import cl.cachoza.app001.repository.UsuarioRepository;
 
import cl.cachoza.app001.util.ValidarUsuario;
import jakarta.validation.Valid;
 
 

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")


public class UsuariosController {
	
	@Autowired
	private UsuarioRepository usrRepository;

	@Autowired
	private TelefonosRepository teleRepository;	
	
	
	@GetMapping("/usuarios")
	public List<Usuario> getAllUsusarios() {
		return usrRepository.findAll();
	}

	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Object> getUsuarioById(@PathVariable(value = "id") Long usuarioId)
			throws ResourceNotFoundException {
		
		UsuarioResponseCrear usuarios2 = new UsuarioResponseCrear();
		Telefono teleInRequest = new Telefono();
	
		try {
			Usuario usuarios = usrRepository.findById(usuarioId)
					.orElseThrow(() -> new ResourceNotFoundException("usuario no encontrado para este id :: " + usuarioId));
	
			usuarios2.setId( usuarios.getId());
			usuarios2.setCreated( usuarios.getCreate()) ;
			usuarios2.setModified( usuarios.getModified() );
			usuarios2.setLast_login( usuarios.getLast_login() );
			usuarios2.setToken( usuarios.getToken() );
			usuarios2.setIsactive(usuarios.getIsactive());
			
			return 	new ResponseEntity<>( usuarios , HttpStatus.OK);
			
		}catch (Exception e) {
			String resp1 = "{'mensaje' : '"  + e.getMessage() + "'}" ;
			
			return 	new ResponseEntity<>( resp1 , HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/usuarios")
	public ResponseEntity<Object> createUsuario(@RequestBody UsuarioRequest usuarioRequest) { 

		Usuario usuarioIn = new Usuario();
		Usuario uResponse = new Usuario();
		Telefono teleInRequest = new Telefono();
		Telefono teleInResponse = new Telefono();
		
		System.out.println("usuarioRequest " + usuarioRequest );
		
		
		System.out.println("post getPhones.get('number' : " + usuarioRequest.getPhones().get("number"));
		System.out.println("post getPhones.get('citycode' : " +usuarioRequest.getPhones().get("citycode") );
		System.out.println("post getPhones.get('contrycode' : " + usuarioRequest.getPhones().get("contrycode")  );
		System.out.println("post usuarioRequest.getToken() : " + usuarioRequest.getToken());
		
		
		UsuarioResponseCrear usuarioResponse = new UsuarioResponseCrear();

		
		
		try {
				ValidarUsuario value_email = new ValidarUsuario();
				if (value_email.correoValidar(usuarioRequest.getEmail()) == false) {
					Object resp = "{'mensaje': 'email invalido'}";
					System.out.println("correo no es correcto  ");
					return 	new ResponseEntity<>( resp , HttpStatus.BAD_REQUEST);
					
				}else {
					 
					/* insert tabla tbl_usuarios */
					usuarioIn.setName(usuarioRequest.getName());
					usuarioIn.setEmail(usuarioRequest.getEmail());
					usuarioIn.setPassword(usuarioRequest.getPassword());
					usuarioIn.setToken(usuarioRequest.getToken());
					uResponse = usrRepository.save(usuarioIn);

					/* insert tabla tbl_phonos */
					teleInRequest.setNumber(usuarioRequest.getPhones().get("number") );
					teleInRequest.setCitycode(usuarioRequest.getPhones().get("citycode") );
					teleInRequest.setContrycode(usuarioRequest.getPhones().get("contrycode"));
					teleInRequest.setUsuario_id( String.valueOf(uResponse.getId()) );
					teleInResponse = teleRepository.save(teleInRequest);

					/* objeto respuesta OK  */
					
					usuarioResponse.setId(uResponse.getId());
					usuarioResponse.setName(uResponse.getName());
					usuarioResponse.setCreated(uResponse.getCreate());
					usuarioResponse.setModified(uResponse.getModified());
					usuarioResponse.setLast_login(uResponse.getLast_login());
					usuarioResponse.setIsactive(uResponse.getIsactive());
					usuarioResponse.setToken(usuarioIn.getToken());
					
					
					
					return  new ResponseEntity<>(usuarioResponse, HttpStatus.OK);
				}
		
		}catch (Exception e) {
			
			System.out.println("print error mensage : "  + e.getMessage());
			String resp1 = "{'mensaje' : '"  + e.getMessage() + "'}" ;
			
			return 	new ResponseEntity<>( resp1 , HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/usuarios/{id}")
	public ResponseEntity<Object> updateUsuario(@PathVariable(value = "id") Long usuariosId, 
			@Valid @RequestBody Usuario usuariosDetails) throws ResourceNotFoundException {
		
		String resp1 = "";
		try {
			Usuario usuarios = usrRepository.findById(usuariosId)
					.orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado para el id :: " + usuariosId));
	
			usuarios.setName(		usuariosDetails.getName());
			usuarios.setEmail(		usuariosDetails.getEmail());
			usuarios.setPassword(	usuariosDetails.getPassword());
			
			final Usuario updateUsuario = usrRepository.save(usuarios);
			
			return  new ResponseEntity<>(updateUsuario, HttpStatus.OK);
			
		}catch (Exception e) {
			System.out.println("print error mensage : "  + e.getMessage());
			 resp1 = "{'mensaje' : '"  + e.getMessage() + "'}" ;
		}
		return 	new ResponseEntity<>( resp1 , HttpStatus.BAD_REQUEST);
	}


	@DeleteMapping("/usuarios/{id}")
	public Map<String, String> deleteEmployee(@PathVariable(value = "id") Long usuariosId)
			throws ResourceNotFoundException {
		Usuario usuarios = usrRepository.findById(usuariosId)
				.orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado para el id :: " + usuariosId));

		usrRepository.delete(usuarios);
		Map<String, String> response = new HashMap<>();
		
		response.put("mensaje", "Usuario eliminado :: id " + usuariosId);
		return response;
	}
 
    
   

	

}