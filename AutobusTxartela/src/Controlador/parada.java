package Controlador;

public class parada {
	private int Cod_parada;
	private String Nombre;
	private String Calle;
	private double Latitud;
	private double Longitud;
	
	public parada (int Cod_parada, String Nombre, String Calle, double Latitud, double Longitud) {
		this.Calle = Calle;
		this.Cod_parada = Cod_parada;
		this.Latitud = Latitud;
		this.Longitud = Longitud;
		this.Nombre = Nombre;
	}
	
	public parada (String Nombre) {
		this.Nombre = Nombre;
	}

	public int getCod_parada() {
		return Cod_parada;
	}

	public void setCod_parada(int cod_parada) {
		Cod_parada = cod_parada;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCalle() {
		return Calle;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	public double getLatitud() {
		return Latitud;
	}

	public void setLatitud(int latitud) {
		Latitud = latitud;
	}

	public double getLongitud() {
		return Longitud;
	}

	public void setLongitud(int longitud) {
		Longitud = longitud;
	}
}
