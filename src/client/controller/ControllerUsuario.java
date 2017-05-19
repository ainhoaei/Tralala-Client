package client.controller;

import java.rmi.RemoteException;

import client.remote.ServiceLocator;

public class ControllerUsuario{


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




}