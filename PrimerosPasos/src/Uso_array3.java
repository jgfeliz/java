
public class Uso_array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix=new int[4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=23;
		matrix[0][2]=54;
		matrix[0][3]=63;
		matrix[0][4]=98;
		
		matrix[1][0]=34;
		matrix[1][1]=65;
		matrix[1][2]=23;
		matrix[1][3]=59;
		matrix[1][4]=11;
		
		matrix[2][0]=10;
		matrix[2][1]=98;
		matrix[2][2]=56;
		matrix[2][3]=34;
		matrix[2][4]=97;
		
		matrix[3][0]=14;
		matrix[3][1]=27;
		matrix[3][2]=68;
		matrix[3][3]=54;
		matrix[3][4]=33;
		
		for(int i=0;i<4;i++){
			
			System.out.println();
			
			for(int j=0;j<5;j++){
				
				System.out.println("El indice " + i + "," + j + " Contiene el valor :" + matrix[i][j]);
			}
		}
	

	}

}
