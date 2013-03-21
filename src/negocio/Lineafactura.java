package negocio;
import java.util.HashSet;
import java.util.Set;

/**
 * Lineafactura generated by hbm2java
 */
public class Lineafactura implements java.io.Serializable {

	private Integer idLineafactura;
	private Factura factura;
	private Double importelinea;
	private String observacion;
	private Set conceptos = new HashSet(0);

	public Lineafactura() {
	}

	public Lineafactura(Factura factura) {
		this.factura = factura;
	}

	public Lineafactura(Factura factura, Double importelinea,
			String observacion, Set conceptos) {
		this.factura = factura;
		this.importelinea = importelinea;
		this.observacion = observacion;
		this.conceptos = conceptos;
	}

	public Integer getIdLineafactura() {
		return this.idLineafactura;
	}

	public void setIdLineafactura(Integer idLineafactura) {
		this.idLineafactura = idLineafactura;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Double getImportelinea() {
		return this.importelinea;
	}

	public void setImportelinea(Double importelinea) {
		this.importelinea = importelinea;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Set getConceptos() {
		return this.conceptos;
	}

	public void setConceptos(Set conceptos) {
		this.conceptos = conceptos;
	}

}
