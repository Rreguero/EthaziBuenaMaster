package Modelo;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Controlador.Autobusa;
import Controlador.Cliente;
import Controlador.Linea;
import Controlador.MetodoakVista;

public class Kontsulta {
//	static String Col_1 = "";
//	static String Col_2 = "";

	public static ArrayList<Linea> getDatuakArr(ArrayList<Linea> Datuak) {

		return Datuak;
	}

	public static ArrayList<Cliente> getInicioSes(ArrayList<Cliente> inicioSes) {
		return inicioSes;
	}

	public static void muestraLinea(String Cod_linea, String Nombre) {
		ArrayList<Linea> DatuakLinea = new ArrayList();
		Connection conexion = null;
		java.sql.Statement s = null;
		try {
			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");

			// Se obtiene una conexion con la base de datos.
			// En este caso nos conectamos a la base de datos ethazi3
			// con el usuario root y contra null
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");

			// Se crea un Statement, para realizar la consulta
			s = conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs

			ResultSet rs = ((java.sql.Statement) s).executeQuery("select * from linea");

			// Se recorre el ResultSet, mostrando por pantalla los resultados.
			while (rs.next()) {
				String CodLinea_ = "";
				String Nombre_ = "";
				CodLinea_ = rs.getString("Cod_Linea");
				Nombre_ = rs.getString("Nombre");
				Linea LineaDat1 = new Linea(CodLinea_, Nombre_);
				DatuakLinea.add(0, LineaDat1);
				System.out.println(Modelo.Kontsulta.toString1(DatuakLinea.get(0), CodLinea_, Nombre_));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static ArrayList<Cliente> guardaCliente() { // arraylist bueltatu behar du
		Connection conexion = null;
		Statement s = null;
		ArrayList<Cliente> inicioSes = new ArrayList<Cliente>();
		try {
			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs
			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT * FROM CLIENTE");

			while (rs.next()) {

				// SELECTAREN DATUAK GORDE

				String dni_;
				dni_ = rs.getString("DNI");

				String nombre_;
				nombre_ = rs.getString("Nombre");

				String apellido_;
				apellido_ = rs.getString("Apellidos");

				String sexo_;
				sexo_ = rs.getString("Sexo");

				String contraseña_;
				contraseña_ = rs.getString("Contraseña");

				String fecha_nac_;
				fecha_nac_ = rs.getString("Fecha_nac");
				
				Cliente c1 = new Cliente(dni_, nombre_, apellido_, fecha_nac_, sexo_, contraseña_);
				inicioSes.add(0,c1);
//				for (int n = 0; n < inicioSes.size(); n++) {
//					System.out.println(inicioSes.get(n));
//				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return inicioSes; // gero erabili ahal izateko array nankomprobaketa metodoan
	}

	public static ArrayList lineaAukeratu(String linea) {
		String line_Prueba = null;// paraden izenak gordetzen ditut
		Connection conexion = null;
		Statement s = null;
		Object nombre_ = null;
		ArrayList<String> geltokiak = new ArrayList();

		try {
			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs

			ResultSet rs = ((java.sql.Statement) s).executeQuery(
					"SELECT p.Nombre FROM linea l,parada p,linea_parada lp WHERE l.Cod_Linea = lp.Cod_Linea AND p.Cod_Parada = lp.Cod_Parada AND l.Cod_Linea LIKE '"
							+ linea + "'");
			while (rs.next()) {


				// DEPENDITZEN ZER LINEA SARTZEN DUDAN LINE_PRUEBA PARADA BATZUK GORDEKO DITU
				if (linea.equals("L1")) {
					line_Prueba = rs.getString("Nombre");
					// l1.setNombre(rs.getString("Nombre"));
				} else if (linea.equals("L2")) {
					line_Prueba = rs.getString("Nombre");
					// l2.setNombre(rs.getString("Nombre"));
				} else if (linea.equals("L3")) {
					line_Prueba = rs.getString("Nombre");
					// l3.setNombre(rs.getString("Nombre"));
				} else if (linea.equals("L4")) {
					line_Prueba = rs.getString("Nombre");
					// l4.setNombre(rs.getString("Nombre"));
				}

				geltokiak.add(0, line_Prueba); // ARRAYAN GORDETZEN DUT GELTOKIEN IZENAK GORDETZEN DUEN STRING


//Hemen sortzen dut arraylist bat, geltoki bakoitzagatik objektu bat sartzen dut arraylistean.
				for (int n = 0; n < geltokiak.size(); n++) {
					System.out.println(geltokiak.get(n));
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return geltokiak;
	}

	public static void muestraParada() {
		Connection conexion = null;
		Statement s = null;
		try {
			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs

			ResultSet rs = ((java.sql.Statement) s).executeQuery(
					"SELECT p.Nombre FROM parada p, linea l, linea_parada lp WHERE p.Cod_Parada = lp.Cod_Parada AND l.Cod_Linea = lp.Cod_Linea AND l.Cod_Linea LIKE 'L1'");
			while (rs.next()) {
//				String CodLinea_;
//				CodLinea_ = rs.getString("Cod_Linea");
				String nombre_;

				nombre_ = rs.getString("Nombre");
//				String calle_;
//				calle_= rs.getString("Calle");

//				Kontsulta.toStringPar(nombre_);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	
	//AUTOBUSAREN DATUAK GORDE
	
	public static  double autobusa(String linea) {
	
	
		
		Connection conexion = null;
		Statement s = null;
		
		int Cod_Bus = MetodoakVista.bus_lortu(linea);
		double kontsumo = 0;
	;
		
		try {
			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT kontsumo_km FROM  autobus where Cod_bus like 'Cod_Bus'"); //select atera nahi ditudan datuak
			
			while (rs.next()) {
				kontsumo = rs.getDouble(3);
		
				
			
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		return kontsumo;	
	}

	

	
	public static void muestraKontsumo(String linea) {
		ArrayList<Autobusa> DatuakBus = new ArrayList();
		Connection conexion = null;
		java.sql.Statement s = null;
		try {
			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");

			// Se obtiene una conexion con la base de datos.
			// En este caso nos conectamos a la base de datos ethazi3
			// con el usuario root y contra null
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");

			// Se crea un Statement, para realizar la consulta
			s = conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs

			ResultSet rs = ((java.sql.Statement) s).executeQuery("SELECT Consumo_km FROM autobus WHERE Cod_bus = '" + linea + "';");

			// Se recorre el ResultSet, mostrando por pantalla los resultados.
			while (rs.next()) {
				double Kontsumo_;
				Kontsumo_ = rs.getDouble("Kontsumo_km");
				Autobusa Kontsumo1 = new Autobusa(Kontsumo_);
				DatuakBus.add(0, Kontsumo1);
				System.out.println(Modelo.Kontsulta.toStringKonts(Kontsumo_));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static String lineaIzena(String linea) {
		Connection conexion = null;
		Statement s = null;
		String nombre_="";
		try {
			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/ethazi3", "root", "");
			s = (Statement) conexion.createStatement();

			// Se realiza la consulta. Los resultados se guardan en el ResultSet rs

			ResultSet rs = ((java.sql.Statement) s).executeQuery(
					"SELECT Nombre FROM linea WHERE Cod_Linea LIKE '"+linea+"'");
			while (rs.next()) {
//				String CodLinea_;
//				CodLinea_ = rs.getString("Cod_Linea");
				

				nombre_ = rs.getString("Nombre");
//				String calle_;
//				calle_= rs.getString("Calle");

//				Kontsulta.toStringPar(nombre_);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return nombre_;
	}


	public static String toString1(Linea Linea, String Cod_linea, String Nombre) {

		return "Kontsulta [LINEAREN KODEA: " + Cod_linea + " IZENA: " + Nombre + "]";
	}

	public static String toStringAuk(String Dni, String Nombre, String Calle) {
		String imprimaki = "Kontsulta [Linea Kodea: " + Dni + " IZENA: " + Nombre + " KALEA: " + Calle + " ]";
		return imprimaki;
	}

	public static void toStringPar(ArrayList Nombre) {
		System.out.println("Kontsulta [Geltokiaren izena:  " + Nombre);
	}

	public static String toStringKonts(double kontsumo_km) {
		return "Kontsulta [Kontsumoa: " + kontsumo_km + " ]";
	}
}