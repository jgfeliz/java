
public class Uso_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int [] mi_matriz=new int[5];  Declaracion de matris
		
		mi_matriz[0]=5; 				iniciacion de matriz
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71; */
		
		int [] mi_matriz={5,38,-15,92,71}; //	declaracion e iniciacion de matriz
		
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		
		for(int i=0; i<mi_matriz.length;i++){ // la propiedad length nos entrega el alcance o indice de la matriz
			
			System.out.println("El valor del indice " + i + " es " + mi_matriz[i]);
		}
		
	}

}
