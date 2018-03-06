package graficos;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTeclas ventana1=new MarcoConTeclas();
		
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana1.setVisible(true);
				
	}
}


class MarcoConTeclas extends JFrame {
	
	public MarcoConTeclas(){
		
		setBounds(400,400,600,400);
		setTitle("Titulo del Frame");
		Toolkit icono1=Toolkit.getDefaultToolkit();
		Image logo1=icono1.getImage("imagenes/icono.png");
		setIconImage(logo1);
		setBackground(Color.BLACK);
		
		EventoDeTeclado tecla=new EventoDeTeclado();
		addKeyListener(tecla);
			
	}
}

class LaminaTeclado extends JPanel{
	
	public LaminaTeclado(){
		
		
	}	
}

class EventoDeTeclado implements KeyListener{//creo una clase que implementa la intefaz KeyListener
	//por lo tanto tengo que sobreescribir todos los metodos de esta interfaz

	@Override
	public void keyPressed(KeyEvent e) {//este metodo se inicia cuando presionamos una tecla del teclado
		// TODO Auto-generated method stub
		
		int codigo = e.getKeyCode();//con el metodo getkeycode de la clase keyevent obtenemos la tecla presionada
		System.out.println(codigo);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {//este metodo se inicia cuando una tecla del teclado es liberada
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {//este metodo se inicia cuando una tecla del teclado es precionada y liberada
		// TODO Auto-generated method stub
		
		char letra=e.getKeyChar();//el metodo getkeychar nos entrega la letra presionada en el teclado
		System.out.println(letra);
		
	}

}

