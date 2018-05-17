package interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Jorge Antonio Morales Flórez - Kevin Zarama Luna
 * @version 1.0
 * Clase que representa el titulo y el logo de la facultad
 *
 */
public class PanelBanner extends JPanel {
	
	private ImageIcon logo, fondo, meme;
	private Color color;
	private JLabel labTitulo;

	public PanelBanner() {
		setPreferredSize(new Dimension(200, 180));
		fondo = new ImageIcon("img/fondo.jpg");
		labTitulo = new JLabel("Facultad de Ingeniería");
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
		g.drawImage(logo.getImage(), 50, 30, 100, 100, this);
		g.drawImage(meme.getImage(), 1200, 30, 100, 100, this);
		Font font = new Font("Verdana", Font.BOLD, 70);
		g.setColor(color);
		g.setFont(font);
		g.drawString(labTitulo.getText(), 225, 110);
	}
	
	public Color darColor(){
		Color[] colores= new Color[10];
		colores[0]= new Color(7,169,44);
		colores[1]= new Color(53,175,1);
		colores[2]= new Color(117,7,169);
		colores[3]= new Color(240,0,6);
		colores[4]= new Color(28,124,213);
		colores[5]= new Color(227,168,13);
		colores[6]= new Color(64,176,137);
		colores[7]= new Color(166,74,106);
		colores[8]= new Color(4,171,189);
		colores[9]= new Color(175,39,39);
		
		int numero = (int) (Math.random() * 9);
	
		return colores[numero];
	}
	
	public void refrescarLogo(String ruta) {
		logo = new ImageIcon(ruta);
	}
	
	public void refrescarMeme(String ruta) {
		meme = new ImageIcon(ruta);
	}
	
	public void refrescarTitulo() {
		color=darColor();
		labTitulo.setForeground(color);
		repaint(); 
	}
}