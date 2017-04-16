package br.com.fabricadeprogramador.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fabricadeprogramador.model.Cliente;
import br.com.fabricadeprogramador.repository.ClienteRepository;

/**
 * Classe que contém minhas regras de negócio
 * @author Bruno Felix
 */
@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente){
		return clienteRepository.save(cliente);
	}
	
	public Cliente buscarPorId(Integer id){
		return clienteRepository.findOne(id);
	}
	
	public Collection<Cliente> buscarTodos(){
		return clienteRepository.findAll();
	}

	public void excluir(Cliente cliente){
		clienteRepository.delete(cliente);
	}
	
	public Cliente editar(Cliente cliente){
		return salvar(cliente);
	}
	
}
