package com.maty.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ds_cliente")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 3085148720779241283L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;

	@Column(name="NOMBRE")
	private String nombre ;
	
	@Column(name="APELLIDO")
	private String apellido ;
	
	@Column(name="EMAIL")
	private String email ;
	
	@Column(name="INITIALDATE")
	@Temporal(TemporalType.DATE)
	private Date initialDate ;
	
	
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
}
