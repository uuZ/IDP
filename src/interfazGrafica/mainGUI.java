package interfazGrafica;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;


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

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
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
	private JButton jBAltaInmueble;
	private JButton jBBajaInmueble;
	private JButton jBModificarInmueble;
	private JButton jBModificarComunidad;
	private JButton jBBajaComunidad;
	private JMenuItem openFileMenuItem;
	private JMenuItem newFileMenuItem;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;

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
	
	public mainGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			{
				jTabbedPane1 = new JTabbedPane();
				getContentPane().add(jTabbedPane1, BorderLayout.CENTER);
				{
					jF_Propietarios = new JInternalFrame();
					GroupLayout jF_PropietariosLayout = new GroupLayout((JComponent)jF_Propietarios.getContentPane());
					jF_Propietarios.getContentPane().setLayout(jF_PropietariosLayout);
					jTabbedPane1.addTab("Propietarios", null, jF_Propietarios, null);
					{
						jBAltaPropietario = new JButton();
						jBAltaPropietario.setText("Dar de Alta");
					}
					{
						jBBajaPropietario = new JButton();
						jBBajaPropietario.setText("Dar de Baja");
					}
					{
						jBModificarPropietario = new JButton();
						jBModificarPropietario.setText("Modificar");
					}
					jF_PropietariosLayout.setHorizontalGroup(jF_PropietariosLayout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jF_PropietariosLayout.createParallelGroup()
						    .addComponent(jBAltaPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBBajaPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBModificarPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)));
					jF_PropietariosLayout.setVerticalGroup(jF_PropietariosLayout.createSequentialGroup()
						.addComponent(jBAltaPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jBBajaPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jBModificarPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(34, Short.MAX_VALUE));
				}
				{
					jF_Inmuebles = new JInternalFrame();
					GroupLayout jF_InmueblesLayout = new GroupLayout((JComponent)jF_Inmuebles.getContentPane());
					jF_Inmuebles.getContentPane().setLayout(jF_InmueblesLayout);
					jTabbedPane1.addTab("Inmuebles", null, jF_Inmuebles, null);
					jF_Inmuebles.setVisible(true);
					{
						jBModificarInmueble = new JButton();
						jBModificarInmueble.setText("Modificar");
					}
					{
						jBBajaInmueble = new JButton();
						jBBajaInmueble.setText("Dar de Baja");
					}
					{
						jBAltaInmueble = new JButton();
						jBAltaInmueble.setText("Dar de Alta");
					}
					jF_InmueblesLayout.setHorizontalGroup(jF_InmueblesLayout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jF_InmueblesLayout.createParallelGroup()
						    .addComponent(jBBajaInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBAltaInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBModificarInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)));
					jF_InmueblesLayout.setVerticalGroup(jF_InmueblesLayout.createSequentialGroup()
						.addComponent(jBAltaInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE)
						.addComponent(jBBajaInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jBModificarInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(34, Short.MAX_VALUE));
				}
				{
					jF_Comunidades = new JInternalFrame();
					jTabbedPane1.addTab("Comunidades", null, jF_Comunidades, null);
					GroupLayout jF_ComunidadesLayout = new GroupLayout((JComponent)jF_Comunidades.getContentPane());
					jF_Comunidades.getContentPane().setLayout(jF_ComunidadesLayout);
					jF_Comunidades.setVisible(true);
					{
						jBAltaComunidad = new JButton();
						jBAltaComunidad.setText("Dar de Alta");
					}
					{
						jBBajaComunidad = new JButton();
						jBBajaComunidad.setText("Dar de Baja");
					}
					{
						jBModificarComunidad = new JButton();
						jBModificarComunidad.setText("Modificar");
					}
					jF_ComunidadesLayout.setHorizontalGroup(jF_ComunidadesLayout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jF_ComunidadesLayout.createParallelGroup()
						    .addComponent(jBModificarComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBBajaComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBAltaComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)));
					jF_ComunidadesLayout.setVerticalGroup(jF_ComunidadesLayout.createSequentialGroup()
						.addComponent(jBAltaComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jBBajaComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jBModificarComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(34, Short.MAX_VALUE));
				}
			}
			setSize(400, 300);
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

}