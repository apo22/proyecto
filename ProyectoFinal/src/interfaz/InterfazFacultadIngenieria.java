package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import javax.swing.UIManager;

import hilos.HiloBanana;
import hilos.HiloMeme;
import hilos.HiloTitulo;
import mundo.FacultadIngenieria;
import mundo.Programa;

public class InterfazFacultadIngenieria extends JFrame{
	
	private PanelBanner banner;
	private PanelProgramas panelProgramas;
	
	private FacultadIngenieria facultad;
	
	public InterfazFacultadIngenieria() {
		setTitle("Facultad de Ingeniería de la Universidad Icesi");
		setLayout(new BorderLayout());
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(1000, 700));
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.BLACK);
		
		banner = new PanelBanner();
		panelProgramas = new PanelProgramas(this);
		facultad = new FacultadIngenieria();
		
		
		add(banner, BorderLayout.NORTH);
		add(panelProgramas, BorderLayout.CENTER);
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){	
		}
		
		arrancarHilos();

	}
	
	public void mostrarDialogoInformacionPrograma(String programa) {
		DialogoInfoPrograma dip = new DialogoInfoPrograma(this, facultad.buscarPrograma(0, programa));
		dip.setLocationRelativeTo(this);
		dip.setVisible(true);
	}
	
	public void arrancarHilos() {
		banner.repaint();
		HiloBanana hl = new HiloBanana(this);
		hl.start();
		
		HiloTitulo  ht = new HiloTitulo(this);
		ht.start();
		
		HiloMeme  hm = new HiloMeme(this);
		hm.start();
	}
	
	public void refrescarLogo(String ruta) {
		banner.refrescarLogo(ruta);
	}
	
	public void refrescarMeme(String ruta) {
		banner.refrescarMeme(ruta);
	}
	
	public void refrescarTitulo() {
		banner.refrescarTitulo();
	}
	
	public void refrescar() {
		banner.repaint();
	}
	
	
	
	
	public void dispose() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		InterfazFacultadIngenieria ifi = new InterfazFacultadIngenieria();
		ifi.setVisible(true);
	}
}
