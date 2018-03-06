package graficos;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton marcorata=new MarcoRaton();
		marcorata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoRaton extends JFrame{
	
	public MarcoRaton(){
		
		setBounds(400,400,600,400);
		setTitle("Marco de la Ventana...");
		setVisible(true);
		Toolkit icono3=Toolkit.getDefaultToolkit();
		Image logo3=icono3.getImage("imagenes/icono.png");
		setIconImage(logo3);
		
		EventosDeRaton3 eventoRaton=new EventosDeRaton3();//con esto indicamos que la clase en la que setamos sera el objeto escucha del evento
		//addMouseListener(eventoRaton);//con este metodo agregamos el listener
		addMouseMotionListener(eventoRaton);
		
	}
}

//class EventosDeRaton implements MouseListener{
//
//	@Override
//	public void mouseClicked(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("has hecho click");
//		
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("acabas de entrar");
//		
//	}
//
//	@Override
//	public void mouseExited(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("acabas de salir");
//	}
//
//	@Override
//	public void mousePressed(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("acabas de presionar");
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("acabas de levantar");
//		
//	}
//	
//	
//}

//class EventosDeRaton2 extends MouseAdapter{//la clase mouseadapter nos permite utilizar la interfaz mouselistener pero sin la necesidad de sobreescribir todos sus metodos
//	
//	public void mouseClicked(MouseEvent e) {//en este caso usamos un solo metodo de la clase
//		//este metodo se ejecuta cuando hacemos click con cualquier boton del mouse
//		System.out.println("has hecho click");
//		
//		//System.out.println("el mouse se encuentra en las coordenadas " + e.getX() + " " + e.getY() );
//		
//		//System.out.println(e.getClickCount());//este metodo nos cuenta la cantidad de click consecutivos que hemos dado
//		
//	}
//	
//	public void mousePressed(MouseEvent e){
//		
//		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
//			
//			System.out.println("Hemos pulsado el boton izquierdo");
//		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
//			
//			System.out.println("Hemos pulsado el boton del centro");
//		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
//			
//			System.out.println("Hemos pulsado el boton derecho");
//		}
//	}
//	
//}


class EventosDeRaton3 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Estas Arastrando el mouse");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Estas Moviendo el mouse");
		
	}
	
	
}