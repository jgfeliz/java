package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("luis conde", 50000, 2009, 02, 25);
		lasPersonas[1]=new Alumno("ana lopez", "biologicas");
		
		for (Persona p : lasPersonas) {
			
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}

	}

}


abstract class Persona{ //palabra reservada abstract, se usa para declarar la clase como abstracta, es obligatorio si hay uno o mas metodos abstractos
	
	public Persona(String nom){
		
		nombre=nom;
	}
	
	
	public String dameNombre(){
		
		return "El nombre de la persona es: " + nombre;
	}
	
	
	public abstract String dameDescripcion(); //declaracion de metodo abstracto, solo se define no se construye, si una clase tiene uno o mas metodos abstractos la clase se tiene que declarar como abstracta
		
	private String nombre; //modificador de acceso private solo puede ser accesado desde la clase para aplicar la encapsulacion
}



class Empleado2 extends Persona{ //clase empleado la cual hereda con la palabra reservada extends la clase Persona
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia){ //metodo constructor, en este caso hay que pasarle los argumentos que se han especificado
				//los constructores le dan estado inicial a los objetos
		
		super(nom); // el constructor de la superclase solicita que se le pase un parametro, por ende se le asigna el parametro entre parentesis 
		
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia); //la clase GregorioCalendar tiene un metodo constructor con su mismo nombre
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
		
	}
	
	public String dameDescripcion(){//por obligacion se debe sobreescribir el metodo abstracto heredado de la clase abstracta
		
		return "Este empleaado tiene un Id= " + Id + " con un sueldo=" + sueldo; //como la clase abstracta es un getter debemos darle un return para que nos entregue un valor
	}
	
	public double dameSueldo(){ //metodo getter nos entrega el sueldo con el aumento
		
		return sueldo;
	}
	
	public Date dameAltaContrato(){ //metodo getter nos entrega la fecha de alta
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){ //metodo setter nos exige un parametro de tipo double
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
		
	private double sueldo;//encapsulacion con la palabra reservada private, esta variable solo se usara dentro de la clase donde esta asignada
	
	private Date altaContrato;//encapsulacion con la palabra reservada private, esta variable solo se usara dentro de la clase donde esta asignada
	
	private static int IdSiguiente;//modificador de acceso private solo puede ser accesado desde la clase para aplicar la encapsulacion
	
	private int Id;//modificador de acceso private solo puede ser accesado desde la clase para aplicar la encapsulacion
	
}


class Alumno extends Persona{
	
	public Alumno(String nom, String car){
		
		super(nom);
		
		carrera=car;
				
	}
	
	public String dameDescripcion(){
		
		return "Este alumno esta estuduando la carrera de " + carrera;
	}
	
	private String carrera;//modificador de acceso private solo puede ser accesado desde la clase para aplicar la encapsulacion
}
//
//class Jefatura extends Empleado{ //creo la clase jefatura la cual hereda la clase Empleado
//	
//	public Jefatura(String nom, double sue, int agno, int mes, int dia){ //creo el metodo contructor de la clase jefatura
//		
//		super(nom, sue, agno, mes, dia);//los metodos contructores de la clase Empleado deben recivir parametros, aqui les paso los paremetros
//		
//	}
//	
//	public void estableceIncentivo(double b){//metodo setter establece el incentivo de la clase jefatura
//		
//		incentivo=b;
//		
//	}
//	
//	public double dameSueldo(){ //sobreescribo el metodo heredado, metodo getter nos retorna el sueldo mas el incentivo, al sobreescribir un metodo heredado eclipse lo identifica con el icono verde de la izquierda
//		
//		double sueldoJefe=super.dameSueldo();
//		
//		return sueldoJefe + incentivo;//todo metodo getter debe tener un return, en este caso nos debuelve el incentivo mas el sueldo
//	}
//	
//	private double incentivo;
//		
//}