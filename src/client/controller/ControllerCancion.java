package client.controller;

import java.rmi.RemoteException;

import client.remote.ServiceLocator;


public class ControllerCancion{
//LOS METODOS DE addFav y removeFav en el TW4.5.6 LAS PUSIMOS EN EL GESTOR DE USUARIO,
	//HAY QUE PONERLAS EN EL CONTROLLER CANCION O EN EL CONTROLLER USUARIO?
	@SuppressWarnings("unused")
	public ServiceLocator serviceLocator;
	
	public ControllerCancion(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	//faltan métodos
	
	public void addFav(int cancion) {
		/*
		try {
			return this.serviceLocator.getServiceCancion().addFav(cancion);
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}
	
	public void removeFav(int cancion) {
		/*
		try {
			return this.serviceLocator.getServiceCancion().removeFav(cancion);
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}
	
	public void playTrack(int cancion) {
		try {
			serviceLocator.getServiceCancion().playTrack(cancion);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void playNext(int cancion) {
		/*
		try {
			return this.serviceLocator.getServiceCancion().playNext(cancion);
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}
	
	public void playPrevious(int cancion)
	{
		/*
		try {
			return this.serviceLocator.getServiceCancion().playPrevious(cancion);
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}
	
	public void rewind() {
		/*
		try {
			return this.serviceLocator.getServiceCancion().rewind();
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}

}