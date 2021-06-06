package com.mikelspring.crm.services;

import java.util.List;

import com.mikelspring.crm.model.Cliente;

public interface ClienteService {
	
	Cliente getById(Long id);
	
	List<Cliente> getAll();
	
	Cliente save(Cliente cliente);

}
