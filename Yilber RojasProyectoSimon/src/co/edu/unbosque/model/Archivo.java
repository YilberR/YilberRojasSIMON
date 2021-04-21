package co.edu.unbosque.model;
import co.edu.unbosque.model.persistence.FileX;
import co.edu.unbosque.model.persistence.Propiedades;

public class Archivo {
	private Propiedades prop;
	private FileX archivo;

	public Archivo() {
		prop = new Propiedades();
		archivo = new FileX();

	}
	public String gestionarArchivoCadena() {

		archivo.escribirArchivo( "Nombre del autor: " + prop.getAutor() + "\n" + "Editado por: " + prop.getEchoPor());

		return "leí este dato:\n" + archivo.leerArchivo() + "\n" + "Nombre del autor: " + prop.getAutor() + "\n"
				+ "Editado por: " + prop.getEchoPor();

	}

	public String gestionarPopiedades() {
		prop.escribirPropiedades();
		return "se leyeron estas propiedades: " + "\n" + prop.leerPropiedades();
	}

	public Propiedades getPropp() {
		return prop;
	}

	public void setPropp(Propiedades propp) {
		this.prop = propp;
	}

	public FileX getArchivo() {
		return archivo;
	}

	public void setArchivo(FileX archivo) {
		this.archivo = archivo;
	}
}
