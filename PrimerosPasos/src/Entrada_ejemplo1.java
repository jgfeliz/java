import java.util.*;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu nombre, porfavor");
		
		String nombre_usuario=(entrada.nextLine());
		
		System.out.println("Introduce tu edad, porfavor");
		
		int edad_usuario=(entrada.nextInt());
		
		System.out.println("Hola " + nombre_usuario + " El ano que viene tendras " + (edad_usuario+1) + " anos");

		entrada.close();
	}

}
