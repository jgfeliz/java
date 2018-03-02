package graficos;

import java.awt.*;
import java.io.*;

import javax.swing.*;

import javax.imageio.*;

public class PruebaCopiaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen2 mimarco2=new MarcoImagen2();//instancia de la clase marcoimagen
		mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//instruccion que indica que hacer cuando precionamos el boton de cerrar
		
	}

}

class MarcoImagen2 extends JFrame{//creo la clase marcoconfuente y heredo(extends) la clase jframe
	
	public MarcoImagen2(){//creo el metodo constructor de la clase con los siguientes parametros
				
		setVisible(true);//hago que el marco sea visible
		
		setTitle("Marco Con Imagen...");//le agrego titulo al marco
		
		setBounds(600,300,500,500);//le doy un tamano al marco y una poscicion de origen
		
		LaminaConImagen2 milamina2=new LaminaConImagen2();//creo un objeto de tipo laminaconfuentes
		
		add(milamina2);//agrego la lamina al constructor de la clase marcoconfuentes
		
		milamina2.setForeground(Color.black);//establesco color a la fuente utilizada en el objeto de tipo laminaconfuentes
		
		Toolkit pantalla22=Toolkit.getDefaultToolkit();//utilizado para poder ponerle icono al marco
		
		Image miIcono22=pantalla22.getImage("imagenes/icono.png");//creo un objeto de tipo image y 
		//con el metodo getimage le indico que imagen tiene que almacenar en este objeto
		
		setIconImage(miIcono22);
	}
}

class LaminaConImagen2 extends JPanel{////creo la clase laminaconfuente y heredo(extends) la clase jpanel
	
	public void paintComponent(Graphics g){//se crea el metodo de tipo paintComponent, o sea se sobreescribe
		//pero se llama al metodo paintComponent de la clase padre con la palabra reservada super.
		//esto hace que el metodo paintComponent haga su funcion a la cual fue programada
		//y lo que le agregamos debajo
		
		super.paintComponent(g);//agrego el metodo padre paintcomponent a mi objeto g2
		
		//File miimagen=new File("imagenes/eclipse.png");//creo un objeto de tipo file
		//el constructor del objeto me pide que le pase como parametro un string en el cual especifique la ruta
		//donde se encuentre el file, es este caso es una imagen
		
		try{//manejo de ecepciones, con esta instruccion de indicamos que intente hacer esto, en caso de fallo que haga lo que dice el catch
			
			imagen2=ImageIO.read(new File("imagenes/icono.gif"));//con el metodo imageio indico que la imagen se encuentra en un 
			//objeto de tipo file, en este ejemplo instncio el objeto file dentro de los parametos que me pide
			
		}
		catch(IOException e){//manejo de ecepciones, en este caso esta es una ecepcion de tio ioexception
			//se ejecutara lo que se encuentra dentro de las llaves en caso de que falle el try
			
			System.out.println("la imagen no se encontro..");
		}
		
		g.drawImage(imagen2, 0, 0, null);//con el metodo perteneciente a la clase graphics dibujamos el objeto de tipo imagen
		//y las cordenadas donde aparecera dentro del marco
		
		int anchoImagen=imagen2.getWidth(this);//con este metodo obtenemos el ancho del objeto imagen2
		int altoImagen=imagen2.getHeight(this);//con este metodo obtenemos el alto del objeto imagen2
		
		int ancholamina=this.getWidth();//con este metodo se obtiene el ancho de this, que en esta ocasion es la lamina
		int altolamina=this.getHeight();//con este metodo se obtine el alto de this, que en este caso es la lamina
		
		System.out.println("el ancho de la lamina es: " + ancholamina + " el alto de la lamina es: " + altolamina);
		
		for(int i=0;i<180;i++){
			
			for(int j=0;j<100;j++){
				
				g.copyArea(0, 0, 15, 15, anchoImagen*i, altoImagen*j);//metodo para copiar una imagen de la lamina, le indicamos desde/hasta y le indicamos donde pega
			}
		}
		
		//g.drawString("texto dentro de la lamina", 100, 100);//metodo que se utiliza para escribir un texto en la coordenada citada
		
		//Font mifuente=new Font("Arial", Font.BOLD, 24);//creo un objeto de tipo font pasandole los siguientes parametros
		
		//g2.setFont(mifuente);//utilizo el metodo setfont
		
		//g2.setColor(Color.BLUE);//este metodo establece color de fuente a la lamina
		
		//g2.drawString("Jose", 100, 100);//este metodo escribe el string en esas coordenadas
		
		//g2.setFont(new Font("Courier", Font.ITALIC, 16));//creo un objeto de tipo font pasandole los siguientes parametros y a la vez utilizo el metodo setfont para que se utilicen la funtes del objeto
		
		//g2.setColor(new Color(128,90,50));//este metodo establece color de fuente a la lamina
		
		//g2.drawString("Curso de Java", 100, 200);//este metodo escribe el string en esas coordenadas
		
	}
	
	private Image imagen2;//variable privada de tipo image
}