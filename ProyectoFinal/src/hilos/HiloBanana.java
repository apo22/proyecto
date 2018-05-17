package hilos;

import interfaz.InterfazFacultadIngenieria;

public class HiloBanana extends Thread{
	
	private InterfazFacultadIngenieria ifi;
	
	public HiloBanana(InterfazFacultadIngenieria ifi) {
		this.ifi = ifi;
	}
	
	public void run() {
		int numero = 1;
		while(true) {
			if(numero == 8) {
				numero = 1;
			}
			ifi.refrescarLogo("img/b"+numero+".png");
			numero ++;
			ifi.refrescar();
			try {
				Thread.sleep(125);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
