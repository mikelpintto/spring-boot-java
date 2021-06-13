package com.mikelspring.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mikelspring.crm.model.Cliente;
import com.mikelspring.crm.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<Cliente> listar(){
		return clienteService.getAll();
		
	}
	
	@GetMapping(path = "/{id}")
	public Cliente getById(@PathVariable("id") Long id){
		return clienteService.findById(id);
				
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteCliente(@PathVariable("id") Long id){
		 clienteService.deleteById(id);
				
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	
}
