package br.com.fabricadeprogramador.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fabricadeprogramador.model.Login;
import br.com.fabricadeprogramador.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public Login salvar(Login login){
		return loginRepository.save(login);
	}
	
	public List<Login> buscarTodos(){
		return loginRepository.findAll();
	}

}
