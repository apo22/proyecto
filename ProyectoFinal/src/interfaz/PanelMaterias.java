package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PanelMaterias extends JPanel implements ActionListener, ListSelectionListener{
	
	public final static String AGREGAR = "Agregar", ELIMINAR = "Eliminar", MOSTRAR_INFORMACION = "Mostrar Información", ORDENAR_NOMBRE = "Ordenar por nombre", ORDENAR_CREDITOS = "Ordenar por creditos", BUSCAR_POR_NOMBRE = "Buscar por nombre";
	
	private JList listaMaterias;
	private JScrollPane scroll;
	
	private JButton agregar, eliminar, mostrar, ordenarNombre, ordenarCreditos, buscar;
	
	private PanelInfoPrograma principal;
	
	public PanelMaterias(PanelInfoPrograma principal) {
		this.principal = principal;
		Font font = new Font("Verdana", Font.BOLD, 15);
		TitledBorder border = BorderFactory.createTitledBorder("Materias del Programa");
		border.setTitleColor(Color.BLUE);
		border.setTitleFont(font);
		setBorder(border);
		setLayout(new BorderLayout());
		
		listaMaterias = new JList();
		scroll = new JScrollPane(listaMaterias);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		listaMaterias.addListSelectionListener(this);
		
		JPanel aux = new JPanel();
		aux.setLayout(new GridLayout(1, 3));
		
		agregar = new JButton(AGREGAR);
		agregar.addActionListener(this);
		agregar.setActionCommand(AGREGAR);
		
		eliminar = new JButton(ELIMINAR);
		eliminar.addActionListener(this);
		eliminar.setActionCommand(ELIMINAR);
		
		mostrar = new JButton(MOSTRAR_INFORMACION);
		mostrar.addActionListener(this);
		mostrar.setActionCommand(MOSTRAR_INFORMACION);
		
		ordenarNombre = new JButton(ORDENAR_NOMBRE);
		ordenarNombre.addActionListener(this);
		ordenarNombre.setActionCommand(ORDENAR_NOMBRE);
		
		ordenarCreditos = new JButton(ORDENAR_CREDITOS);
		ordenarCreditos.addActionListener(this);
		ordenarCreditos.setActionCommand(ORDENAR_CREDITOS);
		
		buscar = new JButton(BUSCAR_POR_NOMBRE);
		buscar.addActionListener(this);
		buscar.setActionCommand(BUSCAR_POR_NOMBRE);
		
		aux.add(agregar); aux.add(eliminar); aux.add(mostrar);
		
		add(scroll, BorderLayout.CENTER);
		add(aux, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
