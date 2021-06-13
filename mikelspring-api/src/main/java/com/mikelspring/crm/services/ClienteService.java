package com.mikelspring.crm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mikelspring.crm.model.Cliente;

@Service
public interface ClienteService {
	
	Cliente findById(Long id);
	
	List<Cliente> getAll();
	
	Cliente save(Cliente cliente);

	void deleteById(Long id);

}
