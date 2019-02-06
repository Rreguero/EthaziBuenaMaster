package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Error extends JFrame {

	private JPanel contentPane;
	private JLabel lblEzDaExistitzen = new JLabel("EZ DA EXISTITZEN");

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Error() {
		getContentPane().setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 321, 233);
		
		
		lblEzDaExistitzen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEzDaExistitzen.setBounds(20, -15, 366, 137);
		getContentPane().add(lblEzDaExistitzen);
		
		
		JLabel lblSaiatuBerriro = new JLabel("SAIATU BERRIRO");
		lblSaiatuBerriro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSaiatuBerriro.setBounds(30, 74, 303, 112);
		getContentPane().add(lblSaiatuBerriro);
	}
}
