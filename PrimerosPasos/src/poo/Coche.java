package poo;

public class Coche {
	
	private int ruedas; // encapsulacion, las variables se ecapsulan utilizando "private" antes del tipo de dato
	private int largo; //encapsulacion, las variables se ecapsulan utilizando "private" antes del tipo de dato
	private int ancho; //encapsulacion, las variables se ecapsulan utilizando "private" antes del tipo de dato
	private int motor; //encapsulacion, las variables se ecapsulan utilizando "private" antes del tipo de dato
	private int peso_plataforma; //encapsulacion, las variables se ecapsulan utilizando "private" antes del tipo de dato
	private String color;//encapsulacion, las variables se ecapsulan utilizando "private" antes del tipo de dato
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche(){ //metodo constructor tiene el mismo nombre de la clase para diferenciarse de los metodos getter y setter
		
		ruedas=4;
		largo=2000;		
		ancho=300;		
		motor=1600;		
		peso_plataforma=500;
		
	}
	
	public String dime_datos_generales(){//metodo getter, nos devuelve "return" el valor de una variable, todo metodo getter necesita un return
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas, " +
		" mide " + largo/1000 + " Metros de largo, con  " + ancho +	
		" Centimetros de ancho, tiene un peso de de plataforma de " + peso_plataforma + " Kilos"; 
		
	}

	public void establece_color(String color_coche){//metodo setter, establece el valor de una variable nececita un "void"
		
		color=color_coche; //la variable color se modifica con el metodo setter establece_color
	}
	
	public String dime_color(){//metodo getter, nos devuelve "return" el valor de la variale "color", todo metodo getter necesita un return
		
		return "El color del coche es " + color;
	}
	
	public void configura_asientos(String asientos_cuero){//metodo setter para evaluar si tiene o no asientos de cuero
		
		//this.asientos_cuero=asientos_cuero; //cuando tenemos una variable con el mismo nombre del metodo se utiliza el "this." para especificar que es la variable
		if(asientos_cuero=="si"){
			
			this.asientos_cuero=true;
		}
		
		else{
			
			this.asientos_cuero=false;
			
		}	
		
	}
	
	public String dime_asiento(){//metodo GETTER este nos indica la configuracion de los asientos en base a una condicion
		
		if(asientos_cuero==true){
			
			return "El coche tiene asientos de cuero";
			
		}
		
		else{
			
			return "El coche tiene asientos de serie";
			
		}
		
	}
	
	public void configura_climatizador(String climatizador){//metodo setter del climatizador
		
		if(climatizador=="si"){
			
			this.climatizador=true;
			
		}
		
		else{
			
			this.climatizador=false;
			
		}
		
	}
	
	public String dime_climatizador(){//metodo getter nos indica si tiene o no climatizador
		
		if(climatizador==true){
			
			return "el coche cuenta con climatizador ";
					
		}
		
		else{
			
			return "el coche tiene aire acondicionado";
			
		}
		
	}
	
	public void peso_total(){//metodo setter del peso total, evalua los agregados y en base a ellos aumenta el peso
		
		peso_total=peso_plataforma+500;
		
		if(climatizador==true){
			
			peso_total=peso_total+20;
			
		}
		
		if(asientos_cuero==true){
			
			peso_total=peso_total+50;
			
		}
		
	}
	
	public String dime_peso(){ //metodo getter, nos indica el peso total

		return "el peso total del coche es: " + peso_total;
		
	}
	
	public int establece_precio(){//metodo setter para calcular el precio en base a los agregados
		
		int precio=10000;
		
		if(climatizador==true){
			
			precio+=1500;
		}
		
		if(asientos_cuero==true){
			
			precio+=2000;
		}
		
		return precio;
		
	}
}