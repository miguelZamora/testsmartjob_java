package cl.cachoza.app001.controller;

 
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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


import cl.cachoza.app001.exception.ResourceNotFoundException;
import cl.cachoza.app001.model.Usuario;
import cl.cachoza.app001.repository.UsuarioRepository;
 

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")


public class UsuariosController {
	
	@Autowired
	private UsuarioRepository usrRepository;

	@GetMapping("/usuarios")
	public List<Usuario> getAllEmployees() {
		return usrRepository.findAll();
	}

	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable(value = "id") Long usuarioId)
			throws ResourceNotFoundException {
		Usuario usuarios = usrRepository.findById(usuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("usuario not found for this id :: " + usuarioId));
		return ResponseEntity.ok().body(usuarios);
	}

	@PostMapping("/usuarios")
	public Usuario createUsuario(@Valid @RequestBody Usuario usuarios) {
		return usrRepository.save(usuarios);
	}

	@PutMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> updateUsuario(@PathVariable(value = "id") Long usuariosId,
			@Valid @RequestBody Usuario usuariosDetails) throws ResourceNotFoundException {
		Usuario usuarios = usrRepository.findById(usuariosId)
				.orElseThrow(() -> new ResourceNotFoundException("Usuario not encontrado para el id :: " + usuariosId));

		usuarios.setName(		usuariosDetails.getName());
		usuarios.setEmail(		usuariosDetails.getEmail());
		usuarios.setPassword(	usuariosDetails.getPassword());
		
		final Usuario updateUsuario = usrRepository.save(usuarios);
		return ResponseEntity.ok(updateUsuario);
	}


	@DeleteMapping("/usuarios/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long usuariosId)
			throws ResourceNotFoundException {
		Usuario usuarios = usrRepository.findById(usuariosId)
				.orElseThrow(() -> new ResourceNotFoundException("Usuario not encontrado para el id :: " + usuariosId));

		usrRepository.delete(usuarios);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
 
    
   
    

}
