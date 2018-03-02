
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Jose gabriel feliz lopez";
		
		System.out.println("mi nombre es: " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " Letras.");
		
		System.out.println("La primera letra de mi nombre es:" + nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("la ultima letra de mi nombre es: " + nombre.charAt(ultima_letra-1));
		
		System.out.println(nombre.length());
		
		System.out.println(nombre.getBytes());

	}

}
