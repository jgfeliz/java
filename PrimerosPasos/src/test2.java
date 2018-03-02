import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int alcance = Integer.parseInt(JOptionPane.showInputDialog("introduce el alcance de la matriz..."));
		
		int [] matriz= new int[alcance];
		
		System.out.println("el alcance de la matriz es " + matriz.length);
		
		for (int i=0;i<alcance;i++){
			
			matriz[i]=Integer.parseInt(JOptionPane.showInputDialog("ingresa el valor del indice " + i));
		}
		
		for (int j=0;j<alcance;j++){
			
			System.out.println("el valor del indice " + j + " de la matiz es " + matriz[j]);
		}
				

	}

}
