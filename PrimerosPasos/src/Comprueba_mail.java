import javax.swing.*;
public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba=0;
		
		boolean punto=false;

		String email=JOptionPane.showInputDialog("Introduce el email ");
		
		for(int i=0; i<email.length(); i++){
			
			String letra;
			
			letra = email;
			
			if(letra.charAt(i)=='@'){
				
			 	arroba++;
			}
			
			if(letra.charAt(i)=='.'){
				
				punto=true;
		
			}
			
		}
		
		if(arroba==1 && punto==true){
			
			System.out.println("El email es valido");
		}
		
		else{
			
			System.out.println("El email es invalido");
		}
		
	}

}
