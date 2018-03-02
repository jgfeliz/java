
public class ejemplo_array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		
		double interes=0.10;
		
		double [][] saldo= new double[6][5];
		
		for (int i=0; i<6; i++){
			
			saldo[i][0]=10000;
			acumulado=10000;
						
			for (int j=1;j<5;j++){
				
				saldo[i][j]=acumulado+(acumulado*interes);
				acumulado=acumulado+(acumulado*interes);
								
			}
			
			interes=interes+0.01;
			
		}
		
		for (int k=0;k<6;k++){
			
			System.out.println(" ");
			
			for (int l=0;l<5;l++){
				
				System.out.printf("%1.2f", saldo[k][l]);
				System.out.print(" ");
			}
		
		}
		

	}

}
