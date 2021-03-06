package graficos;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoss mimarco=new marcoss();//creo una instancia (objeto)de la clase marco
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//utilizo el metodo setdefaultcloseoperation que indica que debe hacer cuando cierre la ventana, en este caso le indico que cierre el marco
		mimarco.setVisible(true);//con este metodo le indico que el marco es visible
		mimarco.setTitle("Ventana 1...");//le coloso un titulo a la ventana
		marcoss mimarco2=new marcoss();//creo un objeto de la clase marco
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//le imdico que al precionar x en este marco solo se cierre el marco
		mimarco2.setVisible(true);//le indico al objeto que sea visible
		mimarco2.setSize(300, 210);//le coloco un tamano de 300x210
		mimarco2.setTitle("Ventana 2...");//le asigno un titulo a este marco

	}

}

class marcoss extends JFrame{//creo una clase llamada marco la cual hereda de JFrame
	
	public marcoss(){//creo el metodo constructor del la clase creada. la funcion de los metodos constructores es darle un estado inicial a los objetos creados
		
		setBounds(400,400,600,400);//le indicamos un tamano y unas coordenadas en la pantalla donde tiene que aparecer
		setTitle("Respondiendo...");//le agrego un titulo por default
		Toolkit miLogo=Toolkit.getDefaultToolkit();//utilizo un objeto de tipo toolkit para poder darle un icono a las ventanas
		Image logos=miLogo.getImage("imagenes/icono.png");//creo un objeto de tipo image en el se almacenara el icono que se utlilizara para el icono
		setIconImage(logos);//utilizo el objeto de tipo imagen como icono del marco
		
		M_Ventana oyente_ventana=new M_Ventana();//instancia de una clase que implementa la interfaz windowListener
		//esta interfaz es la que sirve de oyente para desencadenar los eventos
		addWindowListener(oyente_ventana);//con el metodo addwindowlistener de la clase jframe le indicamos entre parentesis quien es el objeto oyente
		
		//addWindowListener(new M_Ventana());//de esta forma le paso como parametros una nueva instancia de la clase, sin necesidad de construir un objeto
	}
		
}

class M_Ventana implements WindowListener{//creamos una clase que implemente la interfaz windowlistener, esta clase sera la clase oyente que desencadera los eventos en los metodos de la interfaz
	//esta interfaz contiene 7 metodos y tenemos que sobreescribirlos a todos
	
	public void windowActivated(WindowEvent e){
		
		System.out.println(this + "Ventana Activa...");
	}
	
	public void windowClosed(WindowEvent e){
		
		System.out.println(this + "Ventana Cerrada...");
	}
	
	public void windowClosing(WindowEvent e){
		
		System.out.println(this + "Cerrando Ventana...");
	}
	
	public void windowDeactivated(WindowEvent e){
		
		System.out.println(this + "Ventana Desactivada...");
	}
	
	public void windowDeiconified(WindowEvent e){
		
		System.out.println(this + "Ventana Restaurada...");
	}
	
	public void windowIconified(WindowEvent e){
		
		System.out.println(this + "Ventana Minimizada");		
	}
	
	public void windowOpened(WindowEvent e){
		
		System.out.println(this + "Ventana Activa...");
				
	}
		
}

