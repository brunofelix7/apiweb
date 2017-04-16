package br.com.fabricadeprogramador.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.fabricadeprogramador.model.Cliente;
import br.com.fabricadeprogramador.model.ServerResponse;
import br.com.fabricadeprogramador.service.ClienteService;

/**
 * Classe que contém meus EndPoints
 * @author Bruno Felix
 */
@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	/**
	 * consumes - Permite que esse recurso aceite um JSON
	 * O consumo dessa requisição vai ser feito em JSON, ou seja, esse end point é capaz de ler uma menssagem que tenha um JSON no corpo da requisição
	 * ResponseEntity - Vai levar uma resposta para o browser
	 */
	@RequestMapping(value = "/novo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente){
		Cliente clientes = clienteService.cadastrar(cliente);	
		return new ResponseEntity<>(clientes, HttpStatus.OK); //	Retorna 200
	}
	
	/**
	 * produces - Me entrega JSON
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Cliente>> buscarTodos(){
		Collection<Cliente> clientes = clienteService.buscarTodos();
		return new ResponseEntity<>(clientes, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> excluir(@PathVariable Integer id){
		Cliente cliente = clienteService.buscarPorId(id);
		if(cliente == null){
			//	Mensagem
			return new ResponseEntity<>(new ServerResponse("Cliente não encontrado."), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		clienteService.excluir(cliente);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> editar(@PathVariable Integer id, @RequestBody Cliente cliente){
		Cliente getCliente = clienteService.buscarPorId(id);
		if(getCliente == null){
			//	Mensagem
			return new ResponseEntity<>(new ServerResponse("Cliente não encontrado."), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		cliente.setId(id);
		Cliente clienteAlterado = clienteService.editar(cliente);	
		return new ResponseEntity<>(clienteAlterado, HttpStatus.OK);
	}
		
}
