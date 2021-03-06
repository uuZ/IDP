package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;

import negocio.Carta;
import negocio.Comunidad;
import negocio.Concepto;
import negocio.Datosbancarios;
import negocio.Factura;
import negocio.Inmueble;
import negocio.Lineafactura;
import negocio.Notainformativa;
import negocio.Propietario;
import negocio.Reciboinmueble;
import dao.CartaHome;
import dao.ComunidadHome;
import dao.ConceptoHome;
import dao.DatosbancariosHome;
import dao.FacturaHome;
import dao.InmuebleHome;
import dao.LineafacturaHome;
import dao.NotainformativaHome;
import dao.PropietarioHome;
import dao.ReciboinmuebleHome;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class mainGUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			//e.printStackTrace();
		}
	}


	private JMenuItem helpMenuItem;
	private JMenu jMenu5;
	private JButton jBAltaComunidad;
	private JButton jBModificarPropietario;
	private JButton jBBajaPropietario;
	private JInternalFrame jF_Inmuebles;
	private JInternalFrame jF_Comunidades;
	private JButton jBAltaPropietario;
	private JInternalFrame jF_Propietarios;
	private JTabbedPane jTabbedPane1;
	private JMenuItem deleteMenuItem;
	private JSeparator jSeparator1;
	private JMenuItem pasteMenuItem;
	private JMenuItem copyMenuItem;
	private JMenuItem cutMenuItem;
	private JMenu jMenu4;
	private JMenuItem exitMenuItem;
	private JSeparator jSeparator2;
	private JMenuItem closeFileMenuItem;
	private JMenuItem saveAsMenuItem;
	private JMenuItem saveMenuItem;
	private JInternalFrame jF_Facturas;
	private JTable jT_Conceptos;
	private JButton jBAltaConcepto;
	private JButton jBBajaConcepto;
	private JButton jBModificarConcepto;
	private JInternalFrame jF_Conceptos;
	private JTable jT_Comunidades;
	private JTable jT_Inmuebles;
	private JTable jT_Propietarios;
	private JButton jBAltaInmueble;
	private JButton jBBajaInmueble;
	private JButton jBModificarInmueble;
	private JButton jBModificarComunidad;
	private JButton jBBajaComunidad;
	private JMenuItem openFileMenuItem;
	private JMenuItem newFileMenuItem;
	private JTable jT_RecibosPropietario;
	private JTable jT_InmueblesPropietario;
	private JButton jB_ListarInmueblesYRecibos;
	private JButton jB_InformeNota;
	private JTable jT_Cartas;
	private JButton jB_AltaCarta;
	private JButton jB_BajaCarta;
	private JButton jB_ModificarCarta;
	private JInternalFrame jF_Carta;
	private JTable jT_LineaFactura;
	private JButton jB_ModificarLinea;
	private JButton jB_BajaLinea;
	private JButton jB_AltaLinea;
	private JInternalFrame jF_LineaFacturas;
	private JTable jT_Recibos;
	private JButton jB_AltaRecibo;
	private JButton jB_BajaRecibo;
	private JButton jB_ModificarRecibo;
	private JInternalFrame jF_Recibos;
	private JTable jT_NotasInformativas;
	private JButton jB_AltaNota;
	private JButton jB_BajaNota;
	private JButton jB_ModificarNota;
	private JInternalFrame jF_NotasInformativas;
	private JTable jT_Facturas;
	private JButton jB_AltaFactura;
	private JButton jB_BajaFactura;
	private JButton jB_ModificarFactura;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;
	private JLabel jLabel3;
	private JTextField jTF_PagarPropietario;
	private JButton jB_PagarPropietario;
	private JLabel jL_Pagar;
	private JTextField jTF_Pagar;
	private JButton jB_PagarRecibos;
	private JButton jB_Filtrar;
	private JLabel jLabel2;
	private JLabel jLabel1;
	
	TablaInmueble TInmuebles = new TablaInmueble();
	TablaComunidad TComunidades = new TablaComunidad();
	TablaPropietario TPropietarios = new TablaPropietario();
	TablaConcepto TConceptos = new TablaConcepto();
	TablaLineaFactura TLinea = new TablaLineaFactura();
	TablaCarta TCarta = new TablaCarta();
	TablaFactura TFactura = new TablaFactura();
	TablaRecibo TRecibo = new TablaRecibo();
	TablaNotaInformativa TNota = new TablaNotaInformativa();
	
	TablaRecibosPropietario TRPropietario = new TablaRecibosPropietario();
	TablaInmueblesPropietario TIPropietario = new TablaInmueblesPropietario();

 	GestionPropietariosGUI     gp = new GestionPropietariosGUI(TPropietarios);
	GestionInmueblesGUI        gi = new GestionInmueblesGUI(TInmuebles);
	GestionComunidadesGUI      gc = new GestionComunidadesGUI(TComunidades);
	private JButton jButton1;
	private JButton jB_GenerarRecibo;
	private JLabel jL_total;
	private JLabel jL_numero;
	private JLabel jLabel5;
	private JLabel jLabel4;
	private JButton jB_ActualizarInmuebles;
	private JButton jB_ActualizarComunidad;
	private JButton jB_ActualizarRecibo;

	GestionConceptoGUI       gcon = new GestionConceptoGUI(TConceptos);
	GestionCartasGUI	     gcar = new GestionCartasGUI(TCarta);
	GestionFacturasGUI	       gf = new GestionFacturasGUI(TFactura);
	GestionLineaFacturaGUI    glf = new GestionLineaFacturaGUI(TLinea);
	GestionNotaInformativaGUI gni = new GestionNotaInformativaGUI(TNota);
	GestionRecibosGUI		   gr = new GestionRecibosGUI(TRecibo);
	
	
	Set<Carta> cartas = new HashSet<Carta>();
	Set<Propietario> propietarios = new HashSet<Propietario>();
	Set<Comunidad> comunidades = new HashSet<Comunidad>();
	Set<Inmueble> inmuebles = new HashSet<Inmueble>();
	Set<Concepto> conceptos = new HashSet<Concepto>();
	Set<Factura> facturas = new HashSet<Factura>();
	Set<Lineafactura> lineas = new HashSet<Lineafactura>();
	Set<Notainformativa> notas = new HashSet<Notainformativa>();
	Set<Reciboinmueble> recibos = new HashSet<Reciboinmueble>();

	
	

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				mainGUI inst = new mainGUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
		
	
	void actualizarComunidad() {
		while (TComunidades.getRowCount() > 0)
			TComunidades.removeRow(0);
		
		for(Comunidad c : new ComunidadHome().buscarComunidades()) {
			c.cuadrarComunidad();
			TComunidades.addToTabla(c);
		}
	}
	
	
	
	void actualizarRecibos() {
		while (TRecibo.getRowCount() > 0)
			TRecibo.removeRow(0);
		
		for(Reciboinmueble r : new ReciboinmuebleHome().buscarReciboinmuebles()) {
			if(r.getFechapago().isEmpty())
				r.setPagado("Pendiente");
			else 
				r.setPagado("Pagado");
			
			TRecibo.addToTabla(r);
		}
	}
	
	
	void actualizarInmuebles() {
		while (TInmuebles.getRowCount() > 0)
			TInmuebles.removeRow(0);
		
		for(Inmueble i : new InmuebleHome().buscarInmuebles()) {
			TInmuebles.addToTabla(i);
		}
	}
	
	
	void actualizarFacturas() {
		while (TFactura.getRowCount() > 0)
			TFactura.removeRow(0);
		
		for(Factura f : new FacturaHome().buscarFacturas()) {
			TFactura.addToTabla(f);
		}
	}
	
	
	public mainGUI() {
		super();
		initGUI();
		
		
		//	Rellenamos las tablas	//
		for(Propietario p : new PropietarioHome().buscarPropietarios()) {
			TPropietarios.addToTabla(p);
		}
		
		actualizarComunidad();
		actualizarRecibos();
		actualizarInmuebles();
		actualizarFacturas();
		
		for(Lineafactura lf : new LineafacturaHome().buscarLineafacturas()) {
			TLinea.addToTabla(lf);
		}
		
		
		
		for(Notainformativa n : new NotainformativaHome().buscarNotainformativas()) {
			TNota.addToTabla(n);
		}
		
		
		
		for(Concepto c : new ConceptoHome().buscarConceptos()) {
			TConceptos.addToTabla(c);
		}
		
		for(Carta c : new CartaHome().buscarCartas()) {
			TCarta.addToTabla(c);
		}
		
		
		
		
		
		
		//	/////////////////////	//
		
	}
	
	private void initGUI() {
		try {
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			this.setTitle("Gestión");
			{
				jTabbedPane1 = new JTabbedPane();
				getContentPane().add(jTabbedPane1, BorderLayout.CENTER);
				{
					jF_Comunidades = new JInternalFrame();
					jTabbedPane1.addTab("Comunidades", null, jF_Comunidades, null);
					GroupLayout jF_ComunidadesLayout = new GroupLayout((JComponent)jF_Comunidades.getContentPane());
					jF_Comunidades.getContentPane().setLayout(jF_ComunidadesLayout);
					jF_Comunidades.setVisible(true);
					{
						jBAltaComunidad = new JButton();
						jBAltaComunidad.setText("Dar de Alta");
						jBAltaComunidad.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBAltaComunidadActionPerformed(evt);
							}
						});
					}
					{
						TableModel jT_ComunidadesModel = TComunidades;
						jT_Comunidades = new JTable();
						jT_Comunidades.setModel(jT_ComunidadesModel);
					}
					{
						jB_GenerarRecibo = new JButton();
						jB_GenerarRecibo.setText("Generar Recibo");
						jB_GenerarRecibo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_GenerarReciboActionPerformed(evt);
							}
						});
					}
					{
						jB_ActualizarComunidad = new JButton();
						jB_ActualizarComunidad.setText("Actualizar");
						jB_ActualizarComunidad.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ActualizarComunidadActionPerformed(evt);
							}
						});
					}
					{
						jBBajaComunidad = new JButton();
						jBBajaComunidad.setText("Dar de Baja");
						jBBajaComunidad.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBBajaComunidadActionPerformed(evt);
							}
						});
					}
					{
						jBModificarComunidad = new JButton();
						jBModificarComunidad.setText("Modificar");
						jBModificarComunidad.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBModificarComunidadActionPerformed(evt);
							}
						});
					}
					jF_ComunidadesLayout.setHorizontalGroup(jF_ComunidadesLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.LEADING, jF_ComunidadesLayout.createSequentialGroup()
						    .addComponent(jT_Comunidades, 0, 643, Short.MAX_VALUE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addGroup(jF_ComunidadesLayout.createParallelGroup()
						        .addComponent(jBAltaComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						        .addComponent(jBBajaComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						        .addComponent(jBModificarComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						    .addContainerGap())
						.addGroup(GroupLayout.Alignment.LEADING, jF_ComunidadesLayout.createSequentialGroup()
						    .addGap(58)
						    .addComponent(jB_GenerarRecibo, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
						    .addGap(0, 329, Short.MAX_VALUE)
						    .addComponent(jB_ActualizarComunidad, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						    .addContainerGap()));
					jF_ComunidadesLayout.setVerticalGroup(jF_ComunidadesLayout.createSequentialGroup()
						.addGroup(jF_ComunidadesLayout.createParallelGroup()
						    .addComponent(jT_Comunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addGroup(GroupLayout.Alignment.LEADING, jF_ComunidadesLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jBAltaComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jBBajaComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jBModificarComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jF_ComunidadesLayout.createParallelGroup()
						    .addGroup(jF_ComunidadesLayout.createSequentialGroup()
						        .addComponent(jB_ActualizarComunidad, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						        .addGap(0, 0, Short.MAX_VALUE))
						    .addGroup(GroupLayout.Alignment.LEADING, jF_ComunidadesLayout.createSequentialGroup()
						        .addGap(8)
						        .addComponent(jB_GenerarRecibo, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						        .addGap(0, 34, Short.MAX_VALUE)))
						.addContainerGap(223, 223));
				}
				{
					jF_Propietarios = new JInternalFrame();
					jTabbedPane1.addTab("Propietarios", null, jF_Propietarios, null);
					GroupLayout jF_PropietariosLayout = new GroupLayout((JComponent)jF_Propietarios.getContentPane());
					jF_Propietarios.getContentPane().setLayout(jF_PropietariosLayout);
					{
						jBAltaPropietario = new JButton();
						jBAltaPropietario.setText("Dar de Alta");
						jBAltaPropietario.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBAltaPropietarioActionPerformed(evt);
							}
						});
					}
					{
						jBBajaPropietario = new JButton();
						jBBajaPropietario.setText("Dar de Baja");
						jBBajaPropietario.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBBajaPropietarioActionPerformed(evt);
							}
						});
					}
					{
						jBModificarPropietario = new JButton();
						jBModificarPropietario.setText("Modificar");
						jBModificarPropietario.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBModificarPropietarioActionPerformed(evt);
							}
						});
					}
					{
						TableModel jT_PropietariosModel = TPropietarios;
						//						TableModel jT_PropietariosModel = 
								//								new DefaultTableModel(
										//										new String[][] { { "One", "Two" }, { "Three", "Four" } },
										//										new String[] { "Column 1", "Column 2" });
						jT_Propietarios = new JTable();
						jT_Propietarios.setModel(jT_PropietariosModel);
					}
					{
						jLabel4 = new JLabel();
						jLabel4.setText("Número de recibos pendientes");
					}
					{
						jLabel5 = new JLabel();
						jLabel5.setText("Importe total");
					}
					{
						jL_numero = new JLabel();
					}
					{
						jL_total = new JLabel();
					}
					{
						jB_PagarPropietario = new JButton();
						jB_PagarPropietario.setText("Pagar");
						jB_PagarPropietario.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_PagarPropietarioActionPerformed(evt);
							}
						});
					}
					{
						jTF_PagarPropietario = new JTextField();
					}
					{
						jLabel3 = new JLabel();
						jLabel3.setText("Inserta fecha de pago");
					}
					{
						jB_Filtrar = new JButton();
						jB_Filtrar.setText("Filtrar");
						jB_Filtrar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_FiltrarActionPerformed(evt);
							}
						});
					}
					{
						jLabel1 = new JLabel();
						jLabel1.setText("Inmuebles");
					}
					{
						jLabel2 = new JLabel();
						jLabel2.setText("Recibos");
					}
					{
						TableModel jTable1Model = TIPropietario;
						jT_InmueblesPropietario = new JTable();
						jT_InmueblesPropietario.setModel(jTable1Model);
					}
					{
						TableModel jTable2Model = TRPropietario;
						jT_RecibosPropietario = new JTable();
						jT_RecibosPropietario.setModel(jTable2Model);
					}
					{
						jB_ListarInmueblesYRecibos = new JButton();
						jB_ListarInmueblesYRecibos.setText("Listar Inmuebles y Recibos");
						jB_ListarInmueblesYRecibos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ListarInmueblesYRecibosActionPerformed(evt);
							}
						});
					}
					jF_PropietariosLayout.setHorizontalGroup(jF_PropietariosLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						    .addComponent(jT_Propietarios, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addGroup(jF_PropietariosLayout.createParallelGroup()
						        .addGroup(jF_PropietariosLayout.createSequentialGroup()
						            .addComponent(jBModificarPropietario, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						            .addGap(0, 0, Short.MAX_VALUE))
						        .addGroup(jF_PropietariosLayout.createSequentialGroup()
						            .addComponent(jBBajaPropietario, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						            .addGap(0, 0, Short.MAX_VALUE))
						        .addGroup(jF_PropietariosLayout.createSequentialGroup()
						            .addComponent(jBAltaPropietario, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						            .addGap(0, 0, Short.MAX_VALUE))
						        .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						            .addPreferredGap(jBModificarPropietario, jL_numero, LayoutStyle.ComponentPlacement.INDENT)
						            .addComponent(jL_numero, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						            .addGap(0, 35, Short.MAX_VALUE)))
						    .addContainerGap())
						.addGroup(jF_PropietariosLayout.createSequentialGroup()
						    .addGap(25)
						    .addGroup(jF_PropietariosLayout.createParallelGroup()
						        .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						            .addComponent(jT_InmueblesPropietario, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
						            .addGap(17)
						            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						            .addGroup(jF_PropietariosLayout.createParallelGroup()
						                .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						                    .addComponent(jTF_PagarPropietario, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						                    .addGap(0, 104, Short.MAX_VALUE))
						                .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						                    .addGap(18)
						                    .addComponent(jLabel2, 0, 182, Short.MAX_VALUE)))
						            .addGap(25))
						        .addGroup(jF_PropietariosLayout.createSequentialGroup()
						            .addGap(105)
						            .addGroup(jF_PropietariosLayout.createParallelGroup()
						                .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						                    .addGap(133)
						                    .addGroup(jF_PropietariosLayout.createParallelGroup()
						                        .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						                            .addComponent(jT_RecibosPropietario, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
						                            .addGap(0, 15, Short.MAX_VALUE))
						                        .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						                            .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
						                            .addComponent(jB_PagarPropietario, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						                            .addGap(0, 0, Short.MAX_VALUE))
						                        .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
						                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						                            .addComponent(jL_total, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						                            .addGap(0, 58, Short.MAX_VALUE))))
						                .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						                    .addPreferredGap(jLabel1, jB_Filtrar, LayoutStyle.ComponentPlacement.INDENT)
						                    .addComponent(jB_Filtrar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						                    .addGap(10)
						                    .addComponent(jB_ListarInmueblesYRecibos, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
						                    .addGap(0, 237, Short.MAX_VALUE)))))
						    .addContainerGap(48, 48)));
					jF_PropietariosLayout.setVerticalGroup(jF_PropietariosLayout.createSequentialGroup()
						.addGroup(jF_PropietariosLayout.createParallelGroup()
						    .addComponent(jT_Propietarios, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jBAltaPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jBBajaPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jBModificarPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jB_ListarInmueblesYRecibos, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(jF_PropietariosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jF_PropietariosLayout.createParallelGroup()
						    .addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						        .addComponent(jT_RecibosPropietario, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						        .addGroup(jF_PropietariosLayout.createParallelGroup()
						            .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						            .addComponent(jL_numero, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						        .addGroup(jF_PropietariosLayout.createParallelGroup()
						            .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						            .addComponent(jL_total, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
						        .addGap(14))
						    .addComponent(jT_InmueblesPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
						.addGroup(jF_PropietariosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(jB_PagarPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jB_Filtrar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jTF_PagarPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(20, 20));
				}
				{
					jF_Inmuebles = new JInternalFrame();
					jTabbedPane1.addTab("Inmuebles", null, jF_Inmuebles, null);
					GroupLayout jF_InmueblesLayout = new GroupLayout((JComponent)jF_Inmuebles.getContentPane());
					jF_Inmuebles.getContentPane().setLayout(jF_InmueblesLayout);
					jF_Inmuebles.setVisible(true);
					{
						jBModificarInmueble = new JButton();
						jBModificarInmueble.setText("Modificar");
						jBModificarInmueble.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBModificarInmuebleActionPerformed(evt);
							}
						});
					}
					{
						TableModel jT_InmueblesModel = TInmuebles;
						jT_Inmuebles = new JTable();
						jT_Inmuebles.setModel(jT_InmueblesModel);
					}
					{
						jB_ActualizarInmuebles = new JButton();
						jB_ActualizarInmuebles.setText("Actualizar");
						jB_ActualizarInmuebles.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ActualizarInmueblesActionPerformed(evt);
							}
						});
					}
					{
						jBBajaInmueble = new JButton();
						jBBajaInmueble.setText("Dar de Baja");
						jBBajaInmueble.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBBajaInmuebleActionPerformed(evt);
							}
						});
					}
					{
						jBAltaInmueble = new JButton();
						jBAltaInmueble.setText("Dar de Alta");
						jBAltaInmueble.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBAltaInmuebleActionPerformed(evt);
							}
						});
					}
					jF_InmueblesLayout.setHorizontalGroup(jF_InmueblesLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.LEADING, jF_InmueblesLayout.createSequentialGroup()
						    .addComponent(jT_Inmuebles, 0, 643, Short.MAX_VALUE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addGroup(jF_InmueblesLayout.createParallelGroup()
						        .addComponent(jBBajaInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						        .addComponent(jBAltaInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						        .addComponent(jBModificarInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						    .addContainerGap())
						.addGroup(GroupLayout.Alignment.LEADING, jF_InmueblesLayout.createSequentialGroup()
						    .addGap(0, 0, Short.MAX_VALUE)
						    .addComponent(jB_ActualizarInmuebles, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						    .addContainerGap()));
					jF_InmueblesLayout.setVerticalGroup(jF_InmueblesLayout.createSequentialGroup()
						.addGroup(jF_InmueblesLayout.createParallelGroup()
						    .addComponent(jT_Inmuebles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addGroup(GroupLayout.Alignment.LEADING, jF_InmueblesLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jBAltaInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jBBajaInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jBModificarInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addGap(19)
						.addComponent(jB_ActualizarInmuebles, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(216, Short.MAX_VALUE));
				}
				{
					jF_Conceptos = new JInternalFrame();
					jTabbedPane1.addTab("Conceptos", null, jF_Conceptos, null);
					GroupLayout jF_ConceptosLayout = new GroupLayout((JComponent)jF_Conceptos.getContentPane());
					jF_Conceptos.getContentPane().setLayout(jF_ConceptosLayout);
					jF_Conceptos.setVisible(true);
					{
						jBModificarConcepto = new JButton();
						jBModificarConcepto.setText("Modificar");
						jBModificarConcepto.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBModificarConceptoActionPerformed(evt);
							}
						});
					}
					{
						jBBajaConcepto = new JButton();
						jBBajaConcepto.setText("Dar de Baja");
						jBBajaConcepto.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBBajaConceptoActionPerformed(evt);
							}
						});
					}
					{
						jBAltaConcepto = new JButton();
						jBAltaConcepto.setText("Dar de Alta");
						jBAltaConcepto.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBAltaConceptoActionPerformed(evt);
							}
						});
					}
					{
						TableModel jTable1Model = TConceptos;
						jT_Conceptos = new JTable();
						jT_Conceptos.setModel(jTable1Model);
					}
					jF_ConceptosLayout.setHorizontalGroup(jF_ConceptosLayout.createSequentialGroup()
						.addComponent(jT_Conceptos, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jF_ConceptosLayout.createParallelGroup()
						    .addGroup(jF_ConceptosLayout.createSequentialGroup()
						        .addComponent(jBModificarConcepto, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						        .addGap(0, 0, Short.MAX_VALUE))
						    .addGroup(jF_ConceptosLayout.createSequentialGroup()
						        .addComponent(jBBajaConcepto, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						        .addGap(0, 0, Short.MAX_VALUE))
						    .addGroup(GroupLayout.Alignment.LEADING, jF_ConceptosLayout.createSequentialGroup()
						        .addGap(0, 0, Short.MAX_VALUE)
						        .addComponent(jBAltaConcepto, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap());
					jF_ConceptosLayout.setVerticalGroup(jF_ConceptosLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.LEADING, jF_ConceptosLayout.createSequentialGroup()
						    .addComponent(jT_Conceptos, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addContainerGap(310, Short.MAX_VALUE))
						.addGroup(GroupLayout.Alignment.LEADING, jF_ConceptosLayout.createSequentialGroup()
						    .addGap(12)
						    .addComponent(jBAltaConcepto, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addComponent(jBBajaConcepto, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addComponent(jBModificarConcepto, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addContainerGap(310, Short.MAX_VALUE)));
				}
				{
					jF_Facturas = new JInternalFrame();
					jTabbedPane1.addTab("Facturas", null, jF_Facturas, null);
					GroupLayout jF_FacturasLayout = new GroupLayout((JComponent)jF_Facturas.getContentPane());
					jF_Facturas.setLayout(jF_FacturasLayout);
					jF_Facturas.setVisible(true);
					{
						jB_ModificarFactura = new JButton();
						jB_ModificarFactura.setText("Modificar");
						jB_ModificarFactura.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ModificarFacturaActionPerformed(evt);
							}
						});
					}
					{
						jB_BajaFactura = new JButton();
						jB_BajaFactura.setText("Dar de Baja");
						jB_BajaFactura.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_BajaFacturaActionPerformed(evt);
							}
						});
					}
					{
						jB_AltaFactura = new JButton();
						jB_AltaFactura.setText("Dar de Alta");
						jB_AltaFactura.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_AltaFacturaActionPerformed(evt);
							}
						});
					}
					{
						TableModel jTable1Model = TFactura;
						jT_Facturas = new JTable();
						jT_Facturas.setModel(jTable1Model);
					}
					{
						jButton1 = new JButton();
						jButton1.setText("Actualizar");
						jButton1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jButton1ActionPerformed(evt);
							}
						});
					}
						jF_FacturasLayout.setHorizontalGroup(jF_FacturasLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.LEADING, jF_FacturasLayout.createSequentialGroup()
						    .addComponent(jT_Facturas, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addGroup(jF_FacturasLayout.createParallelGroup()
						        .addGroup(jF_FacturasLayout.createSequentialGroup()
						            .addComponent(jB_ModificarFactura, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						        .addGroup(jF_FacturasLayout.createSequentialGroup()
						            .addComponent(jB_BajaFactura, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						        .addGroup(jF_FacturasLayout.createSequentialGroup()
						            .addComponent(jB_AltaFactura, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
						    .addContainerGap(11, Short.MAX_VALUE))
						.addGroup(GroupLayout.Alignment.LEADING, jF_FacturasLayout.createSequentialGroup()
						    .addGap(616)
						    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						    .addContainerGap(27, Short.MAX_VALUE)));
						jF_FacturasLayout.setVerticalGroup(jF_FacturasLayout.createSequentialGroup()
						.addGroup(jF_FacturasLayout.createParallelGroup()
						    .addComponent(jT_Facturas, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addGroup(GroupLayout.Alignment.LEADING, jF_FacturasLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jB_AltaFactura, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jB_BajaFactura, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jB_ModificarFactura, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addGap(21)
						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(214, Short.MAX_VALUE));
				}
				{
					jF_NotasInformativas = new JInternalFrame();
					GroupLayout jF_NotasInformativasLayout = new GroupLayout((JComponent)jF_NotasInformativas.getContentPane());
					jTabbedPane1.addTab("Notas Informativas", null, jF_NotasInformativas, null);
					jF_NotasInformativas.setLayout(jF_NotasInformativasLayout);
					jF_NotasInformativas.setVisible(true);
					{
						jB_ModificarNota = new JButton();
						jB_ModificarNota.setText("Modificar");
						jB_ModificarNota.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ModificarNotaActionPerformed(evt);
							}
						});
					}
					{
						jB_BajaNota = new JButton();
						jB_BajaNota.setText("Dar de Baja");
						jB_BajaNota.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_BajaNotaActionPerformed(evt);
							}
						});
					}
					{
						jB_AltaNota = new JButton();
						jB_AltaNota.setText("Dar de Alta");
						jB_AltaNota.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_AltaNotaActionPerformed(evt);
							}
						});
					}
					{
						TableModel jTable1Model = TNota;
//								new DefaultTableModel(
//										new String[][] { { "One", "Two" }, { "Three", "Four" } },
//										new String[] { "Column 1", "Column 2" });
						jT_NotasInformativas = new JTable();
						jT_NotasInformativas.setModel(jTable1Model);
						jT_NotasInformativas.setBorder(BorderFactory.createTitledBorder(""));
					}
					{
						jB_InformeNota = new JButton();
						jB_InformeNota.setText("Informe");
						jB_InformeNota.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_InformeNotaActionPerformed(evt);
							}
						});
					}
						jF_NotasInformativasLayout.setHorizontalGroup(jF_NotasInformativasLayout.createSequentialGroup()
						.addComponent(jT_NotasInformativas, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
						.addGap(12)
						.addGroup(jF_NotasInformativasLayout.createParallelGroup()
						    .addComponent(jB_InformeNota, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jB_AltaNota, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jB_BajaNota, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jB_ModificarNota, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addContainerGap());
						jF_NotasInformativasLayout.setVerticalGroup(jF_NotasInformativasLayout.createSequentialGroup()
						.addGroup(jF_NotasInformativasLayout.createParallelGroup()
						    .addComponent(jT_NotasInformativas, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addGroup(GroupLayout.Alignment.LEADING, jF_NotasInformativasLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jB_AltaNota, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jB_BajaNota, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jB_ModificarNota, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addGap(41)
						.addComponent(jB_InformeNota, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(219, Short.MAX_VALUE));
				}
				{
					jF_Recibos = new JInternalFrame();
					GroupLayout jF_RecibosLayout = new GroupLayout((JComponent)jF_Recibos.getContentPane());
					jTabbedPane1.addTab("Recibos", null, jF_Recibos, null);
					jF_Recibos.getContentPane().setLayout(jF_RecibosLayout);
					jF_Recibos.setVisible(true);
					{
						jB_ModificarRecibo = new JButton();
						jB_ModificarRecibo.setText("Modificar");
						jB_ModificarRecibo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ModificarReciboActionPerformed(evt);
							}
						});
					}
					{
						jB_BajaRecibo = new JButton();
						jB_BajaRecibo.setText("Dar de Baja");
						jB_BajaRecibo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_BajaReciboActionPerformed(evt);
							}
						});
					}
					{
						jB_AltaRecibo = new JButton();
						jB_AltaRecibo.setText("Dar de Alta");
						jB_AltaRecibo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_AltaReciboActionPerformed(evt);
							}
						});
					}
					{
						TableModel jTable1Model = TRecibo;
//								new DefaultTableModel(
//										new String[][] { { "One", "Two" }, { "Three", "Four" } },
//										new String[] { "Column 1", "Column 2" });
						jT_Recibos = new JTable();
						jT_Recibos.setModel(jTable1Model);
					}
					{
						jB_ActualizarRecibo = new JButton();
						jB_ActualizarRecibo.setText("Actualizar");
						jB_ActualizarRecibo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ActualizarReciboActionPerformed(evt);
							}
						});
					}
					{
						jB_PagarRecibos = new JButton();
						jB_PagarRecibos.setText("Pagar");
						jB_PagarRecibos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_PagarRecibosActionPerformed(evt);
							}
						});
					}
					{
						jTF_Pagar = new JTextField();
					}
					{
						jL_Pagar = new JLabel();
						jL_Pagar.setText("Inserta fecha de pago");
					}
						jF_RecibosLayout.setHorizontalGroup(jF_RecibosLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.LEADING, jF_RecibosLayout.createSequentialGroup()
						    .addComponent(jT_Recibos, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addGroup(jF_RecibosLayout.createParallelGroup()
						        .addGroup(jF_RecibosLayout.createSequentialGroup()
						            .addComponent(jB_ModificarRecibo, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						        .addGroup(jF_RecibosLayout.createSequentialGroup()
						            .addComponent(jB_BajaRecibo, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						        .addGroup(jF_RecibosLayout.createSequentialGroup()
						            .addComponent(jB_AltaRecibo, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
						    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(GroupLayout.Alignment.LEADING, jF_RecibosLayout.createSequentialGroup()
						    .addGap(159)
						    .addComponent(jL_Pagar, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jTF_Pagar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addComponent(jB_PagarRecibos, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addGap(93)
						    .addComponent(jB_ActualizarRecibo, 0, 140, Short.MAX_VALUE)
						    .addContainerGap()));
						jF_RecibosLayout.setVerticalGroup(jF_RecibosLayout.createSequentialGroup()
						.addGroup(jF_RecibosLayout.createParallelGroup()
						    .addComponent(jT_Recibos, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addGroup(GroupLayout.Alignment.LEADING, jF_RecibosLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jB_AltaRecibo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jB_BajaRecibo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jB_ModificarRecibo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addGap(20)
						.addGroup(jF_RecibosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(jB_ActualizarRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jL_Pagar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jTF_Pagar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jB_PagarRecibos, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(215, 215));
				}
				{
					jF_LineaFacturas = new JInternalFrame();
					GroupLayout jF_LineaFacturasLayout = new GroupLayout((JComponent)jF_LineaFacturas.getContentPane());
					jTabbedPane1.addTab("Linea Factura", null, jF_LineaFacturas, null);
					jF_LineaFacturas.setLayout(jF_LineaFacturasLayout);
					jF_LineaFacturas.setVisible(true);
					{
						jB_AltaLinea = new JButton();
						jB_AltaLinea.setText("Dar de Alta");
						jB_AltaLinea.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_AltaLineaActionPerformed(evt);
							}
						});
					}
					{
						jB_BajaLinea = new JButton();
						jB_BajaLinea.setText("Dar de Baja");
						jB_BajaLinea.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_BajaLineaActionPerformed(evt);
							}
						});
					}
					{
						jB_ModificarLinea = new JButton();
						jB_ModificarLinea.setText("Modificar");
						jB_ModificarLinea.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ModificarLineaActionPerformed(evt);
							}
						});
					}
					{
						TableModel jTable1Model = TLinea;
//								new DefaultTableModel(
//										new String[][] { { "One", "Two" }, { "Three", "Four" } },
//										new String[] { "Column 1", "Column 2" });
						jT_LineaFactura = new JTable();
						jT_LineaFactura.setModel(jTable1Model);
					}
						jF_LineaFacturasLayout.setHorizontalGroup(jF_LineaFacturasLayout.createSequentialGroup()
						.addComponent(jT_LineaFactura, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
						.addGap(12)
						.addGroup(jF_LineaFacturasLayout.createParallelGroup()
						    .addGroup(jF_LineaFacturasLayout.createSequentialGroup()
						        .addComponent(jB_ModificarLinea, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						    .addGroup(GroupLayout.Alignment.LEADING, jF_LineaFacturasLayout.createSequentialGroup()
						        .addComponent(jB_BajaLinea, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						    .addGroup(jF_LineaFacturasLayout.createSequentialGroup()
						        .addComponent(jB_AltaLinea, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
						jF_LineaFacturasLayout.setVerticalGroup(jF_LineaFacturasLayout.createSequentialGroup()
						.addGroup(jF_LineaFacturasLayout.createParallelGroup()
						    .addGroup(jF_LineaFacturasLayout.createSequentialGroup()
						        .addComponent(jT_LineaFactura, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						    .addGroup(GroupLayout.Alignment.LEADING, jF_LineaFacturasLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jB_AltaLinea, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addGap(11)
						        .addComponent(jB_BajaLinea, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addGap(11)
						        .addComponent(jB_ModificarLinea, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(310, Short.MAX_VALUE));
				}
				{
					jF_Carta = new JInternalFrame();
					GroupLayout jF_CartaLayout = new GroupLayout((JComponent)jF_Carta.getContentPane());
					jTabbedPane1.addTab("Carta", null, jF_Carta, null);
					jF_Carta.setLayout(jF_CartaLayout);
					jF_Carta.setVisible(true);
					{
						jB_ModificarCarta = new JButton();
						jB_ModificarCarta.setText("Modificar");
						jB_ModificarCarta.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_ModificarCartaActionPerformed(evt);
							}
						});
					}
					{
						jB_BajaCarta = new JButton();
						jB_BajaCarta.setText("Dar de Baja");
						jB_BajaCarta.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_BajaCartaActionPerformed(evt);
							}
						});
					}
					{
						jB_AltaCarta = new JButton();
						jB_AltaCarta.setText("Dar de Alta");
						jB_AltaCarta.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_AltaCartaActionPerformed(evt);
							}
						});
					}
					{
						TableModel jTable1Model = TCarta;
//								new DefaultTableModel(
//										new String[][] { { "One", "Two" }, { "Three", "Four" } },
//										new String[] { "Column 1", "Column 2" });
						jT_Cartas = new JTable();
						jT_Cartas.setModel(jTable1Model);
					}
						jF_CartaLayout.setHorizontalGroup(jF_CartaLayout.createSequentialGroup()
						.addComponent(jT_Cartas, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
						.addGap(12)
						.addGroup(jF_CartaLayout.createParallelGroup()
						    .addGroup(jF_CartaLayout.createSequentialGroup()
						        .addComponent(jB_AltaCarta, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						    .addGroup(GroupLayout.Alignment.LEADING, jF_CartaLayout.createSequentialGroup()
						        .addComponent(jB_BajaCarta, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						    .addGroup(jF_CartaLayout.createSequentialGroup()
						        .addComponent(jB_ModificarCarta, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
						jF_CartaLayout.setVerticalGroup(jF_CartaLayout.createSequentialGroup()
						.addGroup(jF_CartaLayout.createParallelGroup()
						    .addGroup(jF_CartaLayout.createSequentialGroup()
						        .addComponent(jT_Cartas, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						    .addGroup(GroupLayout.Alignment.LEADING, jF_CartaLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jB_AltaCarta, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addGap(11)
						        .addComponent(jB_BajaCarta, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addGap(11)
						        .addComponent(jB_ModificarCarta, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(310, Short.MAX_VALUE));
				}
			}
			this.setSize(800, 600);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("File");
					{
						newFileMenuItem = new JMenuItem();
						jMenu3.add(newFileMenuItem);
						newFileMenuItem.setText("New");
					}
					{
						openFileMenuItem = new JMenuItem();
						jMenu3.add(openFileMenuItem);
						openFileMenuItem.setText("Open");
					}
					{
						saveMenuItem = new JMenuItem();
						jMenu3.add(saveMenuItem);
						saveMenuItem.setText("Save");
					}
					{
						saveAsMenuItem = new JMenuItem();
						jMenu3.add(saveAsMenuItem);
						saveAsMenuItem.setText("Save As ...");
					}
					{
						closeFileMenuItem = new JMenuItem();
						jMenu3.add(closeFileMenuItem);
						closeFileMenuItem.setText("Close");
					}
					{
						jSeparator2 = new JSeparator();
						jMenu3.add(jSeparator2);
					}
					{
						exitMenuItem = new JMenuItem();
						jMenu3.add(exitMenuItem);
						exitMenuItem.setText("Exit");
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("Edit");
					{
						cutMenuItem = new JMenuItem();
						jMenu4.add(cutMenuItem);
						cutMenuItem.setText("Cut");
					}
					{
						copyMenuItem = new JMenuItem();
						jMenu4.add(copyMenuItem);
						copyMenuItem.setText("Copy");
					}
					{
						pasteMenuItem = new JMenuItem();
						jMenu4.add(pasteMenuItem);
						pasteMenuItem.setText("Paste");
					}
					{
						jSeparator1 = new JSeparator();
						jMenu4.add(jSeparator1);
					}
					{
						deleteMenuItem = new JMenuItem();
						jMenu4.add(deleteMenuItem);
						deleteMenuItem.setText("Delete");
					}
				}
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("Help");
					{
						helpMenuItem = new JMenuItem();
						jMenu5.add(helpMenuItem);
						helpMenuItem.setText("Help");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*************************************************************************************************/
	/*									
	 * 												PROPIETARIOS 
	 */
	/*************************************************************************************************/
	private void jBAltaPropietarioActionPerformed(ActionEvent evt) {
		gp.setVisible(true);
	}
	
	private void jBBajaPropietarioActionPerformed(ActionEvent evt) {
		PropietarioHome pHome = new PropietarioHome();
		
		int row = (int) jT_Propietarios.getSelectedRow(); 
		int id = (int) TPropietarios.getValueAt(row, 0);
		
		boolean borrar = true;

		if (row == -1){
			// mostrar error
		}
		else {
			for(Inmueble i : new InmuebleHome().buscarInmuebles()) {
				if (i.getPropietario().getIdPropietario() == id)
					borrar = false;
			}
			
			if(borrar) {
				pHome.borrarPropietario(id);
				TPropietarios.removeRow(row);
			}
		}
	}
	
	private void jBModificarPropietarioActionPerformed(ActionEvent evt) {
		int row = (int) jT_Propietarios.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			PropietarioHome pHome = new PropietarioHome();

			Propietario p = new Propietario();
			p.setIdPropietario(Integer.parseInt(TPropietarios.getValueAt(row, 0).toString()));
			p.setNif(TPropietarios.getValueAt(row, 1).toString());
			p.setNombre(TPropietarios.getValueAt(row, 2).toString());
			p.setDireccion(TPropietarios.getValueAt(row, 3).toString());
			p.setPoblacion(TPropietarios.getValueAt(row, 4).toString());
			p.setTelefono(TPropietarios.getValueAt(row, 5).toString());
			p.setObservaciones(TPropietarios.getValueAt(row, 6).toString());
			p.setFechaalta(TPropietarios.getValueAt(row, 7).toString());
			
			
			GestionPropietariosGUI gp_mod = new GestionPropietariosGUI(TPropietarios, row, pHome, p);
			gp_mod.setVisible(true);
		}
	}
	
	
	
	private void jB_ListarInmueblesYRecibosActionPerformed(ActionEvent evt) {
		int numRecibosPendientes = 0;
		float importeTotal = 0.0f;

		int row = (int) jT_Propietarios.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			int idPropietario = Integer.parseInt(TPropietarios.getValueAt(row, 0).toString());
			
			while (TIPropietario.getRowCount() > 0)
				TIPropietario.removeRow(0);
			
			while (TRPropietario.getRowCount() > 0)
				TRPropietario.removeRow(0);
			
			
			for(Inmueble i : new InmuebleHome().buscarInmuebles()) {
				if(i.getPropietario().getIdPropietario() == idPropietario) {
					TIPropietario.addToTabla(i);
				}
			}
			
			for (Reciboinmueble r : new ReciboinmuebleHome().buscarReciboinmuebles()) {
				if(r.getInmueble().getPropietario().getIdPropietario() == idPropietario) {
					if(r.getFechapago().isEmpty()) {
						r.setPagado("Pendiente");
						numRecibosPendientes++;
						importeTotal += r.getImporte();
					} else {
						r.setPagado("Pagado");
					}
					TRPropietario.addToTabla(r);
				}
			}
		}
		
		jL_numero.setText(""+numRecibosPendientes);
		jL_total.setText(""+importeTotal);
	}
	
	

	private void jB_FiltrarActionPerformed(ActionEvent evt) {
		int numRecibosPendientes = 0;
		float importeTotal = 0.0f;
		
		int row = (int) jT_InmueblesPropietario.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			int idInmueble = Integer.parseInt(TIPropietario.getValueAt(row, 0).toString());
			
			while (TRPropietario.getRowCount() > 0)
				TRPropietario.removeRow(0);
			
			for (Reciboinmueble r : new ReciboinmuebleHome().buscarReciboinmuebles()) {
				if(r.getInmueble().getIdInmueble() == idInmueble) {
					if(r.getFechapago().isEmpty()) {
						r.setPagado("Pendiente");
						numRecibosPendientes++;
						importeTotal += r.getImporte();
					} else {
						r.setPagado("Pagado");
					}
					TRPropietario.addToTabla(r);
				}
			}
		}
		
		
		jL_numero.setText(""+numRecibosPendientes);
		jL_total.setText(""+importeTotal);
	}
	
	
	private void jB_PagarPropietarioActionPerformed(ActionEvent evt) {
		ReciboinmuebleHome riHome = new ReciboinmuebleHome();

		int row = (int) jT_RecibosPropietario.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			int id = (int) TRPropietario.getValueAt(row, 0);
			Reciboinmueble ri = riHome.buscarReciboinmueblePorID(id);
			
			String fechapago = jTF_PagarPropietario.getText();
			ri.setFechapago(fechapago);
			riHome.updateRecibo(id, fechapago, ri.getInmueble(), ri.getNotainformativa(), ri.getCarta());
			
			
			while (TRPropietario.getRowCount() > 0) {
				TRPropietario.removeRow(0);
			}
			
			
			for(Reciboinmueble r : new ReciboinmuebleHome().buscarReciboinmuebles()) {
				if(r.getFechapago().isEmpty())
					r.setPagado("Pendiente");
				else 
					r.setPagado("Pagado");
				
				TRPropietario.addToTabla(r);
			}
		}
		
	}

	/*************************************************************************************************/
	/*									
	 * 												COMUNIDADES 
	 */
	/*************************************************************************************************/
	private void jBAltaComunidadActionPerformed(ActionEvent evt) {
		gc.setVisible(true);
	}
	
	private void jBBajaComunidadActionPerformed(ActionEvent evt) {
		ComunidadHome cHome = new ComunidadHome();
		boolean tieneInmuebles = false;
		boolean tieneFacturas = false;
		
		int row = (int) jT_Comunidades.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else{
			int id = (int) TComunidades.getValueAt(row, 0);
			Comunidad c = cHome.buscarComunidadPorID(id);
			
			

			for(Factura f : new FacturaHome().buscarFacturas()) {
				if(f.getComunidad().getIdComunidad() == id &&
						f.getFechafactura().isEmpty()) {
					tieneFacturas = true;
					break;
				}
			}
			
			if(!tieneFacturas)
				for(Inmueble i : new InmuebleHome().buscarInmuebles()) {
					if (i.getComunidad().getIdComunidad() == id) {
						tieneInmuebles = true;
						break;
					}
				}
			
			
			if(tieneFacturas) {
				c.setEstado("Moroso");
				cHome.updateComunidad(id, c.getCalle(), c.getMaxrecibospendientes(), c.getEstado(), c.getIdInmueblePresidente());
			}
			else if(tieneInmuebles) {
				c.setEstado("Baja");
				cHome.updateComunidad(id, c.getCalle(), c.getMaxrecibospendientes(), c.getEstado(), c.getIdInmueblePresidente());
			} else {
				cHome.borrarComunidad(id);
				TComunidades.removeRow(row);
			}
			
			actualizarComunidad();
			
		}
	}
	
	private void jBModificarComunidadActionPerformed(ActionEvent evt) {
		int row = (int) jT_Comunidades.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			ComunidadHome cHome = new ComunidadHome();
			Comunidad c	= new Comunidad();
			
			c.setIdComunidad(Integer.parseInt(TComunidades.getValueAt(row, 0).toString()));
			c.setCalle(TComunidades.getValueAt(row, 1).toString());
			c.setMaxrecibospendientes(Integer.parseInt(TComunidades.getValueAt(row, 2).toString()));
			c.setEstado(TComunidades.getValueAt(row, 3).toString());
			c.setIdInmueblePresidente(Integer.parseInt(TComunidades.getValueAt(row, 4).toString()));
			
			GestionComunidadesGUI gc_mod = new GestionComunidadesGUI(TComunidades, row, cHome, c);
			gc_mod.setVisible(true);
		}
	}

	
	private void jB_ActualizarComunidadActionPerformed(ActionEvent evt) {
		actualizarComunidad();
	}
	
	
	private void jB_GenerarReciboActionPerformed(ActionEvent evt) {
		
		int row = (int) jT_Comunidades.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			int id = (int) TComunidades.getValueAt(row, 0);
			
			for(Factura f : new FacturaHome().buscarFacturas()) {
				
				if(f.getComunidad().getIdComunidad() == id && f.getFechafactura().isEmpty()) {
					
					for(Inmueble i : new InmuebleHome().buscarInmuebles()) {
						
						if(i.getComunidad().getIdComunidad() == id)	{
							Reciboinmueble ri = new Reciboinmueble();
							ri.setInmueble(i);
							ri.setNotainformativa(f.getNotainformativa());
							ri.setImporte(f.getNotainformativa().getImportenota());
							TRecibo.addReciboinmueble(ri);
						}
					}
				}
			}
		}
		
	}

	
	
	/*************************************************************************************************/
	/*									
	 * 												INMUEBLES 
	 */
	/*************************************************************************************************/
	private void jBAltaInmuebleActionPerformed(ActionEvent evt) {
		gi.setVisible(true);
	}
	
	private void jBBajaInmuebleActionPerformed(ActionEvent evt) {
		InmuebleHome iHome = new InmuebleHome();
		DatosbancariosHome dbHome = new DatosbancariosHome();
		boolean tieneRecibosPendientes = false;
		
		int row = (int) jT_Inmuebles.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else{
			int id = (int) TInmuebles.getValueAt(row, 0);

			
			for(Reciboinmueble r : new ReciboinmuebleHome().buscarReciboinmuebles()) {
				if (r.getInmueble().getIdInmueble() == id && r.getFechapago().isEmpty()) {
					tieneRecibosPendientes = true;
					break;
				}
			}
			
			if(!tieneRecibosPendientes) {
				
				for(Reciboinmueble r : new ReciboinmuebleHome().buscarReciboinmuebles()) {
					if (r.getInmueble().getIdInmueble() == id) {
						new ReciboinmuebleHome().borrarReciboinmueble(r.getInmueble().getIdInmueble());
					}
				}
				
				actualizarRecibos();
				
				iHome.borrarInmueble(id);
				TInmuebles.removeRow(row);

			}
			
			
//			int idDatos = (int) TInmuebles.getValueAt(row, 7);
//			dbHome.borrarDatosbancarios(idDatos);
			
		}
	}
	
	private void jBModificarInmuebleActionPerformed(ActionEvent evt) {
		int row = (int) jT_Inmuebles.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			InmuebleHome iHome = new InmuebleHome();
			DatosbancariosHome dbHome = new DatosbancariosHome();
			
			Propietario p = new PropietarioHome().buscarPropietarioPorID(
					Integer.parseInt(TInmuebles.getValueAt(row, 6).toString()));

			Inmueble i = new Inmueble();
			i.setIdInmueble(Integer.parseInt(TInmuebles.getValueAt(row, 0).toString()));
			i.setEscalera(TInmuebles.getValueAt(row, 1).toString());
			i.setPiso(TInmuebles.getValueAt(row, 2).toString());
			i.setPuerta(TInmuebles.getValueAt(row, 3).toString());
			i.setPorcentaje(Double.parseDouble(TInmuebles.getValueAt(row, 4).toString()));
			i.setPropietario(p);
			
			
			Datosbancarios db = new Datosbancarios();
//			db.setIdDatosbancarios(Integer.parseInt(TInmuebles.getValueAt(row, 7).toString()));
//			db.setEntidad(TInmuebles.getValueAt(row, 8).toString());
//			db.setNumerocuenta(TInmuebles.getValueAt(row, 9).toString());
			
			GestionInmueblesGUI gi_mod = new GestionInmueblesGUI(TInmuebles, row, iHome, i, dbHome, db);
			gi_mod.setVisible(true);
			
			
		}
		
	}
	

	/*************************************************************************************************/
	/*									
	 * 												CONCEPTOS 
	 */
	/*************************************************************************************************/
	private void jBModificarConceptoActionPerformed(ActionEvent evt) {
		int row = (int) jT_Conceptos.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			ConceptoHome conHome = new ConceptoHome();

			Concepto c = new Concepto();
			c.setIdConcepto(Integer.parseInt(TConceptos.getValueAt(row, 0).toString()));
			c.setDescripcion(TConceptos.getValueAt(row, 1).toString());
			
			GestionConceptoGUI gcon_mod = new GestionConceptoGUI(TConceptos, row, conHome, c);
			gcon_mod.setVisible(true);
		}
	}
	
	private void jBBajaConceptoActionPerformed(ActionEvent evt) {
		ConceptoHome conHome = new ConceptoHome();
		int row = (int) jT_Conceptos.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else{
			int id = (int) TConceptos.getValueAt(row, 0);
			conHome.borrarConcepto(id);
			TConceptos.removeRow(row);
		}
	}
	
	private void jBAltaConceptoActionPerformed(ActionEvent evt) {
		gcon.setVisible(true);
	}
	
	
	/*************************************************************************************************/
	/*									
	 * 												FACTURAS 
	 */
	/*************************************************************************************************/
	private void jB_ModificarFacturaActionPerformed(ActionEvent evt) {
		int row = (int) jT_Facturas.getSelectedRow(); 
		

		int id_restriccion = Integer.parseInt(jT_Facturas.getValueAt(row, 3).toString());
		
		
		if (row == -1){
			// mostrar error
		}
		else if(!new NotainformativaHome().buscarNotainformativaPorID(id_restriccion).getReciboinmuebles().isEmpty()) {
			/*
			 * No se puede modificar una factura incluida en un recibo
			 */
		}
		else {
			FacturaHome fHome = new FacturaHome();
			Comunidad c = new ComunidadHome().buscarComunidadPorID(
					Integer.parseInt(TFactura.getValueAt(row, 1).toString()));
			
			Notainformativa ni = new NotainformativaHome().buscarNotainformativaPorID(
					Integer.parseInt(TFactura.getValueAt(row, 3).toString()));
			
			

			Factura f = new Factura();
			f.setNumfactura(Integer.parseInt(TFactura.getValueAt(row, 0).toString()));
			f.setComunidad(c);
			f.setNotainformativa(ni);
			f.setFechafactura(TFactura.getValueAt(row, 2).toString());
			
			GestionFacturasGUI gf_mod = new GestionFacturasGUI(TFactura, row, fHome, f);
			gf_mod.setVisible(true);
		}
	}
	
	private void jB_BajaFacturaActionPerformed(ActionEvent evt) {
		FacturaHome fHome = new FacturaHome();
		int row = (int) jT_Facturas.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else{
			int num = (int) TFactura.getValueAt(row, 0);
			fHome.borrarFactura(num);
			TFactura.removeRow(row);
		}
	}
	
	private void jB_AltaFacturaActionPerformed(ActionEvent evt) {
		gf.setVisible(true);
	}
	
	
	/*************************************************************************************************/
	/*									
	 * 												NOTAS INFORMATIVAS 
	 */
	/*************************************************************************************************/
	private void jB_ModificarNotaActionPerformed(ActionEvent evt) {
		int row = (int) jT_NotasInformativas.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			NotainformativaHome niHome = new NotainformativaHome();
			
			Comunidad c = new ComunidadHome().buscarComunidadPorID(
					Integer.parseInt(TNota.getValueAt(row, 3).toString()));
			
			Notainformativa ni = new Notainformativa();
			ni.setIdNotainformativa(Integer.parseInt(TNota.getValueAt(row, 0).toString()));
			ni.setFechacalculo(TNota.getValueAt(row, 1).toString());
			ni.setImportenota(Double.parseDouble(TNota.getValueAt(row, 2).toString()));
			ni.setComunidad(c);
			
			GestionNotaInformativaGUI gni_mod = new GestionNotaInformativaGUI(TNota, row, niHome, ni);
			gni_mod.setVisible(true);
		}
	}
	
	private void jB_BajaNotaActionPerformed(ActionEvent evt) {
		NotainformativaHome niHome = new NotainformativaHome();
		int row = (int) jT_NotasInformativas.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else{
			int id = (int) TNota.getValueAt(row, 0);
			niHome.borrarNotainformativa(id);
			TNota.removeRow(row);
		}
	}
	
	private void jB_AltaNotaActionPerformed(ActionEvent evt) {
		gni.setVisible(true);
	}
	
	
	/*************************************************************************************************/
	/*									
	 * 												RECIBOS 
	 */
	/*************************************************************************************************/
	private void jB_ModificarReciboActionPerformed(ActionEvent evt) {
		int row = (int) jT_Recibos.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			ReciboinmuebleHome riHome = new ReciboinmuebleHome();
			
			
			double importe = Double.parseDouble(TRecibo.getValueAt(row, 2).toString());

			Inmueble i = new InmuebleHome().buscarInmueblePorID(
					Integer.parseInt(TRecibo.getValueAt(row, 3).toString()));
			Notainformativa ni = new NotainformativaHome().buscarNotainformativaPorID(
					Integer.parseInt(TRecibo.getValueAt(row, 4).toString()));
			Carta c = new CartaHome().buscarCartaPorID(
					Integer.parseInt(TRecibo.getValueAt(row, 5).toString()));
			
			
		

			Reciboinmueble ri = new Reciboinmueble();
			ri.setIdReciboinmueble(Integer.parseInt(TRecibo.getValueAt(row, 0).toString()));
			ri.setFechapago(TRecibo.getValueAt(row, 1).toString());
			ri.setInmueble(i);
			ri.setNotainformativa(ni);
			ri.setCarta(c);
			ri.setImporte(importe);
			
			GestionRecibosGUI gri_mod = new GestionRecibosGUI(TRecibo, row, riHome, ri);
			gri_mod.setVisible(true);
		}
	}
	
	private void jB_BajaReciboActionPerformed(ActionEvent evt) {
		ReciboinmuebleHome riHome = new ReciboinmuebleHome();
		int row = (int) jT_Recibos.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else{
			int id = (int) TRecibo.getValueAt(row, 0);
			riHome.borrarReciboinmueble(id);
			TRecibo.removeRow(row);
		}
	}
	
	private void jB_AltaReciboActionPerformed(ActionEvent evt) {
		gr.setVisible(true);
		actualizarRecibos();
	}
	
	private void jB_PagarRecibosActionPerformed(ActionEvent evt) {
		ReciboinmuebleHome riHome = new ReciboinmuebleHome();

		int row = (int) jT_Recibos.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			int id = (int) TRecibo.getValueAt(row, 0);
			Reciboinmueble ri = riHome.buscarReciboinmueblePorID(id);
			
			String fechapago = jTF_Pagar.getText();
			ri.setFechapago(fechapago);
			riHome.updateRecibo(id, fechapago, ri.getInmueble(), ri.getNotainformativa(), ri.getCarta());
			
			
			while (TRecibo.getRowCount() > 0)
				TRecibo.removeRow(0);
			
			
			for(Reciboinmueble r : new ReciboinmuebleHome().buscarReciboinmuebles()) {
				if(r.getFechapago().isEmpty())
					r.setPagado("Pendiente");
				else 
					r.setPagado("Pagado");
				
				TRecibo.addToTabla(r);
			}
		}
	}
	

	private void jB_ActualizarReciboActionPerformed(ActionEvent evt) {
		actualizarRecibos();
	}
	
	/*************************************************************************************************/
	/*									
	 * 												LINEA FACTURA 
	 */
	/*************************************************************************************************/
	private void jB_AltaLineaActionPerformed(ActionEvent evt) {
		glf.setVisible(true);
	}
	
	private void jB_BajaLineaActionPerformed(ActionEvent evt) {
		LineafacturaHome lfHome = new LineafacturaHome();
		int row = (int) jT_LineaFactura.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else{
			int id = (int) TLinea.getValueAt(row, 0);
			lfHome.borrarLineafactura(id);
			TLinea.removeRow(row);
		}
	}
	
	private void jB_ModificarLineaActionPerformed(ActionEvent evt) {
		
		int row = (int) jT_LineaFactura.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			LineafacturaHome lfHome = new LineafacturaHome();

			Concepto c = new ConceptoHome().buscarConceptoPorID(
					Integer.parseInt(TRecibo.getValueAt(row, 3).toString()));
			Factura f = new FacturaHome().buscarFacturaPorID(
					Integer.parseInt(TRecibo.getValueAt(row, 4).toString()));
			
			Lineafactura lf = new Lineafactura();
			lf.setIdLineafactura(Integer.parseInt(TLinea.getValueAt(row, 0).toString()));
			lf.setImportelinea(Double.parseDouble(TLinea.getValueAt(row, 1).toString()));
			lf.setObservacion(TLinea.getValueAt(row, 2).toString());
			lf.setFactura(f);
			lf.setConcepto(c);
			
			
			GestionLineaFacturaGUI glf_mod = new GestionLineaFacturaGUI(TLinea, row, lfHome, lf);
			glf_mod.setVisible(true);
		}
	}
	
	
	/*************************************************************************************************/
	/*									
	 * 												CARTA 
	 */
	/*************************************************************************************************/
	private void jB_ModificarCartaActionPerformed(ActionEvent evt) {
		int row = (int) jT_Cartas.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else {
			CartaHome carHome = new CartaHome();

			Carta c = new Carta();
			c.setIdCarta(Integer.parseInt(TCarta.getValueAt(row, 0).toString()));
			c.setFecha(TCarta.getValueAt(row, 1).toString());
			
			
			GestionCartasGUI gcar_mod = new GestionCartasGUI(TCarta, row, carHome, c);
			gcar_mod.setVisible(true);
		}
	}
	
	private void jB_BajaCartaActionPerformed(ActionEvent evt) {
		CartaHome carHome = new CartaHome();
		int row = (int) jT_Cartas.getSelectedRow(); 
		if (row == -1){
			// mostrar error
		}
		else{
			int id = (int) TCarta.getValueAt(row, 0);
			carHome.borrarCarta(id);
			TCarta.removeRow(row);
		}
	}
	
	private void jB_AltaCartaActionPerformed(ActionEvent evt) {
		gcar.setVisible(true);
	}
	
	
	
	/*************************************************************************************************/
	/*									
	 * 												INFORMES 
	 */
	/*************************************************************************************************/


	

	private void jB_InformeNotaActionPerformed(ActionEvent evt) {
	}
	
	private void jB_ActualizarInmueblesActionPerformed(ActionEvent evt) {
		actualizarInmuebles();
		actualizarComunidad();
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		actualizarFacturas();
	}

}
