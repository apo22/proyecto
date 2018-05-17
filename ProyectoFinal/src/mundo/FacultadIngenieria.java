package mundo;

import java.util.ArrayList;

public class FacultadIngenieria {

	private String decano;
	private int numeroEstudiantes;
	private int numeroProfesores;
	private ArrayList<Programa> programas;
	
	
	public FacultadIngenieria() {
		programas = new ArrayList<Programa>();
		this.decano = "Gonzalo Ulloa";
		iniciarMundo();
	}
	
	public void iniciarMundo() {
		programas.add(new Programa("Ingeniería de Sistemas", "Nohra Villegas", "img/sistemas.jpg"));
		programas.add(new Programa("Ingeniería Industrial", "Efraín Pinto", "img/industrial.jpg"));
		programas.add(new Programa("Diseño Industrial", "Doris Albear", "img/diseñoIndustrial.jpeg"));
		programas.add(new Programa("Diseño de Medios Interactivos", "Javier Aguirre", "img/dmi.jpg"));
		programas.add(new Programa("Ingeniería Telemática", "Lina Quintero", "img/telematica.jpg"));
		programas.add(new Programa("Ingeniería Bioquímica", "Carolina Orozco", "img/bioquimica.jpg"));
	}

	public ArrayList<Programa> getProgramas() {
		return programas;
	}
	
	public Programa buscarPrograma(int numero, String buscado) {
		if(programas.get(numero) != null) {
			if(buscado.equals(programas.get(numero).getNombrePrograma())) {
				return programas.get(numero);
			} else {
				return buscarPrograma(numero + 1, buscado);
			}
		}
		return null;
	}
	
	public String getDecano() {
		return decano;
	}

	public void setDecano(String decano) {
		this.decano = decano;
	}

	public int getNumeroEstudiantes() {
		return numeroEstudiantes;
	}

	public void setNumeroEstudiantes(int numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}

	public int getNumeroProfesores() {
		return numeroProfesores;
	}

	public void setNumeroProfesores(int numeroProfesores) {
		this.numeroProfesores = numeroProfesores;
	}
}
