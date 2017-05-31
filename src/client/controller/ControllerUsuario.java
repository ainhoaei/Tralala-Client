package client.controller;

import java.rmi.RemoteException;

import server.data.data.Usuario;
import client.remote.ServiceLocator;

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
		//COMPROBAR EL ARRAY DE USUARIOS QUE NOSOTROS TENEMOS LA HACEMOS NOSOTROS O SE PUEDE
		//HACER CON LA BASE DE DATOS MIRANDO SI DEVUELVE TRUE O FALSE?
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
			resultado1 = serviceLocator.getServiceUsuario().checkUserExterno(user, pass);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (resultado == true && resultado1 == true)
		{
			Usuario usser = new Usuario(user,nombre, apellido, tipocuenta); 
			try {
				serviceLocator.getServiceUsuario().registrarse(usser);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resultadofinal = true;
			}
		}
		return resultadofinal;
	}
}