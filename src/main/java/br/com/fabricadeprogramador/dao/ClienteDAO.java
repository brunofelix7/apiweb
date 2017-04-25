package br.com.fabricadeprogramador.dao;

import java.util.Collection;
import br.com.fabricadeprogramador.model.Cliente;

public interface ClienteDAO {

	Cliente salvar(Cliente cliente);
	
	Cliente buscarPorId(Integer id);
	
	Collection<Cliente> buscarTodos();
	
	void excluir(Cliente cliente);
	
	Cliente editar(Cliente cliente);
	
}
