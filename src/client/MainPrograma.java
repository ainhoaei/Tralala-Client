package client;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import client.controller.ControllerCancion;
import client.controller.ControllerUsuario;
import client.gui.GUIMenu;
import client.remote.ServiceLocator;

public class MainPrograma {

public static void main(String[] args) {	
		
		boolean reproduciendo = false;
		
		ServiceLocator serviceLocator = new ServiceLocator();
		//serviceLocator.setServiceCancion(args[0], args[1], args[2]);
		serviceLocator.setServiceCancion("127.0.0.1", "1099", "Tralala");
		
		ControllerUsuario irc = new ControllerUsuario(serviceLocator);
		ControllerCancion rlc = new ControllerCancion(serviceLocator);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		
		GUIMenu mgui = new GUIMenu(irc, rlc);
		mgui.setVisible(true);
		
		
	}

}
