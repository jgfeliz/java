package poo;

public interface Trabajadores { //interfaz no se construyen metodos constructores 
	
	double establece_bonus(double gratificacion);//todos los metodos de una interfaz son public y abstractos
	
	public static final double bonus_base=1500; //en las interfaces las constantes tienen que ser public, static y final
	//aunque no se definan estas cualidades el interprete de java asi las elavora y se dan porsupuesto

}
