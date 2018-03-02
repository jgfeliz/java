import javax.swing.*;
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do{
			genero=JOptionPane.showInputDialog("Introduce tu Genero (H/M)");
			
		}
		
		while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		String cm=JOptionPane.showInputDialog("Introduce tu Estatura en centimetros, por favor");
				
		int estatura=Integer.parseInt(cm);
		
		if (genero.equalsIgnoreCase("H")){
			
			System.out.println("Tu peso recomendado es " + (estatura-110) + " Kilos");
			
		}
		
		else if(genero.equalsIgnoreCase("M")){
			
			System.out.println("Tu peso recomendado es " + (estatura-120) + " Kilos");
		}
					
	}

}
