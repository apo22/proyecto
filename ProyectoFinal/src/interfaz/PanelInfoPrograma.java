package interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import mundo.Programa;

public class PanelInfoPrograma extends JPanel{
	
	private PanelMaterias panelMaterias;
	private PanelProfesores panelProfesores;
	private PanelEstudiantes panelEstudiantes;
	
	public PanelInfoPrograma() {
		setLayout(new GridLayout(1, 3));
		TitledBorder border = BorderFactory.createTitledBorder("Información del Programa");
		border.setTitleColor(Color.RED);
		setBorder(border);
		
		panelMaterias = new PanelMaterias(this);
		panelProfesores = new PanelProfesores(this);
		panelEstudiantes = new PanelEstudiantes(this);
		
		add(panelMaterias);
		add(panelProfesores);
		add(panelEstudiantes);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image fondo = new ImageIcon("img/fondo.jpg").getImage();
	}
	
}
