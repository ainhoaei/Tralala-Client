package client.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import server.remote.ICancionF;
import server.remote.IPagoF;
import server.remote.IUsuarioF;

public class ServiceLocator{
	
	private ICancionF cancion;
	private IUsuarioF usuario;
	private IPagoF pago;
	private Object object;
	
	public ServiceLocator() {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
	}

	public void setServiceCancion(String ip, String port, String serverName) {
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.cancion = (ICancionF) java.rmi.Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote facade: " + ex);
		}		
		
	}
	
	public void setServiceUsuario(String ip, String port, String serverName) {
		
		
		//System.out.println("usuario interfaz: "+ URL);
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.usuario = (IUsuarioF) java.rmi.Naming.lookup(URL);
			//System.out.println("Clase que nos devuelve: " + Naming.lookup(URL).getClass().toString());
			
			
		} catch (Exception ex) {
			System.err.println("# Error locating remote facade: " + ex);
		}		
	}
	
	public void setServicePago(String ip, String port, String serverName) {
		
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.pago = (IPagoF) java.rmi.Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote facade: " + ex);
		}		
	}

	public ICancionF getServiceCancion() {
		return this.cancion;
	}
	public IUsuarioF getServiceUsuario() {
		return this.usuario;
	}
	public IPagoF getServicePago() {
		return this.pago;
	}
}