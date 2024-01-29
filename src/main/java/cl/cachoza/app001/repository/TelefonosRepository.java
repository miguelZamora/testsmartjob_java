package cl.cachoza.app001.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.cachoza.app001.model.Telefono;


@Repository
public interface TelefonosRepository extends  JpaRepository<Telefono, Long>{

}
