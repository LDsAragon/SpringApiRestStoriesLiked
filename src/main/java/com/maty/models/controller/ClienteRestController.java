package com.maty.models.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.maty.models.entities.Cliente;
import com.maty.models.service.IClienteService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;

	private static final Logger logger = LogManager.getLogger(ClienteRestController.class);

	@GetMapping("/probarLogger")
	public void probarLogger() {
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		logger.fatal("Damn! Fatal error. Please fix me.");
	}

	@GetMapping("/clientes")
	public List<Cliente> findAll() {
		logger.info("Buscando todos los clientes");
		return clienteService.findAll();
	}

	@GetMapping("/clientes/{Id}")
	public Cliente show(@PathVariable Long Id) {
//		logger.info("Buscando el cliente con Id:" + Id);
		logger.info("Buscando el cliente con Id: {}", Id);
		return clienteService.findById(Id);
	}

	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
//		logger.info("Guardando el cliente con Id:" + cliente.getId());
		logger.info("Guardando el cliente con Id: {}", cliente.getId());
		return clienteService.save(cliente);
	}

	@PutMapping("/clientes/{Id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long Id) {
		Cliente clienteActual = clienteService.findById(Id);

//		logger.info("Actualizando el cliente con Id:" + clienteActual.getId());
		logger.info("Actualizando el cliente con Id: {}", clienteActual.getId());

		clienteActual.setNombre(cliente.getNombre());
		clienteActual.setApellido(cliente.getApellido());
		clienteActual.setEmail(cliente.getEmail());
		clienteActual.setInitialDate(cliente.getInitialDate());

		return clienteService.save(clienteActual);
	}

	@DeleteMapping("/clientes/{Id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long Id) {
//		logger.info("Eliminando el cliente con Id:" + Id);
		logger.info("Eliminando el cliente con Id: {}", Id);
		clienteService.deleteById(Id);
	}
}
