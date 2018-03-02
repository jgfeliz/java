import java.util.*;
public class Uso_Tallas {
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE}; //tipo de datos enumerados, almacena en una variale los datos enumerados

	enum Talla { // el tipo de dato enum no se puede utilizar dentro del metod main
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura){ //constructor de tipo enum debe ser private y no public porque no se permite un constructor 
			
			this.abreviatura=abreviatura; // con el this indico que esta es una variable y no el parametro que se le pasa al constructor
		}
		
		public String dameAbreviatura(){ // metodo getter me entrega la abreviatura
			
			return abreviatura;
		}
		
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Talla s=Talla.MINI;
//		
//		Talla m=Talla.MEDIANO;
//		
//		Talla l=Talla.GRANDE;
//		
//		Talla xl=Talla.MUY_GRANDE;
		
		Scanner entrada=new Scanner(System.in);//variable de tipo scanner 
		
		System.out.println("escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE"); //imprime mensage en pantalla
		
		String entrada_datos= entrada.nextLine().toUpperCase();//almacena en una variable de tipo string los que escribe en la pantalla
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);//se crea objeto de tipo Talla que almacenara la informacion guardada en la variable entrada_datos
		
		System.out.println("la talla es:" + la_talla);
		
		System.out.println("la abreviatura es: " + la_talla.dameAbreviatura());//imprime el resultado del getter
		

	}

}
