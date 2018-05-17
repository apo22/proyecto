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

public class PanelEstudiantes extends JPanel implements ActionListener, ListSelectionListener{
	
	public final static String AGREGAR = "Agregar", ELIMINAR = "Eliminar", MOSTRAR_INFORMACION = "Mostrar Información", ORDENAR_NOMBRE = "Ordenar por nombre", ORDENAR_NOTA = "Ordenar por nota", BUSCAR_POR_NOMBRE = "Buscar por nombre";
	
	private JList listaEstudiantes;
	private JScrollPane scroll;
	
	private JButton agregar, eliminar, mostrar, ordenarNombre, ordenarNota, buscar;
	
	private PanelInfoPrograma principal;
	
	public PanelEstudiantes(PanelInfoPrograma principal) {
		this.principal = principal;
		Font font = new Font("Verdana", Font.BOLD, 15);
		TitledBorder border = BorderFactory.createTitledBorder("Estudiantes del Profesor");
		border.setTitleColor(Color.BLUE);
		border.setTitleFont(font);
		setBorder(border);
		setLayout(new BorderLayout());
		
		listaEstudiantes = new JList();
		scroll = new JScrollPane(listaEstudiantes);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		listaEstudiantes.addListSelectionListener(this);
		
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
		
		aux.add(agregar); aux.add(eliminar); aux.add(mostrar);
		
		add(scroll, BorderLayout.CENTER);
		add(aux, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
	}
}

