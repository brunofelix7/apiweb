package br.com.fabricadeprogramador.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fabricadeprogramador.dao.LoginDAO;
import br.com.fabricadeprogramador.model.Login;
import br.com.fabricadeprogramador.repository.LoginRepository;

@Service
public class LoginService implements LoginDAO{
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public Login salvar(Login login){
		return loginRepository.save(login);
	}
	
	@Override
	public List<Login> buscarTodos(){
		return loginRepository.findAll();
	}

}
