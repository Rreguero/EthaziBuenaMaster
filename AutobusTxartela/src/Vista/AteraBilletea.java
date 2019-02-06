package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controlador.MetodoakVista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AteraBilletea extends JFrame {
	
	private JLabel lblEskerrik = new JLabel("ESKERRIK");
	private JLabel lblAsko = new JLabel("ASKO");
	private JButton btnAteraBilletea = new JButton("Atera billetea");

	/**
	 * Create the panel.
	 */
	public AteraBilletea() {
		setLayout(null);
		this.setSize(478,300);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 635, 455);
		
		
		lblEskerrik.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblEskerrik.setHorizontalAlignment(SwingConstants.CENTER);
		lblEskerrik.setBounds(192, 57, 208, 84);
		add(lblEskerrik);
		
		
		lblAsko.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblAsko.setBounds(241, 152, 134, 68);
		add(lblAsko);
		
		ActionListener alBAzkena = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodoakVista.azkenera();
				dispose();
			}
		};
		btnAteraBilletea.addActionListener(alBAzkena);
		btnAteraBilletea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAteraBilletea.setBounds(202, 269, 198, 39);
		add(btnAteraBilletea);

	}
}
