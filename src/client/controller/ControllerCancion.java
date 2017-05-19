package client.controller;

import java.rmi.RemoteException;

import client.remote.ServiceLocator;

public class ControllerCancion{


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
		/*
		try {
			return this.serviceLocator.getServiceCancion().playTrack(cancion);
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
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