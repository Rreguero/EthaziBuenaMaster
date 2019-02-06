package Controlador;

public class linea_autobus {
	private String Cod_linea;
	private int Cod_autobus;
	
	public linea_autobus (String Cod_linea, int Cod_autobus) {
		this.Cod_autobus = Cod_autobus;
		this.Cod_linea = Cod_linea;
	}

	public String getCod_linea() {
		return Cod_linea;
	}

	public void setCod_linea(String cod_linea) {
		Cod_linea = cod_linea;
	}

	public int getCod_autobus() {
		return Cod_autobus;
	}

	public void setCod_autobus(int cod_autobus) {
		Cod_autobus = cod_autobus;
	}
}
