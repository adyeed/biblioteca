package org.omicron.apps.orm;
// Generated 20/12/2015 11:39:27 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Prestamos generated by hbm2java
 */
public class Prestamos implements java.io.Serializable {

	private PrestamosId id;
	private Libros libros;
	private Usuarios usuarios;
	private Date fechaSalida;
	private Date fechaProxima;
	private Date fechaDevolucion;

	public Prestamos() {
	}

	public Prestamos(PrestamosId id, Libros libros, Usuarios usuarios, Date fechaSalida, Date fechaProxima,
		Date fechaDevolucion) {
		this.id = id;
		this.libros = libros;
		this.usuarios = usuarios;
		this.fechaSalida = fechaSalida;
		this.fechaProxima = fechaProxima;
		this.fechaDevolucion = fechaDevolucion;
	}

	public PrestamosId getId() {
		return this.id;
	}

	public void setId(PrestamosId id) {
		this.id = id;
	}

	public Libros getLibros() {
		return this.libros;
	}

	public void setLibros(Libros libros) {
		this.libros = libros;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Date getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaProxima() {
		return this.fechaProxima;
	}

	public void setFechaProxima(Date fechaProxima) {
		this.fechaProxima = fechaProxima;
	}

	public Date getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}