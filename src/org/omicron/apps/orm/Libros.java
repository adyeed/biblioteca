package org.omicron.apps.orm;
// Generated 20/12/2015 11:39:27 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Libros generated by hbm2java
 */
public class Libros implements java.io.Serializable {

	private Integer codigo;
	private String nombre;
	private String editorial;
	private String autor;
	private String genero;
	private String paisAutor;
	private Integer paginas;
	private Date fechaEdicion;
	private Long precioLibro;
	private Set<Prestamos> prestamoses = new HashSet<Prestamos>(0);

	public Libros() {
	}

	public Libros(String nombre, String editorial, String autor, String genero, String paisAutor, Integer paginas,
		Date fechaEdicion, Long precioLibro, Set<Prestamos> prestamoses) {
		this.nombre = nombre;
		this.editorial = editorial;
		this.autor = autor;
		this.genero = genero;
		this.paisAutor = paisAutor;
		this.paginas = paginas;
		this.fechaEdicion = fechaEdicion;
		this.precioLibro = precioLibro;
		this.prestamoses = prestamoses;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPaisAutor() {
		return this.paisAutor;
	}

	public void setPaisAutor(String paisAutor) {
		this.paisAutor = paisAutor;
	}

	public Integer getPaginas() {
		return this.paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Date getFechaEdicion() {
		return this.fechaEdicion;
	}

	public void setFechaEdicion(Date fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public Long getPrecioLibro() {
		return this.precioLibro;
	}

	public void setPrecioLibro(Long precioLibro) {
		this.precioLibro = precioLibro;
	}

	public Set<Prestamos> getPrestamoses() {
		return this.prestamoses;
	}

	public void setPrestamoses(Set<Prestamos> prestamoses) {
		this.prestamoses = prestamoses;
	}

}