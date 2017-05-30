package client;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import client.controller.ControllerCancion;
import client.controller.ControllerPago;
import client.controller.ControllerUsuario;
import client.gui.GUIMenu;
import client.gui.GUIReproducir;
import client.remote.ServiceLocator;

public class MainPrograma {

public static void main(String[] args) {	
		

		ServiceLocator serviceLocator = new ServiceLocator();
		serviceLocator.setServiceUsuario(args[0], args[1],  args[2]);
		ControllerUsuario irc = new ControllerUsuario(serviceLocator);
		
		serviceLocator.setServicePago(args[0], args[1], args[4]);
		ControllerPago p = new ControllerPago(serviceLocator);
		
		serviceLocator.setServiceCancion(args[0], args[1], args[3]);
		ControllerCancion rlc = new ControllerCancion(serviceLocator);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		
		GUIMenu mgui = new GUIMenu(irc, rlc, p);
		mgui.setVisible(true);
		
		GUIReproducir rgui = new GUIReproducir(irc, rlc, p);
		rgui.setVisible(true);
		
		
	}

}
