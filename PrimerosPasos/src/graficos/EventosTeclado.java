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

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int codigo = e.getKeyCode();
		System.out.println(codigo);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//char letra=e.getKeyChar();
		//System.out.println(letra);
		
	}

}
