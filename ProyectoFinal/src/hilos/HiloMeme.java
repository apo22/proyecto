package hilos;

import interfaz.InterfazFacultadIngenieria;

public class HiloMeme extends Thread{
	
	private InterfazFacultadIngenieria ifi;
	
	public HiloMeme(InterfazFacultadIngenieria ifi) {
		this.ifi = ifi;
	}
	
	public void run() {
		int numero = 1;
		while(true) {
			if(numero == 258) {
				numero = 1;
			}
			ifi.refrescarMeme("img/hilo2/z"+numero+".png");
			numero ++;
			ifi.refrescar();
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
