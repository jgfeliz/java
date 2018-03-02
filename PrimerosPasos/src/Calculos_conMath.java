
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double raiz=Math.sqrt(9); //raiz cuadrada de 9
				
		double num1=5.45;
		
		int resultado=(int)Math.round(num1); //aqui se realiza una refundicion 

		System.out.println(resultado);
		
		double base=5;
		
		double exponente=3;
		
		int resultado2=(int)Math.pow(base, exponente);
		
		System.out.println("el resultado de " + base + " elevado a " + exponente + " es " + resultado2);
		
	}

}
