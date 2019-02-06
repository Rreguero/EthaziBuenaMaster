package Vista;
import Controlador.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Lehena extends JFrame {
	
	private JButton btnSaioaHasi = new JButton("SAIOA HASI");
	private JLabel lblOngiEtorri = new JLabel("ONGI ETORRI");

	/**
	 * Create the panel.
	 */
	public Lehena() {
		setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 635, 455);
		
		btnSaioaHasi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		
		ActionListener alBSaioaHasi = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MetodoakVista.bigarrenera();
				
			}
		};
		btnSaioaHasi.addActionListener(alBSaioaHasi);
		btnSaioaHasi.setBounds(204, 214, 206, 84);
		add(btnSaioaHasi);
		
		
		lblOngiEtorri.setHorizontalAlignment(SwingConstants.CENTER);
		lblOngiEtorri.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblOngiEtorri.setBounds(103, 34, 391, 195);
		add(lblOngiEtorri);

	}

}
