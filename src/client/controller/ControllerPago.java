package client.controller;

import java.rmi.RemoteException;

import client.remote.ServiceLocator;

public class ControllerPago{

	public ServiceLocator serviceLocator;
	
	public ControllerPago (ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public boolean launchPayment(long accountNumber, double amount) {
		/*
		try {
			return this.serviceLocator.getServicePago().launchPayment(accountNumber, amount);
		} catch (RemoteException e) {
			System.err.println("# Error en el pago: " + e);
			return false;
		}
		*/
		return false;
	}
	
	public void editAccount() {
		/*
		try {
			return this.serviceLocator.getServicePago().editAccount();
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}
	
	public void seeAmount(String month) {
		/*
		try {
			return this.serviceLocator.getServicePago().seeAmount(month);
		} catch (RemoteException e) {
			System.err.println("# Error: " + e);
			return;
		}
		*/
	}


}