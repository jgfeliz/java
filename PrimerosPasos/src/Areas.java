import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

		int figura=entrada.nextInt();
		
		entrada.close();
		
		//int figura=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo"));
		
		switch (figura){ //dentro de los parentesis se introduce la variable que se desea evaluar
		
		case 1: //todo case termina con un break para que no ejecute el siguiente case en caso de que exista, case compara el valor de la variable a evaluar en el switch
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Lado "));
			
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
		
		break; //este es el brake del case 1 se debe cerrar con ;
		
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base "));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura "));
			
			System.out.println("El area del Rectangulo es " + (base*altura));
		
		break;
		
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base "));
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Altura "));
			
			System.out.println("El area del Triangulo es " + (base*altura)/2);
			
		break;
		
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Radio "));
			
			System.out.print("El area del circulo es ");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
				
			System.out.println("Opcion invalida ");
		

		}
	}

}
