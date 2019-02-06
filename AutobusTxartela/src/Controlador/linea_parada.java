package Controlador;

public class linea_parada {
	private String Cod_linea;
	private int Cod_parada;
	
	public linea_parada (String Cod_linea, int Cod_parada) {
		this.Cod_linea = Cod_linea;
		this.Cod_parada = Cod_parada;
	}

	public String getCod_linea() {
		return Cod_linea;
	}

	public void setCod_linea(String cod_linea) {
		Cod_linea = cod_linea;
	}

	public int getCod_parada() {
		return Cod_parada;
	}

	public void setCod_parada(int cod_parada) {
		Cod_parada = cod_parada;
	}
}
