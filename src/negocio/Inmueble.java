package negocio;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Inmueble generated by hbm2java
 */
public class Inmueble implements java.io.Serializable {

	private int idInmueble;
	private Comunidad comunidad;
	private Propietario propietario;
	private Datosbancarios datosbancarios;
	private String escalera;
	private String piso;
	private String puerta;
	private Double porcentaje;
	private Set reciboinmuebles = new HashSet(0);

	public Inmueble() {
	}

	public Inmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}

	public Inmueble(int idInmueble, Comunidad comunidad,
			Propietario propietario, Datosbancarios datosbancarios,
			String escalera, String piso, String puerta, Double porcentaje,
			Set reciboinmuebles) {
		this.idInmueble = idInmueble;
		this.comunidad = comunidad;
		this.propietario = propietario;
		this.datosbancarios = datosbancarios;
		this.escalera = escalera;
		this.piso = piso;
		this.puerta = puerta;
		this.porcentaje = porcentaje;
		this.reciboinmuebles = reciboinmuebles;
	}

	public int getIdInmueble() {
		return this.idInmueble;
	}

	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}

	public Comunidad getComunidad() {
		return this.comunidad;
	}

	public void setComunidad(Comunidad comunidad) {
		this.comunidad = comunidad;
	}

	public Propietario getPropietario() {
		return this.propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Datosbancarios getDatosbancarios() {
		return this.datosbancarios;
	}

	public void setDatosbancarios(Datosbancarios datosbancarios) {
		this.datosbancarios = datosbancarios;
	}

	public String getEscalera() {
		return this.escalera;
	}

	public void setEscalera(String escalera) {
		this.escalera = escalera;
	}

	public String getPiso() {
		return this.piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getPuerta() {
		return this.puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

	public Double getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Set getReciboinmuebles() {
		return this.reciboinmuebles;
	}

	public void setReciboinmuebles(Set reciboinmuebles) {
		this.reciboinmuebles = reciboinmuebles;
	}

}
