package Vista;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class Azkena extends JFrame {
	private JTextField txtIzena = new JTextField();
	private JTextField txtDNI = new JTextField();
	private JTextField txtData = new JTextField();
	private JTextField txtLinea = new JTextField();
	private JTextField txtBUS = new JTextField();
	private JTextField txtIgo = new JTextField();
	private JTextField txtJaitsi = new JTextField();
	private JLabel lblIzenabizenak = new JLabel("Izen-abizenak:");
	private JLabel lblDni = new JLabel("DNI:");
	private JLabel lblData = new JLabel("Data:");
	private JLabel lblAukeratutakoLinea = new JLabel("Aukeratutako linea:");
	private JLabel lblBus = new JLabel("BUS:");
	private JLabel lblIgo = new JLabel("Igo:");
	private JLabel lblJaitsi = new JLabel("Jaitsi:");

	/**
	 * Create the panel.
	 */
	public Azkena() {
		setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		lblIzenabizenak.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIzenabizenak.setBounds(84, 52, 131, 25);
		add(lblIzenabizenak);
		
		
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDni.setBounds(84, 107, 83, 19);
		add(lblDni);
		
		
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblData.setBounds(84, 157, 70, 19);
		add(lblData);
		
		
		lblAukeratutakoLinea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAukeratutakoLinea.setBounds(84, 200, 175, 31);
		add(lblAukeratutakoLinea);
		
		
		lblBus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBus.setBounds(84, 260, 55, 19);
		add(lblBus);
		
		
		lblIgo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIgo.setBounds(84, 322, 55, 25);
		add(lblIgo);
		
		
		lblJaitsi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJaitsi.setBounds(324, 323, 61, 23);
		add(lblJaitsi);
		txtIzena.setBackground(Color.WHITE);
		txtIzena.setEditable(false);
		
		 
		txtIzena.setBounds(238, 53, 109, 25);
		add(txtIzena);
		txtIzena.setColumns(10);
		txtDNI.setBackground(Color.WHITE);
		txtDNI.setEditable(false);
		
		
		txtDNI.setBounds(158, 107, 101, 23);
		add(txtDNI);
		txtDNI.setColumns(10);
		txtData.setBackground(Color.WHITE);
		txtData.setEditable(false);
		
		
		txtData.setBounds(164, 157, 109, 23);
		add(txtData);
		txtData.setColumns(10);
		txtLinea.setBackground(Color.WHITE);
		txtLinea.setEditable(false);
		
		
		txtLinea.setBounds(283, 204, 115, 25);
		add(txtLinea);
		txtLinea.setColumns(10);
		txtBUS.setBackground(Color.WHITE);
		txtBUS.setEditable(false);
		
		
		txtBUS.setBounds(157, 260, 102, 23);
		add(txtBUS);
		txtBUS.setColumns(10);
		txtIgo.setBackground(Color.WHITE);
		txtIgo.setEditable(false);
		
		
		txtIgo.setBounds(144, 322, 101, 26);
		add(txtIgo);
		txtIgo.setColumns(10);
		txtJaitsi.setBackground(Color.WHITE);
		txtJaitsi.setEditable(false);
		
		
		txtJaitsi.setBounds(395, 322, 101, 26);
		add(txtJaitsi);
		txtJaitsi.setColumns(10);
		
		
	}
}
