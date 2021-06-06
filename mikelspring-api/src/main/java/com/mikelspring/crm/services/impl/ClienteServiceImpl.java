package com.mikelspring.crm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mikelspring.crm.model.Cliente;
import com.mikelspring.crm.repository.ClienteRepository;
import com.mikelspring.crm.services.ClienteService;

public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	@Override
	public Cliente getById(Long id) {
		return clienteRepository.getById(id);
	}
	@Override
	public List<Cliente> getAll() {
		return clienteRepository.findAll();
	}
	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	
	
}
