package conectaBD;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class conexion {
	
	public static Connection conectarse() {
		try {
			
			Connection miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/app", "postgres", "mjrb2003");
			
			return miConexion;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "fallo");
			return null;
		}
	}
}
