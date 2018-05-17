package interfaz;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelProgramas extends JPanel implements ActionListener{
	
	public final static String INGENIERIA_DE_SISTEMAS = "Ingenier�a de Sistemas";
	public final static String INGENIERIA_INDUSTRIAL = "Ingenier�a Industrial";
	public final static String DISE�O_INDUSTRIAL = "Dise�o Industrial";
	public final static String DISE�O_DE_MEDIOS_INTERACTIVOS = "<html>Dise�o de Medios Interactivos</html>";
	public final static String INGENIERIA_TELEMATICA = "Ingenier�a Telem�tica";
	public final static String INGENIERIA_BIOQUIMICA = "Ingenier�a Bioqu�mica";
	
	private JButton sistemas, ingIndustrial, dise�oIndustrial, dmi, telematica, bioquimica;
	
	private InterfazFacultadIngenieria principal;
	
	public PanelProgramas(InterfazFacultadIngenieria principal) {
		this.principal = principal;
		setLayout(new GridLayout(3, 3));
		
		Font font = new Font("Verdana", Font.BOLD, 37);
		
		ImageIcon img1 = new ImageIcon("img/sistemas.jpg");
		sistemas = new JButton(INGENIERIA_DE_SISTEMAS);
		sistemas.addActionListener(this);
		sistemas.setActionCommand(INGENIERIA_DE_SISTEMAS);
		sistemas.setIcon(img1);
		sistemas.setFont(font);
		
		ImageIcon img2 = new ImageIcon("img/industrial.jpg");
		ingIndustrial = new JButton(INGENIERIA_INDUSTRIAL);
		ingIndustrial.addActionListener(this);
		ingIndustrial.setActionCommand(INGENIERIA_INDUSTRIAL);
		ingIndustrial.setFont(font);
		ingIndustrial.setIcon(img2);
		
		ImageIcon img3 = new ImageIcon("img/dise�oIndustrial.jpeg");
		dise�oIndustrial = new JButton(DISE�O_INDUSTRIAL);
		dise�oIndustrial.addActionListener(this);
		dise�oIndustrial.setActionCommand(DISE�O_INDUSTRIAL);
		dise�oIndustrial.setFont(font);
		dise�oIndustrial.setIcon(img3);
		
		ImageIcon img4 = new ImageIcon("img/dmi.jpg");
		dmi = new JButton(DISE�O_DE_MEDIOS_INTERACTIVOS);
		dmi.addActionListener(this);
		dmi.setActionCommand(DISE�O_DE_MEDIOS_INTERACTIVOS);
		dmi.setFont(font);
		dmi.setIcon(img4);
		
		ImageIcon img5 = new ImageIcon("img/telematica.jpg");
		telematica = new JButton(INGENIERIA_TELEMATICA);
		telematica.addActionListener(this);
		telematica.setActionCommand(INGENIERIA_TELEMATICA);
		telematica.setFont(font);
		telematica.setIcon(img5);
		
		ImageIcon img6 = new ImageIcon("img/bioquimica.jpg");
		bioquimica = new JButton(INGENIERIA_BIOQUIMICA);
		bioquimica.addActionListener(this);
		bioquimica.setActionCommand(INGENIERIA_BIOQUIMICA);
		bioquimica.setFont(font);
		bioquimica.setIcon(img6);
		
		add(sistemas); add(ingIndustrial); add(dise�oIndustrial); add(dmi); add(telematica); add(bioquimica);

	}
	

	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();
		if(comando.equals(INGENIERIA_DE_SISTEMAS)) {
			principal.mostrarDialogoInformacionPrograma("Ingenier�a de Sistemas");
		}else if(comando.equals(INGENIERIA_INDUSTRIAL)) {
			principal.mostrarDialogoInformacionPrograma("Ingenier�a Industrial");
		}else if(comando.equals(DISE�O_INDUSTRIAL)) {
			principal.mostrarDialogoInformacionPrograma("Dise�o Industrial");
		}else if(comando.equals(DISE�O_DE_MEDIOS_INTERACTIVOS)) {
			principal.mostrarDialogoInformacionPrograma("Dise�o de Medios Interactivos");
		}else if(comando.equals(INGENIERIA_TELEMATICA)) {
			principal.mostrarDialogoInformacionPrograma("Ingenier�a Telem�tica");
		}else if(comando.equals(INGENIERIA_BIOQUIMICA)) {
			principal.mostrarDialogoInformacionPrograma("Ingenier�a Bioqu�mica");
		}
	}

}
