package interfazGrafica;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class GestionComunidadesGUI extends javax.swing.JFrame {
	private JLabel jL_IDComunidades;
	private JLabel jL_MaxRecibosPendientesComunidades;
	private JButton jB_CancelarComunidades;
	private JButton jB_GuardarComunidades;
	private JTextField jTF_IDPresidenteComunidades;
	private JTextField jTF_EstadoComunidades;
	private JTextField jTF_MaxRecibosPendientesComunidades;
	private JTextField jTF_CalleComunidades;
	private JTextField jTF_IDComunidades;
	private JLabel jL_IDPresidenteComunidades;
	private JLabel jL_EstadoComunidades;
	private JLabel jL_CalleComunidades;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public GestionComunidadesGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Comunidades");
			{
				jL_IDComunidades = new JLabel();
				jL_IDComunidades.setText("ID");
			}
			{
				jL_CalleComunidades = new JLabel();
				jL_CalleComunidades.setText("Calle");
			}
			{
				jL_MaxRecibosPendientesComunidades = new JLabel();
				jL_MaxRecibosPendientesComunidades.setText("MaxRecibosPendientes");
			}
			{
				jL_EstadoComunidades = new JLabel();
				jL_EstadoComunidades.setText("Estado");
			}
			{
				jL_IDPresidenteComunidades = new JLabel();
				jL_IDPresidenteComunidades.setText("ID Presidente");
			}
			{
				jTF_IDPresidenteComunidades = new JTextField();
			}
			{
				jTF_EstadoComunidades = new JTextField();
			}
			{
				jTF_MaxRecibosPendientesComunidades = new JTextField();
			}
			{
				jTF_IDComunidades = new JTextField();
			}
			{
				jB_GuardarComunidades = new JButton();
				jB_GuardarComunidades.setText("Guardar");
				jB_GuardarComunidades.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarComunidadesActionPerformed(evt);
					}
				});
			}
			{
				jB_CancelarComunidades = new JButton();
				jB_CancelarComunidades.setText("Cancelar");
				jB_CancelarComunidades.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarComunidadesActionPerformed(evt);
					}
				});
			}
			{
				jTF_CalleComunidades = new JTextField();
			}
				thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(19, 19)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_IDComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_IDComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_CalleComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_CalleComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_MaxRecibosPendientesComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_MaxRecibosPendientesComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_EstadoComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_EstadoComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_IDPresidenteComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_IDPresidenteComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(0, 41, Short.MAX_VALUE)
					.addGroup(thisLayout.createParallelGroup()
					    .addComponent(jB_GuardarComunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jB_CancelarComunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap());
				thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(42, 42)
					.addGroup(thisLayout.createParallelGroup()
					    .addComponent(jL_IDPresidenteComunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(jL_EstadoComunidades, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					        .addGap(91))
					    .addComponent(jL_MaxRecibosPendientesComunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(jL_CalleComunidades, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					        .addGap(91))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(jL_IDComunidades, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					        .addGap(91))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addGap(24)
					        .addComponent(jB_GuardarComunidades, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					        .addGap(30)))
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(thisLayout.createSequentialGroup()
					        .addComponent(jTF_IDPresidenteComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addComponent(jTF_EstadoComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addComponent(jTF_MaxRecibosPendientesComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addComponent(jTF_CalleComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addComponent(jTF_IDComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(jB_CancelarComunidades, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 19, Short.MAX_VALUE)))
					.addContainerGap(67, 67));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_GuardarComunidadesActionPerformed(ActionEvent evt) {

	}
	
	private void jB_CancelarComunidadesActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
