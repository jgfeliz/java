
public class ManipulaCadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="hoy es un estupendo dia para aprender a programar en Java";
		
		String frase_resumen=frase.substring(29, 57);
		
		System.out.println(frase_resumen  + " de una manera divertida " + frase.substring(0, 29));
		
		System.out.println(frase.substring(8));
		
		String mayuscula=frase.substring(8, 27);
		
		System.out.println(mayuscula.toUpperCase());

	}

}
