package client.gui;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.controller.*;

public class GUIMenu extends JFrame {
	
	private ControllerUsuario usuarioC;
	private ControllerCancion cancionC;
	private ControllerPago pagoC;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	public GUIMenu(ControllerUsuario usuarioC, ControllerCancion cancionC, ControllerPago pagoC) {
		
		this.usuarioC = usuarioC;
		this.cancionC = cancionC;
		this.pagoC = pagoC;
		
		setTitle("TRALALA");
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
		
		//Color JFrame
       // this.getContentPane().setBackground(Color.orange);

        //Color JPanel
        //panel.setBackground(Color.orange);
        
		JLabel lblbienvenidoATralala = new JLabel("¡Aplicacion Tralala!");
		lblbienvenidoATralala.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		lblbienvenidoATralala.setBounds(125, 0, 179, 16);
		panel.add(lblbienvenidoATralala);
		
		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setBounds(100, 100, 200, 50);
		btnRegistrarse.setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		panel.add(btnRegistrarse);
		
		btnRegistrarse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				GUIRegistrar fReg = new GUIRegistrar(usuarioC, cancionC, pagoC);
				fReg.setVisible(true);
			}
		});
		
		
	}

}
