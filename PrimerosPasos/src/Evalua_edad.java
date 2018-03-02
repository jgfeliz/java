import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu edad, porfavor ");
		
		int edad=entrada.nextInt();
		
		entrada.close();
		
		/*if(edad>=18){
			
			System.out.println("Eres mayor de edad");
		}
		
		else{
			
			System.out.println("Eres menor de edad");
		}*/
		
		if(edad<18){ 	// el condicional if se aplicara si la condicion es verdadera, la condicion es la encontrada dentro de los parentesis, de lo contrario continuaria con la ejecucion del programa
			
			System.out.println("Eres adolescente");
		}
		
		else if(edad<45){
			
			System.out.println("Eres joven");
		}
		
		else if(edad<65){
			
			System.out.println("Eres Maduro");
		}
		
		else{
			
			System.out.println("Cuidate!");
		}
	}

}
