package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.*;

public class SaioaHasi extends JFrame {
	
	private JTextField txtDNI = new JTextField();
	private JTextField txtPasahitza = new JTextField();
	private JLabel lblDNI = new JLabel("DNI:");
	private JLabel lblPasahitza = new JLabel("Pasahitza:");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnIrten = new JButton("IRTEN");
	private String DNI;
	private boolean DNIkonprobatu;
	
	
	/**
	 * Create the panel.
	 */
	public SaioaHasi() {
		getContentPane().setLayout(null);
		this.setSize(635,465);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblDNI.setBounds(139, 106, 108, 87);
		getContentPane().add(lblDNI);
		
		
		txtDNI.setBounds(240, 127, 193, 43);
		getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		
		
		
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblPasahitza.setBounds(112, 246, 193, 103);
		getContentPane().add(lblPasahitza);
		
		
		txtPasahitza.setBounds(292, 275, 186, 43);
		getContentPane().add(txtPasahitza);
		txtPasahitza.setColumns(10);
		
		
		ActionListener alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DNI = txtDNI.getText();
				DNIkonprobatu = Metodoak.nanKomprobaketa(DNI);
				if(DNIkonprobatu==false) {
					MetodoakVista.errorea();
				}else {
					MetodoakVista.hirugarrenera();
					dispose();
				}
			}
		};
		btnAurrera.setEnabled(true);
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.setBounds(524, 386, 99, 33);
		getContentPane().add(btnAurrera);

		
		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 33);
		getContentPane().add(btnAtzera);
		
		
		ActionListener alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.addActionListener(alBIrten);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.setBounds(524, 0, 99, 33);
		getContentPane().add(btnIrten);

	}
}
