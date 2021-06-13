package com.mikelspring.crm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikelspring.crm.model.Cliente;
import com.mikelspring.crm.repository.ClienteRepository;
import com.mikelspring.crm.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	@Override
	public Cliente findById(Long id) {
		return clienteRepository.findById(id).get();
	}
	@Override
	public List<Cliente> getAll() {
		return clienteRepository.findAll();
	}
	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	@Override
	public void deleteById(Long id) {
		 clienteRepository.deleteById(id);
	}	
	
}
