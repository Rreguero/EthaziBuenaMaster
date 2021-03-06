package Modelo;
 
	import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
	 
	public class DB {
	    private String  maquina    ;
	    private String  usuario     ;
	    private String  clave    ;
	    private int puerto          ;
	    private String  servidor    = "";
	    private static Connection conexion  = null;
	 
	    
	    //CONSTRUCTOR
	    //Recibe el nombre de la base de datos
	    public DB(String baseDatos){
	    	
	    	
	    	String fichero = "../AutobusTxartela/src/Modelo/Fitxero";
	    	
	    	
    		int kont =0;
    		String server="jdbc:mysql://";
	        
	        //LEER FICHERO LINEA A LINEA
	        try {
  		      FileReader fr = new FileReader(fichero);
  		      BufferedReader br = new BufferedReader(fr);
  		 
  		      String linea;
  		      while((linea = br.readLine()) != null) {
  		    	  System.out.println(linea);
  		    	  
	  		        if(kont==0) {
	  		        	this.maquina=linea;
	  		        	}
	  		      	if (kont==1) {
	  		      		this.usuario=linea;
	  		      		}
	  		      	if (kont==2) {
	  		      		this.clave=linea;
	  		      		}
  		      	
  		      	kont++;
  		      	linea="";
  		      	
  		      	}
  		      
  		      if (kont==3) {
  		    	  this.servidor=linea;
  		    	  
  		      }

  		      fr.close();
  		    }
  		    catch(Exception e) {
  		      System.out.println("Fitxeroa irakurri "+ fichero + ": " + e);
  		    }
  	
	        // FINAL DE LEER FICHERO LINEA A LINEA
	        
	        
	        
	        
  	this.servidor="jdbc:mysql://"+this.maquina+":"+ this.puerto+"/"+baseDatos;
	        
	        
	        
	        //Registrar el driver
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            System.err.println("ERROR AL REGISTRAR EL DRIVER");
	            System.exit(0); //parar la ejecuci�n
	        }
	 
	        //Establecer la conexi�n con el servidor
	        try {
	            conexion = DriverManager.getConnection("jdbc:mysql://" + this.maquina, this.usuario, this.clave);
	        } catch (SQLException e) {
	            System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
	            System.exit(0); //parar la ejecuci�n
	        }
	        System.out.println("Conectado a "+baseDatos);
	    }
	 
	    //Devuelve el objeto Connection que se usar� en la clase Controller

	  
	    public  Connection getConexion() {
	        return conexion;
	    }
	    
 

	 
	}