package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Vista.Geltokiak;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Controlador.MetodoakVista;

public class Lineak extends JFrame {

	private JTextField textField = new JTextField();
	private JLabel lblLineak = new JLabel("LINEAK");
	private JLabel lblBus = new JLabel("BUS");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnIrten = new JButton("IRTEN");
	private JButton btnOnartu = new JButton("Onartu");
	private JRadioButton rdbtnL1 = new JRadioButton("L1 - Termibus/Plentzia");
	private JRadioButton rdbtnL2 = new JRadioButton("L2 - Termibus/Muskiz");
	private JRadioButton rdbtnL3 = new JRadioButton("L3 - Termibus/Balmaseda");
	private JRadioButton rdbtnL4 = new JRadioButton("L4 - Termibus/Durango");
	private String linea = "";
	ArrayList geltokia = new ArrayList();
	

	/**
	 * Create the panel.
	 */

	public Lineak() {

		getContentPane().setLayout(null);
		this.setSize(650, 466);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);

		lblLineak.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblLineak.setBounds(58, 58, 132, 32);
		getContentPane().add(lblLineak);
		DefaultListModel modelo = new DefaultListModel();
		modelo.addElement("L1");
		modelo.addElement("L2");
		modelo.addElement("L3");
		modelo.addElement("L4");

		lblBus.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblBus.setBounds(386, 115, 86, 54);
		getContentPane().add(lblBus);
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);

		textField.setBounds(362, 181, 132, 119);
		getContentPane().add(textField);
		textField.setColumns(10);
//		textField.setText(Kontsulta.lineaAukeratu());

		ActionListener alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.laugarrenera(geltokia, linea);
			
				dispose();
			}
		};
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(524, 387, 99, 32);
		getContentPane().add(btnAurrera);
		btnAurrera.setEnabled(false);

		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bigarrenera();
				
				dispose();
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 32);
		getContentPane().add(btnAtzera);

		ActionListener alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(524, 0, 99, 32);
		getContentPane().add(btnIrten);

		rdbtnL1.setBounds(58, 113, 176, 23);
		getContentPane().add(rdbtnL1);
		ActionListener alRdbtn1 = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnL1.isSelected()) {
					rdbtnL2.setSelected(false);
					rdbtnL3.setSelected(false);
					rdbtnL4.setSelected(false);
				}
//				linea = MetodoakVista.aukeratuLinea("L1");
			}
		};
		rdbtnL1.addActionListener(alRdbtn1);

		rdbtnL2.setBounds(58, 146, 156, 23);
		getContentPane().add(rdbtnL2);
		ActionListener alRdbtn2 = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnL2.isSelected()) {
					rdbtnL1.setSelected(false);
					rdbtnL3.setSelected(false);
					rdbtnL4.setSelected(false);
				}
//				linea = MetodoakVista.aukeratuLinea("L2");
			}
		};
		rdbtnL2.addActionListener(alRdbtn2);

		rdbtnL3.setBounds(58, 181, 156, 23);
		getContentPane().add(rdbtnL3);
		ActionListener alRdbtn3 = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnL3.isSelected()) {
					rdbtnL2.setSelected(false);
					rdbtnL1.setSelected(false);
					rdbtnL4.setSelected(false);
				}
//				linea = MetodoakVista.aukeratuLinea("L3");
			}
		};
		rdbtnL3.addActionListener(alRdbtn3);
		
		rdbtnL4.setBounds(58, 216, 156, 23);
		getContentPane().add(rdbtnL4);
		ActionListener alRdbtn4 = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnL4.isSelected()) {
					rdbtnL1.setSelected(false);
					rdbtnL2.setSelected(false);
					rdbtnL3.setSelected(false);
				}
//				linea = MetodoakVista.aukeratuLinea("L4");
			}
		};
		rdbtnL4.addActionListener(alRdbtn4);
		
		btnOnartu.setBounds(68, 265, 89, 23);
		getContentPane().add(btnOnartu);
		ActionListener aukeraOnartu = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int codBush = MetodoakVista.bus_lortu(linea);
				if (rdbtnL1.isSelected()) {
					linea="L1";
					geltokia = MetodoakVista.aukeratuLinea(linea);
					MetodoakVista.getLinea(linea);
				} else if (rdbtnL2.isSelected()) {
					linea="L2";
					geltokia = MetodoakVista.aukeratuLinea(linea);
				} else if (rdbtnL3.isSelected()) {
					linea="L3";
					geltokia = MetodoakVista.aukeratuLinea(linea);
				} else if (rdbtnL4.isSelected()) {
					linea="L4";
					geltokia = MetodoakVista.aukeratuLinea(linea);
				}
				System.out.println(geltokia.get(0));
				btnAurrera.setEnabled(true);
			}
			
		};
		btnOnartu.addActionListener(aukeraOnartu);
		
	}
}