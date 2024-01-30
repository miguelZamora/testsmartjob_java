package cl.cachoza.app001.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import cl.cachoza.app001.model.Usuario;



@Repository
	public interface UsuarioRepository extends JpaRepository<Usuario,Long>, JpaSpecificationExecutor<Usuario> {
} 