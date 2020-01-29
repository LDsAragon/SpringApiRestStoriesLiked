package com.maty.models.entities.pojos;

import java.util.Date;

import com.maty.models.entities.Cliente;

public class ClientePojo {

	private Long id;

	private String nombre;

	private String apellido;

	private String email;

	private Date initialDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	
//	public ClientePojo() {
//	}
//
//	public ClientePojo( String nombre, String apellido, String email) {
//		super();
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.email = email;
//		this.initialDate = new Date() ;
//	}
//	
//	public ClientePojo(Cliente cliente) {
//		super();
//		this.nombre = cliente.getNombre();
//		this.apellido = cliente.getApellido();
//		this.email = cliente.getEmail();
//		this.initialDate = new Date() ;
//	}
	
	
	
	
	
}
