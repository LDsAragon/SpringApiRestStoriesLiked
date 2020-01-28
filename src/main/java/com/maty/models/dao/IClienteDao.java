package com.maty.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.maty.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
