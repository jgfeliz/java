package graficos;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marco marcoPrincipal=new marco();//instancia de la clase marco
		marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//le digo que hacer cuando se precione el boton de cerrar
		marcoPrincipal.setVisible(true);//le indico que sea visible

	}
}

class marco extends JFrame{//creo una clase que hereda la clase jframe
	
	public marco(){//metodo constructor de la clase, le da un estado inicial a los objetos de esta clase
		
		setBounds(400,400,600,400);//le asigno un tamano y unas coordenadas donde aparecera la ventana
		setTitle("Marco X...");//le agrego un titulo al marco
		Toolkit icono=Toolkit.getDefaultToolkit();//utilizo un objeto de tipo toolkit para poder obtener un icono del equipo
		Image imagenIcono=icono.getImage("imagenes/icono.png");//almaceno en una variable de tipo image el icono obtenido con el metodo getimage de la clase toolkit 
		setIconImage(imagenIcono);//le asigno el icono al marco
		//CambiaEstado nuevo_estado=new CambiaEstado();
		addWindowStateListener(new CambiaEstado());//con el metodo addwindowstatelistener le indico quien es la clase/objeto que se quedara en la escucha del cambio en la ventana
		
	}	
}

class CambiaEstado implements WindowStateListener{//creo una clase que implemente la interfaz windowstatelistener
	//esta interfaz invoca un unico metodo cuando el estado de la ventana cambia
	
	public void windowStateChanged(WindowEvent e){//este medodo se activa cuando la ventana cambia
		
		//System.out.println("La ventana ha cambiado");
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH){//uso el if para que compare el evento de la ventana con su estado
			//y utilizo las variables de la clase frame
			
			System.out.println("La ventana se ha Maximizado...");
		}else if(e.getNewState()==Frame.NORMAL){
			
			System.out.println("La ventana esta normal...");
		}else if(e.getNewState()==Frame.ICONIFIED){
			
			System.out.println("La ventana esta Minimizada...");
		}			
				
	}	
}