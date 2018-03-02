import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena=JOptionPane.showInputDialog("que edad tienes..");		
				
		int edad=Integer.parseInt(cadena);
		
		int edad2=(edad-2018);
		
		System.out.println("de acuerdo a tu edad naciste en el ano " + Math.abs(edad2));
		
		System.out.println(Math.abs(edad2));
		
		for(int i=edad;i>0;i--){
			
			System.out.println(i);
		}
		
		if(Math.abs(edad2)<edad){
			
			System.out.println("el If esta funcionando....");
		}
		
		else{
			
			System.out.println("el else esta funcionando...");
			
		}
		
		String entrada=JOptionPane.showInputDialog("Hasta que numero quieres contar?...");
		
		int numero=Integer.parseInt(entrada);
		
		for (int i=1;i<=numero;i++){
			
			System.out.println(i);
			
		}

	}

}
