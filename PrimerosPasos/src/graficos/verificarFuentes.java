package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class verificarFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ingresafuente=JOptionPane.showInputDialog("ingresa la fuente...");
		
		boolean estalafuente=false;
		
		String[] fuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente: fuentes){
			//System.out.println(nombredelafuente);
			
			if(nombredelafuente.equalsIgnoreCase(ingresafuente)){
				
				estalafuente=true;
			}
		}
		
		if(estalafuente){
			
			System.out.println("la fuente esta instalada..");
		}
		
		else{
			
			System.out.println("la fuente no esta instalada...");
		}

	}

}
