package br.com.fabricadeprogramador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fabricadeprogramador.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{

	//	CRUD
	
}
