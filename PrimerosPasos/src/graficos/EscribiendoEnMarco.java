package graficos;

import javax.swing.*;

import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto mimarco=new MarcoConTexto();//creo un objeto de tipo marcocontexto y/o lo instancio
					
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//este metodo indica que hacer cuando cerramos el marco
	}
	
}

class MarcoConTexto extends JFrame{ //creo la clase marcocontexto y heredo la clase JFrame
	
	public MarcoConTexto(){//metodo contrurtor de la clase, la cual da un estado inicial al objeto creado
					
		setVisible(true);//con este metodo hacemos que la ventana (marco) sea visible
		setSize(600,450);//con este metodo le damos un tamano al marco
		setLocation(400,200);//con este metodo le indicamos al marco en que parte de la pantalla tiene que aparecer
		setTitle("Primer Texto");//con este metodo le asignamos un titulo al marco creado		
		Lamina milamina=new Lamina();//instancia de la clase lamina
		add(milamina);//agrego la lamina creada en el marco creado						
	}
}

class Lamina extends JPanel{//se crea la clase lamina, este nos crea una lamina invisible sobre el marco, la clase JPanel nos crea el panel
	
		public void paintComponent(Graphics g){//se crea el metodo de tipo paintComponent, o sea se sobreescribe
		//pero se llama al metodo paintComponent de la clase padre con la palabra reservada super.
		//esto hace que el metodo paintComponent haga su funcion a la cual fue programada
		//y lo que le agregamos debajo
			
		super.paintComponent(g);//llamo al metodo padre paintComponent y le paso el parametro g
		//que en este caso puedo llamarlo de cualquier forma
		
		g.drawString("texto dentro de la lamina", 100, 100);//metodo que se utiliza para escribir un texto en la coordenada citada
				
	}		
}



