package br.com.fabricadeprogramador.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import br.com.fabricadeprogramador.model.Cliente;

/**
 * Classe que contém minhas regras de negócio
 * @author Bruno Felix
 */
@Service
public class ClienteService {
	
	//	Banco de dados (DAO)
	private Map<Integer, Cliente> clientes = new HashMap<>();;
	private Integer nextId = 1;
	
	public Cliente cadastrar(Cliente cliente){
		cliente.setId(nextId);
		nextId++;
		clientes.put(cliente.getId(), cliente);
		return cliente;
	}
	
	public Cliente buscarPorId(Integer id){
		return clientes.get(id);
	}
	
	public Collection<Cliente> buscarTodos(){
		return clientes.values();
	}

	public void excluir(Cliente cliente){
		clientes.remove(cliente.getId());
	}
	
	public Cliente editar(Cliente cliente){
		clientes.put(cliente.getId(), cliente);
		return cliente;
	}
	
}
