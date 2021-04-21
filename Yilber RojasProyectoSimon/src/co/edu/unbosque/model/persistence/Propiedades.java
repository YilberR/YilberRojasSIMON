package co.edu.unbosque.model.persistence;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import co.edu.unbosque.model.Empresa;
import co.edu.unbosque.model.Nombre;

public class Propiedades extends Empresa implements Nombre {

	public Properties prop;
	private String archivoprop = "c:\\data\\prop.Properties";
	private int arreglo;
	private String autor;
	private String echoPor;

	public Propiedades() {
		prop = new Properties();
	}

	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreProyecto", name());
			prop.setProperty("nombreArchivo", "archivo.properties");
			prop.setProperty("nombreCodigoFuente", "Popiedades.Java");
			prop.setProperty("numeroArreglo", "4");
			prop.setProperty("nombreAutor", "Yilber Rojas");
			prop.setProperty("empresa", empresa());
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;

	}
	

	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop)); // leer archivos de las propiedades

			linea += "nombre del Proyecto: " + prop.getProperty("nombreProyecto") + "\n";//////////////
			linea += "nombre del Archivo: " + prop.getProperty("nombreArchivo") + "\n";////////////////////// leer cada
																						////////////////////// valor de
																						////////////////////// propiedad
			linea += "nombre de la clase Java: " + prop.getProperty("nombreCodigoFuente") + "\n";///////
			linea += "número de arreglo: " + prop.getProperty("numeroArreglo") + "\n";
			linea += "nombre autor: " + prop.getProperty("nombreAutor") + "\n";
			linea += "empresa: " + prop.getProperty("empresa");

			String e = prop.getProperty("numeroArreglo");
			arreglo = Integer.parseInt(e);

			String t = prop.getProperty("nombreAutor");
			autor = t;

			String y = prop.getProperty("editor");
			echoPor = y;
		} catch (IOException ex) {
			return null;
		}
		return linea;
	}
	@Override
	public String name() {
		return "Proyecto SIMON";
	}

	@Override
	public String empresa() {
		return "ProgStars";
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}

	public int getArreglo() {
		return arreglo;
	}

	public void setArreglo(int arreglo) {
		this.arreglo = arreglo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEchoPor() {
		return echoPor;
	}

	public void setEchoPor(String echoPor) {
		this.echoPor = echoPor;
	}	
}
