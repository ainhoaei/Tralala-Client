package client.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.controller.ControllerCancion;
import client.controller.ControllerPago;
import client.controller.ControllerUsuario;


public class GUIReproducir extends JFrame{

	private JPanel contentPane;
	private javax.swing.JTextField acronym;
	private javax.swing.JTextField description;
	
	private ControllerUsuario usuarioC;
	private ControllerCancion cancionC;
	private ControllerPago pagoC;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUIReproducir (ControllerUsuario usuarioC, ControllerCancion cancionC, ControllerPago pagoC){
	
		this.usuarioC = usuarioC;
		this.cancionC = cancionC;
		this.pagoC = pagoC;
		
		setTitle("TRALALA: Reproduccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 408, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblbienvenidoATralala = new JLabel("Tralala: Sesion iniciada");
		lblbienvenidoATralala.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblbienvenidoATralala.setBounds(125, 0, 179, 16);
		panel.add(lblbienvenidoATralala);
		
		JButton btnReproducirCancion = new JButton("REPRODUCIR CANCION");
		btnReproducirCancion.setBounds(100, 100, 200, 50);
		btnReproducirCancion.setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		panel.add(btnReproducirCancion);
		
		btnReproducirCancion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonReproducirCancionPerformed(evt);
			}
		});
	}
	
	private void buttonReproducirCancionPerformed(ActionEvent evt) {
		// Calling the Controller
		JOptionPane.showMessageDialog(null, "La cancion se reproducir� en la consola");
		cancionC.playTrack(2);
		
		
	
	}

}
