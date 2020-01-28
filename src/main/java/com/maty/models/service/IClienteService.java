package com.maty.models.service;

import java.util.List;

import com.maty.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public Cliente findById(Long clienteId); 
	
	public void delete(Cliente cliente);
	
	

}
