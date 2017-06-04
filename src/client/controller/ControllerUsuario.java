package client.controller;

import java.rmi.RemoteException;

import client.remote.ServiceLocator;
import server.data.data.Usuario;

public class ControllerUsuario{
//CON LOS METODOS QUE HAY AQUI ES SUFICIENTE O HAY QUE METER TODOS LOS QUE PUSIMOS
	//EN EL GESTOR DE USUARIOS?

	public ServiceLocator serviceLocator;
	
	public ControllerUsuario(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public boolean login(String user, String password) {
		/*
		try {
			return this.serviceLocator.getServiceUsuario().login(user, password);
		} catch (RemoteException e) {
			System.err.println("# Error during login: " + e);
			return false;
		}
		*/
		return false;
	}
	
	public boolean findUser(String user) {
		/*
		try {
			return this.serviceLocator.getServiceUsuario().findUser(user);
		} catch (RemoteException e) {
			System.err.println("# No se encuentra el usuario: " + e);
			return false;
		}
		*/
		return false;
	}
	
	public void addFriend(String user) {
		/*
		try {
			return this.serviceLocator.getServiceUsuario().addFriend(user);
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}
	
	public void removeFriend(String user) {
		/*
		try {
			return this.serviceLocator.getServiceUsuario().addFriend(user);
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}
	
	public boolean addUser(String user, String pass, String nombre, String apellido, float tipocuenta)
	{
		boolean resultado = false;
		boolean resultado1 =false;
		boolean resultadofinal = false;
		
		try {
			resultado = serviceLocator.getServiceUsuario().checkAddUser(user);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Comprobando el usuario en el servidor externo");
			resultado1 = serviceLocator.getServiceUsuario().checkUserExterno(user, pass);
			//resultadofinal = resultado1;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (resultado == true && resultado1 == true)
		{
			
			try {
				Usuario usser = new Usuario(user,nombre, apellido, tipocuenta); 
				serviceLocator.getServiceUsuario().registrarseBD(usser);
				resultadofinal = true;
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("resultadofinal "+resultadofinal);
		return resultadofinal;
	}
}