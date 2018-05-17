package mundo;

public class Programa {
	
	private String ruta;
	
	private String nombrePrograma;
	private String director;
	private Materia materiaRaiz;
	
	private int numeroMaterias;
	
	public Programa(String nombrePrograma, String director, String rut) {
		this.nombrePrograma = nombrePrograma;
		this.director = director;
		this.numeroMaterias = 0;
		this.ruta = rut;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getNombrePrograma() {
		return nombrePrograma;
	}

	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}
	
	
	
}