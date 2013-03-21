package negocio;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Datosbancarios generated by hbm2java
 */
public class Datosbancarios implements java.io.Serializable {

	private int idDatosbancarios;
	private String entidad;
	private String numerocuenta;
	private Set inmuebles = new HashSet(0);

	public Datosbancarios() {
	}

	public Datosbancarios(int idDatosbancarios) {
		this.idDatosbancarios = idDatosbancarios;
	}

	public Datosbancarios(int idDatosbancarios, String entidad,
			String numerocuenta, Set inmuebles) {
		this.idDatosbancarios = idDatosbancarios;
		this.entidad = entidad;
		this.numerocuenta = numerocuenta;
		this.inmuebles = inmuebles;
	}

	public int getIdDatosbancarios() {
		return this.idDatosbancarios;
	}

	public void setIdDatosbancarios(int idDatosbancarios) {
		this.idDatosbancarios = idDatosbancarios;
	}

	public String getEntidad() {
		return this.entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getNumerocuenta() {
		return this.numerocuenta;
	}

	public void setNumerocuenta(String numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public Set getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(Set inmuebles) {
		this.inmuebles = inmuebles;
	}

}
