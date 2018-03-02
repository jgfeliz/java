import java.util.*;

public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		int aleatorio;
		
		int intentos=1;
		
		aleatorio =(int)(Math.random() * 100); //aqui se realiza una refunsicion, pasar un numero decimal creado con random a entero
		
		Scanner entrada=new Scanner(System.in);

		System.out.println("Ingrese un numero, por favor");
		
		int compara=entrada.nextInt();
		
		while (aleatorio!=compara) {
			
			intentos++;
			
			if (aleatorio>compara){
				
				System.out.println("El numero aleatorio es mayor que " + compara);
			}
			
			else if (aleatorio<compara){
				
				System.out.println("El numero aleatorio es menor que " + compara);
			}
			
			compara=entrada.nextInt();
					
		}
		
		//entrada.close();
		
		System.out.println("El numero aleatorio es " + aleatorio + " lo intento " + intentos + " Veces");		
	}

}