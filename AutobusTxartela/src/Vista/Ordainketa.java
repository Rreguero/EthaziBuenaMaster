package Vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.Metodoak;
import Controlador.MetodoakVista;

public class Ordainketa extends JFrame {

	private JPanel contentPane;
	private JTextField textDiruTot = new JTextField(); ;
	private JTextField textOrdainketa = new JTextField();;
	private JButton btnIrten = new JButton("IRTEN\r\n");
	private JLabel lblErositakoa = new JLabel("DIRU TOTALA");
	private JLabel lblBueltak = new JLabel("BUELTAK");
	private JButton btnErosi = new JButton("EROSI");
	private JLabel lblDaramazun = new JLabel("DARAMAZUN DIRUA");
	private JLabel lblSartuDirua = new JLabel("SARTU DIRUA");
	static JList listBueltak = new JList();
	private DefaultListModel list = new DefaultListModel();
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton button0 = new JButton("0");
	private JButton buttonPunto = new JButton(".");
	private JButton btnEzabatu = new JButton("EZABATU");
	private JButton btnAurrera = new JButton("Aurrera");
	private String[] bueltak;
	private double DoubleTextDiruTot;
	private double DoubleTextOrdainketa;
	private String listMezua;
	private String kenketaMetodo;
	private String TextDiruTot;
	private JButton btnAtzera = new JButton("Atzera");
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */

	public Ordainketa(ArrayList geltoki, String linea) {

		getContentPane().setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MetodoakVista.bueltatuLehena();
				dispose();
			}
		});
		btnIrten.setBounds(514, 0, 109, 30);
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(btnIrten);
		
		
		lblErositakoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblErositakoa.setBounds(22, 45, 149, 30);
		getContentPane().add(lblErositakoa);
		textDiruTot.setBackground(Color.WHITE);
		textDiruTot.setEditable(false);
				DefaultListModel ordaintzekoa = new DefaultListModel();
				ordaintzekoa.addElement(Metodoak.kontTotala+"€");
				listBueltak.setModel(ordaintzekoa);
		
		textDiruTot.setBounds(22, 69, 270, 38);
		getContentPane().add(textDiruTot);
		Metodoak.bezKalkulatu();
		TextDiruTot = Double.toString(Metodoak.kontTotala);
		textDiruTot.setColumns(10);
		textDiruTot.setText(TextDiruTot);
		
		
		lblBueltak.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBueltak.setBounds(22, 118, 149, 21);
		getContentPane().add(lblBueltak);
		
		
		lblDaramazun.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDaramazun.setBounds(427, 41, 177, 38);
		getContentPane().add(lblDaramazun);
		
		
		textOrdainketa.setBackground(Color.WHITE);
		textOrdainketa.setEditable(false);
		textOrdainketa.setBounds(427, 69, 187, 38);
		getContentPane().add(textOrdainketa);
		textOrdainketa.setColumns(10);
		
		
		
		lblSartuDirua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSartuDirua.setBounds(427, 118, 111, 22);
		getContentPane().add(lblSartuDirua);
		
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=1;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button1.setBounds(427, 142, 50, 51);
		getContentPane().add(button1);
		
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=2;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button2.setBounds(489, 142, 49, 51);
		getContentPane().add(button2);
		
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=3;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button3.setBounds(548, 142, 50, 51);
		getContentPane().add(button3);
		
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=4;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button4.setBounds(427, 204, 50, 51);
		getContentPane().add(button4);
		
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=5;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button5.setBounds(488, 204, 50, 51);
		getContentPane().add(button5);
		
		
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=6;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button6.setBounds(548, 204, 50, 51);
		getContentPane().add(button6);
		
		
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=7;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button7.setBounds(427, 266, 50, 51);
		getContentPane().add(button7);
		
		
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=8;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button8.setBounds(489, 266, 50, 51);
		getContentPane().add(button8);
		
		
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=9;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button9.setBounds(548, 266, 50, 51);
		getContentPane().add(button9);
		
		
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=0;
				textOrdainketa.setText(textOrdainketa.getText() + num);
				btnErosi.setEnabled(true);
			}
		});
		button0.setBounds(489, 328, 120, 38);
		getContentPane().add(button0);
		
		ActionListener alBPunto = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String punto=".";
				textOrdainketa.setText(textOrdainketa.getText() + punto);
				
			}
		};
		buttonPunto.addActionListener(alBPunto);
		buttonPunto.setBounds(427, 328, 50, 38);
		getContentPane().add(buttonPunto);
		
		ActionListener ezabatu = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textOrdainketa.setText("");
				btnErosi.setEnabled(false);
			}
		};
		btnEzabatu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEzabatu.setBounds(427, 373, 91, 38);
		getContentPane().add(btnEzabatu);
		
		btnEzabatu.addActionListener(ezabatu);
		
		listBueltak.setModel(list);
		
		ActionListener alBErosi = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.clear();
//				DoubleTextDiruTot = Double.parseDouble(textDiruTot.getText());
//				DoubleTextOrdainketa = Double.parseDouble(textOrdainketa.getText());
				bueltak = Controlador.Metodoak.diruarenBueltak(textDiruTot.getText(), textOrdainketa.getText());
				
			for(int i=0;i<bueltak.length;i++) {
				list.addElement(bueltak[i]);
			}
			if (bueltak[0]=="0") {
				listMezua = "Ez daude bueltak";
				list.addElement(listMezua);
				lblErositakoa.setText("FALTA DEN DIRUA");
			}
			if (bueltak[0]=="") {
				kenketaMetodo = Controlador.Metodoak.kenketa(textDiruTot.getText(), textOrdainketa.getText());
				textOrdainketa.setText("");
				listMezua = "Dirua falta da";
				list.addElement(listMezua);
				textDiruTot.setText(kenketaMetodo);
				lblErositakoa.setText("FALTA DEN DIRUA");
			}
			if (bueltak[0]!="") {
				textDiruTot.setText("0");
			}
			btnAurrera.setEnabled(true);
			btnErosi.setEnabled(false);
			btnEzabatu.setEnabled(false);
			}
			};
			btnErosi.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnErosi.addActionListener(alBErosi);
			
		btnErosi.setBounds(329, 266, 91, 145);
		getContentPane().add(btnErosi);
		btnErosi.setEnabled(false);
		
		
		listBueltak.setBounds(22, 150, 270, 261);
		
		getContentPane().add(listBueltak);
		
		ActionListener alBAurrera = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				MetodoakVista.seigarrenera();
				dispose();
			}
		};
		btnAurrera.setEnabled(false);
		btnAurrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAurrera.addActionListener(alBAurrera);
		btnAurrera.setBounds(518, 373, 91, 38);
		getContentPane().add(btnAurrera);
		
		ActionListener alBAtzera = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MetodoakVista.laugarrenera(geltoki, linea);

				dispose();
			}
		};
		btnAtzera.addActionListener(alBAtzera);
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAtzera.setBounds(0, 0, 89, 30);
		getContentPane().add(btnAtzera);
		
		
		
	}
}
