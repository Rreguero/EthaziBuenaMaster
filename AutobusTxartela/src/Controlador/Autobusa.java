package Controlador;

public class Autobusa {
	
	private String Cod_bus;
	private String N_plazas;
	private double Consumo_km;
	private String Color;
	
	public Autobusa(String Cod_bus, String N_plazas, double kontsumo, String Color) {
		this.Cod_bus = Cod_bus;
		this.N_plazas = N_plazas;
		this.Consumo_km = kontsumo;
		this.Color = Color;
	}
	
	public Autobusa(double Consumo_km) {
		this.Consumo_km = Consumo_km;
	}

	public String getCod_bus() {
		return Cod_bus;
	}

	public void setCod_bus(String cod_bus) {
		Cod_bus = cod_bus;
	}

	public String getN_plazas() {
		return N_plazas;
	}

	public void setN_plazas(String n_plazas) {
		N_plazas = n_plazas;
	}

	public double getConsumo_km() {
		return Consumo_km;
	}

	public void setConsumo_km(double consumo_km) {
		Consumo_km = consumo_km;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	
}
