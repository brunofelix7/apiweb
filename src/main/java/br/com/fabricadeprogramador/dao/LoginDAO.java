package br.com.fabricadeprogramador.dao;

import java.util.List;
import br.com.fabricadeprogramador.model.Login;

public interface LoginDAO {
	
	Login salvar(Login login);
	
	List<Login> buscarTodos();

}
