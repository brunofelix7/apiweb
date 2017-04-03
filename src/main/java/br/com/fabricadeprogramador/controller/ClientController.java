package br.com.fabricadeprogramador.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public void buscar(){
		
	}
	
}
