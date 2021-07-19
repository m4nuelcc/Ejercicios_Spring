package hibernate;

import java.sql.Connection;
import java.sql.DriverManager;



public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl="jdbc:mysql://localhost:3306/pruebashibernet?useSSL=false";
		
		String usuario = "root";
		
		String contra = "root";
		
		
		try {
			
			System.out.println("intentando contectar con la base de datos" + jdbcUrl );
			
			Connection miConexion = DriverManager.getConnection(jdbcUrl, usuario, contra);
			
			System.out.println("Conexion exitosa");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}

	}

}
