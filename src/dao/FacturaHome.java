package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

import negocio.Comunidad;
import negocio.Factura;
import negocio.Notainformativa;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Home object for domain model class Factura.
 * @see negocio.Factura
 * @author Hibernate Tools
 */
public class FacturaHome {
	
	private Session sesion = null;
	private Transaction tx = null;
	

	public Factura buscarFacturaPorID(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Factura f = (Factura) sesion.get(Factura.class, new Integer(id));
		tx.commit();
		sesion.close();
		return f;
	}
	

	public void anyadirFactura(Factura f) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(f);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Factura> buscarFacturas() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Factura> listaFacturaes = (ArrayList<Factura>) sesion.createQuery("from Factura").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaFacturaes;
	}
	

	public void borrarFactura(int num) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Factura f = (Factura) sesion.get(Factura.class, new Integer(num));
		sesion.delete(f);
		tx.commit();
		sesion.close();
	}
	
	
	public void updateFactura(int num, String fecha, Comunidad c, Notainformativa ni) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Factura f = (Factura) sesion.get(Factura.class, new Integer(num));
		sesion.update(f);
		f.setFechafactura(fecha);
		f.setComunidad(c);
		f.setNotainformativa(ni);
		tx.commit();
		sesion.close();
	}

}
