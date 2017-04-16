package br.com.fabricadeprogramador.repository;

import br.com.fabricadeprogramador.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	//	CRUD
	
}
