import javax.swing.*;
public class Uso_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises=new String[8];
		
		paises[0]="Espana";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		//int e=0;
		
		//for(int i=0;i<paises.length;i++){
			
			//e++;
			
			//System.out.println("Pais " + (i+1) + " " + paises[i]);
		
		int indice=0;
		
		for(String elementos:paises){ //este bucle for es especial para trabajar con matrices, de esta manera nos olvidamos de indicar su alcance
			
			indice++;
			
			System.out.println("Pais " + indice + " " + elementos);
			
						
		}
		

		//otro ejemplo para rellenar una matriz
		
		//String [] matriz2=new String[8];
		
		//int indice2=0;
		
		//for (int i=0;i<8;i++){
						
		//	matriz2[i]=JOptionPane.showInputDialog("Introcude pais " + (i+1));
		//}
		
		//for (String m2:matriz2){
			
		//	indice2++;
			
		//	System.out.println("El pais ingresado en el indice " + indice2 + " Es " + m2);
		//}
		
		//rellenar una matriz con valores random
		
		//int aleatorio; // =(int)(Math.random() * 100);
		
		int [] random=new int[10];
		
		for(int i=0;i<10;i++){
			
			random[i]=(int)(Math.random() * 1000);
			
			System.out.println("El numero aleatorio guardado en el indice " + i + " es " + random[i]);
		}		

	}

}
