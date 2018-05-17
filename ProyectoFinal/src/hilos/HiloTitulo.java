package hilos;

import interfaz.InterfazFacultadIngenieria;

public class HiloTitulo extends Thread{
	
	private InterfazFacultadIngenieria ifi;
	
	public HiloTitulo(InterfazFacultadIngenieria ifi) {
		this.ifi = ifi;
	}
	
	public void run() {
		while(true) {
			ifi.refrescarTitulo();
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
