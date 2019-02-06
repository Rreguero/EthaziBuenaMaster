package Controlador;

public class poblacion_parada {
	private int Cod_parada;
	private int Cod_postal;
	
	public poblacion_parada (int Cod_parada, int Cod_postal) {
		this.Cod_parada = Cod_parada;
		this.Cod_postal = Cod_postal;
	}

	public int getCod_parada() {
		return Cod_parada;
	}

	public void setCod_parada(int cod_parada) {
		Cod_parada = cod_parada;
	}

	public int getCod_postal() {
		return Cod_postal;
	}

	public void setCod_postal(int cod_postal) {
		Cod_postal = cod_postal;
	}
}
