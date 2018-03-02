package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 23);
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2005, 03, 15);
		
		System.out.println("El nombre del empleado es: " + empleado1.dameNombre()
		+ " Su sueldo actual es: " + empleado1.dameSueldo());
		
		System.out.println("El nombre del empleado es: " + empleado2.dameNombre()
		+ " Su sueldo actual es: " + empleado2.dameSueldo());
		
		System.out.println("El nombre del empleado es: " + empleado3.dameNombre()
		+ " Su sueldo actual es: " + empleado3.dameSueldo());
		*/
				
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado [] misEmpleados=new Empleado[6]; //declaracion de matriz
		
		misEmpleados[0]=new Empleado("Paco Gomez", 8500, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana Lopez", 9500, 1995, 06, 02);
		misEmpleados[2]=new Empleado("Maria Martin", 10500, 2005, 03, 15);
		misEmpleados[3]=new Empleado("Antonio Fernandez");
		misEmpleados[4]=jefe_RRHH; //polimorfismo. principio de sustitucion
		misEmpleados[5]=new Jefatura("Maria", 95000, 1999, 5,26);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5]; //casting o refundicion 
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		Arrays.sort(misEmpleados); //utilizo el metodo sort de la clase arrays para organizar el array
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));//uso del metodo tomar deciciones
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " + jefa_Finanzas.establece_bonus(500));
		
		System.out.println("El empleado " + misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		
		
		for(int i=0;i<6;i++){//bucle for para user el metodo subesueldo para cada empleado
			
			misEmpleados[i].subeSueldo(5);
			
			System.out.println("Nombre : " + misEmpleados[i].dameNombre()
			+ " Sueldo: " + misEmpleados[i].dameSueldo() + 
			" Fecha de Alta: " + misEmpleados[i].dameAltaContrato());
			
		}
						
	}

}

class Empleado implements Comparable, Trabajadores { //clase empleado la cual implementa la interfaz Compareble, las interfaces se exportan usando la palabre reservada implements
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){ //metodo constructor, en este caso hay que pasarle los argumentos que se han especificado
				//los constructores le dan estado inicial a los objetos
		nombre =nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia); //la clase GregorioCalendar tiene un metodo constructor con su mismo nombre
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
		
	}
	
	public double establece_bonus(double gratificacion){
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public int compareTo(Object miObjeto){//sobreescribo el metodo compareTo de la interfaz Comparable
		//el metodo compareTo devuelve -1,1 o 0
		Empleado miEmpleado=(Empleado) miObjeto;//refundicion, tengo que transformar el objeto de tipo Object a Empleado, para poder realizar su comparacion
		
		if(this.sueldo<miEmpleado.sueldo){//este if compara el sueldo de un empleado y de otro para saber si es mayor o menos
			
			return -1;
		}
		
		if(this.sueldo>miEmpleado.sueldo){
			
			return 1;
		}//en este caso no se crea un if para evaluar si es igual, porque de no cumplierse las dos anteriores se sobre entiende que es igual y simplemente revuelve el 0
		
		return 0;
	}
	
	public Empleado(String nom){//metodo constructor de la clase empleado recibe como paremetro un string que se almacenara en la variable mon
		
		this(nom, 30000, 2000, 01, 01); //en este caso el this llama al constructor que coincide con los parametros que le estamos pasando, de tal manera este this se combierte en el que entrega los valores por default
	}
	
	public String dameNombre(){ //metodo getter nos entrega el nombre
		
		return nombre + " Id: " + Id;
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
	
	private String nombre;//encapsulacion con la palabra reservada private, esta variable solo se usara dentro de la clase donde esta asignada
	
	private double sueldo;//encapsulacion con la palabra reservada private, esta variable solo se usara dentro de la clase donde esta asignada
	
	private Date altaContrato;//encapsulacion con la palabra reservada private, esta variable solo se usara dentro de la clase donde esta asignada
	
	private static int IdSiguiente;
	
	private int Id;
	
}


class Jefatura extends Empleado implements jefes{ //creo la clase jefatura la cual hereda la clase Empleado, se implementa la insterfaz jefes
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia){ //creo el metodo contructor de la clase jefatura
		
		super(nom, sue, agno, mes, dia);//los metodos contructores de la clase Empleado deben recivir parametros, aqui les paso los paremetros
		
	}
	
	public String tomar_decisiones(String decision){//metodo heredado de la interfaz jefes
		
		return "Un miembro de la direccion ha tomado la descicion de " + decision;
		
	}
	
	public double establece_bonus(double gratificacion){
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public void estableceIncentivo(double b){//metodo setter establece el incentivo de la clase jefatura
		
		incentivo=b;
		
	}
	
	public double dameSueldo(){ //sobreescribo el metodo heredado, metodo getter nos retorna el sueldo mas el incentivo, al sobreescribir un metodo heredado eclipse lo identifica con el icono verde de la izquierda
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;//todo metodo getter debe tener un return, en este caso nos debuelve el incentivo mas el sueldo
	}
	
	private double incentivo;
		
}