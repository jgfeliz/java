
package poo;

//import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Coche micoche=new Coche(); // instanciar objeto de la clase coche
		
		micoche.establece_color("verde");
		
		System.out.println(micoche.dime_datos_generales()); 
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos("si");
		
		System.out.println(micoche.dime_asiento());
		
		micoche.configura_climatizador("si");
		
		System.out.println(micoche.dime_climatizador());
		
		micoche.peso_total();
		
		System.out.println(micoche.dime_peso());
		
		System.out.println("El costo total del coche es: " + micoche.establece_precio());
		*/
		
		Coche micoche1= new Coche(); //creo instancia de la clase Coche en el objeto micoche1
		
		micoche1.establece_color("Arillo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);//creo instancia de la clase Furgoneta en el objeto mifurgoneta1
		
		mifurgoneta1.establece_color("Verde");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales());
		

	}

}
