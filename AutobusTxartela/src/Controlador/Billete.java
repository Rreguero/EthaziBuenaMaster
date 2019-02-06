package Controlador;

import java.util.*;

public class Billete {
	private String Cod_billete;
	private String NTrayecto;
	private String Cod_Linea;
	private String Cod_Bus;
	private String Cod_Parada_Inicio;
	private String Cod_Parada_Fin;
	private Date fecha;
	private String hora;
	private String Dni;
	private int Precio;
	
	public Billete (String Cod, String NTrayecto, String Cod_Linea, String Cod_Bus, String Cod_Parada_Inicio, String Cod_Parada_Fin, Date fecha, String hora, String Dni, int Precio) {
		this.Cod_billete = Cod_billete;
		this.Cod_Bus = Cod_Bus;
		this.Cod_Linea = Cod_Linea;
		this.Cod_Parada_Fin = Cod_Parada_Fin;
		this.Cod_Parada_Inicio = Cod_Parada_Inicio;
		this.Dni = Dni;
		this.fecha = fecha;
		this.hora = hora;
		this.NTrayecto = NTrayecto;
		this.Precio = Precio;
		
	}

	public String getCod_billete() {
		return Cod_billete;
	}

	public void setCod_billete(String cod_billete) {
		Cod_billete = cod_billete;
	}

	public String getNTrayecto() {
		return NTrayecto;
	}

	public void setNTrayecto(String nTrayecto) {
		NTrayecto = nTrayecto;
	}

	public String getCod_Linea() {
		return Cod_Linea;
	}

	public void setCod_Linea(String cod_Linea) {
		Cod_Linea = cod_Linea;
	}

	public String getCod_Bus() {
		return Cod_Bus;
	}

	public void setCod_Bus(String cod_Bus) {
		Cod_Bus = cod_Bus;
	}

	public String getCod_Parada_Inicio() {
		return Cod_Parada_Inicio;
	}

	public void setCod_Parada_Inicio(String cod_Parada_Inicio) {
		Cod_Parada_Inicio = cod_Parada_Inicio;
	}

	public String getCod_Parada_Fin() {
		return Cod_Parada_Fin;
	}

	public void setCod_Parada_Fin(String cod_Parada_Fin) {
		Cod_Parada_Fin = cod_Parada_Fin;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}
}
