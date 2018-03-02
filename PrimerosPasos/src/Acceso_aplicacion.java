import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="jose";
		
		String pass="";
		
		int intentos=0;
		
		while (clave.equals(pass)==false){
			
			intentos++;
			
			pass=JOptionPane.showInputDialog("Introduce una contrasena");
			
			if (pass.equals(clave)==false){
				
				System.out.println("contrasena incorrecta");
				
			}
			
		}
		
		System.out.println("contrasena correcta \nRealizaste " + intentos + " intentos");

	}

}
