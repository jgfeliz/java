package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ani");
		
		Empleados trabajador3=new Empleados("Anita");
		
		Empleados trabajador4=new Empleados("Anota");
		
		Empleados trabajador5=new Empleados("Anuta");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelbeDatos());
		
		System.out.println(trabajador2.devuelbeDatos());
		
		System.out.println(trabajador3.devuelbeDatos());
		
		System.out.println(trabajador4.devuelbeDatos());
		
		System.out.println(trabajador5.devuelbeDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		
	}

}

class Empleados{ //clase 
	
	public Empleados(String nom){//metodo constructor 
		
		nombre=nom;
		
		seccion="Administracion";
		
		Id=idSiguiente;
		
		idSiguiente++;
		
	}
	
	public static String dameIdSiguiente(){//contrucccion de metodo estatico, se usa la palabra reservada static, no es necesario instanciarlo para su ejecucion
		
		return "El Id siguiente es: " + idSiguiente;
	}
	
	public void cambiaSeccion(String seccion){//metodo setter, este le asigna valor a la variable seccion
		
		this.seccion=seccion;
		
	}
	
	public String devuelbeDatos(){//metodo getter nos entrega el return con los datos dados en el setter
		
		return "El nombre es " + nombre + " y la seccion es " + seccion + " y el Id es: " + Id;
	
	}
	
	private final String nombre;//con final nos aseguramos que el valor asignado durante la ejecucion del contructor no se pueda cambiar
	
	private String seccion;//encapsulacion con la palabra reservada private
	
	private int Id;
	
	private static int idSiguiente=1;//static es una variable de la clase no de los objetos. por eso se usa la palabra reservada static todos los objetos de esta clase tienen la variable static.
	
}