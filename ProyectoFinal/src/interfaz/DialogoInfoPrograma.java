package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mundo.Programa;

public class DialogoInfoPrograma extends JDialog{
	
	private InterfazFacultadIngenieria principal;
	private PanelInfoPrograma panelInfoPrograma;
	
	private JLabel banner;
	private ImageIcon img;
	
	public DialogoInfoPrograma(InterfazFacultadIngenieria principal, Programa p) {
		super(principal, true);
		this.principal = principal;
		setSize(1000,650);
		setLayout(new BorderLayout());
		setTitle("");
		
		panelInfoPrograma = new PanelInfoPrograma();
		
		JPanel auxB = new JPanel();
		auxB.setPreferredSize(new Dimension(0,150));
		banner = new JLabel();		
		img = new ImageIcon(p.getRuta());
		banner.setIcon(img);
		auxB.add(banner);
		add(auxB, BorderLayout.NORTH);
		add(panelInfoPrograma, BorderLayout.CENTER);
		
	}
	
}