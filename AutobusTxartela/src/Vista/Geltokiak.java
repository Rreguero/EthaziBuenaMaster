package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import Controlador.MetodoakVista;
import Controlador.parada;
import Modelo.Kontsulta;
import javax.swing.SwingConstants;

public class Geltokiak extends JFrame {
	private JTextField txtLinea = new JTextField();
	private JLabel lblAukeratuDuzunLinea = new JLabel("Aukeratu duzun linea");
	private JLabel lblGeltokiakAukeratu = new JLabel("Geltokiak aukeratu");
	private JLabel lblHasiera = new JLabel("Hasiera");
	private JLabel lblHelmuga = new JLabel("Helmuga");
	private JLabel lblData = new JLabel("Data");
	private JButton btnAurrera = new JButton("Aurrera");
	private JButton btnIrten = new JButton("IRTEN");
	private JButton btnAtzera = new JButton("Atzera");
	private JComboBox comboBoxHasiera = new JComboBox();
	private final JComboBox comboBoxHelmuga = new JComboBox();
	private final JSpinner spinner = new JSpinner();
	private String lineaIzena="";
	
	

	private JTextField textField;

	/**
	 * @wbp.nonvisual location=91,269
	 */

	/**
	 * Create the panel.
	 */

	
	
		


	public Geltokiak(ArrayList geltoki, String linea) {


		getContentPane().setLayout(null);
		this.setSize(478, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);

		lblAukeratuDuzunLinea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAukeratuDuzunLinea.setBounds(162, 46, 245, 23);
		getContentPane().add(lblAukeratuDuzunLinea);
		txtLinea.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtLinea.setBackground(Color.WHITE);
		txtLinea.setEditable(false);
		lineaIzena = MetodoakVista.lineaIzenaAukeratu(linea);
		txtLinea.setText(lineaIzena);

		txtLinea.setBounds(212, 78, 138, 46);
		getContentPane().add(txtLinea);
		txtLinea.setColumns(10);

		lblGeltokiakAukeratu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGeltokiakAukeratu.setBounds(162, 138, 260, 53);
		getContentPane().add(lblGeltokiakAukeratu);

		lblHasiera.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHasiera.setBounds(47, 227, 111, 33);
		getContentPane().add(lblHasiera);

		lblHelmuga.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHelmuga.setBounds(269, 226, 118, 35);
		getContentPane().add(lblHelmuga);

		lblData.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblData.setBounds(482, 232, 89, 23);
		getContentPane().add(lblData);

		
		
//		comboBoxHasiera.setFont(new Font("Tahoma", Font.PLAIN, 30));
//		comboBoxHasiera.setBounds(73, 346, 89, 20);
//		comboBoxHasiera.addItem(geltoki);
//		for (int n = 0; n < geltoki.size(); n++) {
//			System.out.println(geltoki.get(n));

		comboBoxHasiera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxHasiera.setBounds(10, 271, 184, 53);
		for (int n = 0; n < geltoki.size(); n++) {
			comboBoxHasiera.addItem(geltoki.get(n));

		}
		getContentPane().add(comboBoxHasiera);

		comboBoxHelmuga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxHelmuga.setBounds(238, 271, 184, 53);
		for (int n = 0; n < geltoki.size(); n++) {
			comboBoxHelmuga.addItem(geltoki.get(n));
		}
		getContentPane().add(comboBoxHelmuga);

		ActionListener alBAurrera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bostgarrenera(geltoki, linea);

				for (int n = 0; n < geltoki.size(); n++) {
					if (comboBoxHasiera.getSelectedItem().equals(geltoki.get(n))) {
						System.out.println("Pillado Hasiera");
					}
				}
				for (int n = 0; n < geltoki.size(); n++) {
					if (comboBoxHelmuga.getSelectedItem().equals(geltoki.get(n))) {
						System.out.println("Pillado Helmuga");
					}
				}

				dispose();
			}
		};
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setBounds(524, 386, 99, 33);
		getContentPane().add(btnAurrera);

		ActionListener alBIrten = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		};
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIrten.addActionListener(alBIrten);
		btnIrten.setBounds(524, 0, 99, 33);
		getContentPane().add(btnIrten);

		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.hirugarrenera();
				dispose();
			}
		};
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setBounds(0, 0, 89, 33);
		getContentPane().add(btnAtzera);
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 20));

		spinner.setModel(new SpinnerDateModel(new Date(1546297200000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(450, 284, 144, 23);

		getContentPane().add(spinner);
	}
}
