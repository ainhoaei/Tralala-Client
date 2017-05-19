package client.remote;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import server.remote.ICancionF;
import server.remote.IPagoF;
import server.remote.IUsuarioF;




public class ServiceLocator {
	
	private ICancionF cancion;
	private IUsuarioF usuario;
	private IPagoF pago;

	public void setServiceCancion(String ip, String port, String serverName) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.cancion = (ICancionF) Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote façade: " + ex);
		}		
	}
	
	public void setServiceUsuario(String ip, String port, String serverName) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.usuario = (IUsuarioF) Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote façade: " + ex);
		}		
	}
	
	public void setServicePago(String ip, String port, String serverName) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serverName;
			this.pago = (IPagoF) Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote façade: " + ex);
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