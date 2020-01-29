package com.maty.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maty.models.dao.IClienteDao;
import com.maty.models.entities.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {

		return (List<Cliente>) clienteDao.findAll();

	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long Id) {
		return clienteDao.findById(Id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long Id) {
		clienteDao.deleteById(Id);
	}

}
