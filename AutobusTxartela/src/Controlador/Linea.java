package Controlador;

import java.sql.ResultSet;
import java.util.ArrayList;

import Modelo.Kontsulta;

public class Linea {

	private String Cod_linea;
	private String Nombre;

	public Linea(String Cod_linea, String Nombre) {
		this.Cod_linea = Cod_linea;
		this.Nombre = Nombre;
	}

	public Linea(String Cod_linea) {
		this.Cod_linea = Cod_linea;
	}

	public void rellenar(ArrayList<String> LineaArray, String Cod_linea, String Nombre) {
		for (int i = 0; i < LineaArray.size() - 1; i++) {
			Cod_linea = LineaArray.get(0);
			Nombre = LineaArray.get(1);
		}
		Kontsulta.muestraLinea(Cod_linea, Nombre);
	}

	public String getCod_Linea() {
		return Cod_linea;
	}

	public void setCod_Linea(String Cod_Linea) {
		Cod_Linea = Cod_Linea;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		Nombre = Nombre;
	}
}
