package graficos;

import java.awt.Toolkit;

import javax.swing.*;

import java.awt.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setVisible(true);//con este metodo hacemos visible el objeto de tipo miMarco que hemos creado
		//el metodo constructor ya se encarga de darle valores iniciales al objeto, en este caso configuramos el tamano de la ventan
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//en este metodo le indicamos que hacer cuando se cierre la ventana, la cual tiene varias operaciones
	
	}

}

class MarcoCentrado extends JFrame{//creo una clase llamada marcocentrado la cual hereda la clase JFrame
	
	public MarcoCentrado(){//metodo constructor de la clase marcocentrado
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();//creo un objeto de tipo toolkit y contiene la informacion obtenida en el getdefaulttoolkit
				
		Dimension tamanoPantalla=mipantalla.getScreenSize();//creo un objeto de tipo dimension en el cual se almacena el tamano de la pantalla
		
		int alturaPantalla=tamanoPantalla.width;//creo variable que almacena la altura de la pantalla
		
		int anchoPantalla=tamanoPantalla.height;//creo variable que almacena el ancho de la pantalla
		
		setSize(alturaPantalla/2, anchoPantalla/2);//utilizo este metodo para establecer la altura y el ancho de la pantalla de la mitad de la pantalla donde se esta ejecutando
		
		setLocation(alturaPantalla/4, anchoPantalla/4);//uvico el marco justo en el medio de la pantalla
		
		setTitle("este es el titulo del marco");//le agrego un titulo al marco
		
		Image miIcono=mipantalla.getImage("imagenes/icono.png");//creo un objeto de tipo image y con el metodo getimage le indico que imagen tiene que almacenar en este objeto
		
		setIconImage(miIcono);//establesco el inoco que debe tener el marco		
		
	}
		
}