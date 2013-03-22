package interfazGrafica;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import dao.InmuebleHome;

import negocio.Inmueble;

public class TablaInmueble extends DefaultTableModel {

	private ArrayList<Inmueble> inmuebles;
	private boolean inmVacio;
	private boolean modified = false;

	public TablaInmueble() {
		super(null,new String[]{"ID Inmueble",
				"Escalera", 
				"Piso", 
				"Puerta", 
				"Porcentaje", 
				"ID Comunidad"});
		
		this.inmuebles = new InmuebleHome().buscarInmuebles();
		for(Inmueble i : inmuebles) {
			addToTabla(i);
		}
		inmVacio = false;
	}
	
	public boolean isModified() {
		return modified;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}
	
	public boolean isInmVacio() {
		return inmVacio;
	}

	public void setInmVacio(boolean inmVacio) {
		this.inmVacio = inmVacio;
	}
	
	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private void addToTabla(Inmueble i){
		Vector v=new Vector();
		v.add(i.getIdInmueble());
		v.add(i.getEscalera());
		v.add(i.getPiso());
		v.add(i.getPuerta());
		v.add(i.getPorcentaje());
		v.add(i.getComunidad().getIdComunidad());
		this.addRow(v);
	}
	
	private void addInmueble(Inmueble i) {
		this.addToTabla(i);
	}
}
