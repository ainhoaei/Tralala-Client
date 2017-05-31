package client.gui;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;




import client.controller.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUIRegistrar extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nombreUsuario;
	private JTextField password;
	private ControllerUsuario usuarioC;
	private ControllerCancion cancionC;
	private ControllerPago pagoC;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField tipocuenta;

	public GUIRegistrar(ControllerUsuario usuarioC, ControllerCancion cancionC, ControllerPago pagoC){
		
		this.usuarioC = usuarioC;
		this.cancionC = cancionC;
		this.pagoC = pagoC;
		
		getContentPane().setLayout(null);
		getContentPane().setBounds(100, 100, 450, 300);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 29, 46, 14);
		getContentPane().add(lblUsuario);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(10, 54, 86, 20);
		getContentPane().add(nombreUsuario);
		nombreUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 85, 46, 14);
		getContentPane().add(lblPassword);
		
		password = new JTextField();
		password.setBounds(10, 110, 86, 20);
		getContentPane().add(password);
		password.setColumns(10);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setBounds(100, 208, 89, 23);
		getContentPane().add(btnRegistro);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(143, 29, 46, 14);
		getContentPane().add(lblNombre);
		
		nombre = new JTextField();
		nombre.setBounds(143, 54, 86, 20);
		getContentPane().add(nombre);
		nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(143, 85, 46, 14);
		getContentPane().add(lblApellido);
		
		apellido = new JTextField();
		apellido.setBounds(143, 110, 86, 20);
		getContentPane().add(apellido);
		apellido.setColumns(10);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de cuenta");
		lblTipoDeCuenta.setBounds(266, 29, 79, 14);
		getContentPane().add(lblTipoDeCuenta);
		
		tipocuenta = new JTextField();
		tipocuenta.setBounds(266, 54, 86, 20);
		getContentPane().add(tipocuenta);
		tipocuenta.setColumns(10);
		
		btnRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//setVisible(false);
				
				String user = nombreUsuario.getText();
				String pass = password.getText(); 
				String nombrepasado = nombre.getText();
				String apellidopasado = apellido.getText();
				float cuentapasada = Float.parseFloat(tipocuenta.getText());
				boolean cortafuegos;
				 cortafuegos = usuarioC.addUser(user, pass, nombrepasado, apellidopasado, cuentapasada );
				if(cortafuegos == true){
					System.out.println("Registro exitoso");
					setVisible(false);
				}else{
					System.out.println("Registro fallido. Vuelva a introducir los datos");
				}
				
			}
		});
		
	}
}