package com.maty.models.entities.converters;

import com.maty.models.entities.Cliente;
import com.maty.models.entities.pojos.ClientePojo;

public class ClienteConverter {

	public Cliente pojoToEntity(ClientePojo pojo) {
		Cliente cliente = new Cliente(); 
		
		cliente.setNombre(pojo.getNombre());
		cliente.setApellido(pojo.getApellido());
		cliente.setEmail(pojo.getEmail());
		cliente.setInitialDate(pojo.getInitialDate());
		
		return cliente ;
	}
	
	
	public ClientePojo entityToPojo(Cliente cliente) {
		ClientePojo clientePojo = new ClientePojo() ;
		
		clientePojo.setNombre(cliente.getNombre());
		clientePojo.setApellido(cliente.getApellido());
		clientePojo.setEmail(cliente.getEmail());
		clientePojo.setInitialDate(cliente.getInitialDate());
		
		return clientePojo ;
	}
	
}
