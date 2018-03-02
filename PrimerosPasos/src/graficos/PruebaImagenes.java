package graficos;

import java.awt.*;
import java.io.*;

import javax.swing.*;

import javax.imageio.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco=new MarcoImagen();//instancia de la clase marcoimagen
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//instruccion que indica que hacer cuando precionamos el boton de cerrar
		
	}

}

class MarcoImagen extends JFrame{//creo la clase marcoconfuente y heredo(extends) la clase jframe
	
	public MarcoImagen(){//creo el metodo constructor de la clase con los siguientes parametros
				
		setVisible(true);//hago que el marco sea visible
		
		setTitle("Marco Con Imagen...");//le agrego titulo al marco
		
		setBounds(600,300,600,600);//le doy un tamano al marco y una poscicion de origen
		
		LaminaConImagen milamina=new LaminaConImagen();//creo un objeto de tipo laminaconfuentes
		
		add(milamina);//agrego la lamina al constructor de la clase marcoconfuentes
		
		milamina.setForeground(Color.black);//establesco color a la fuente utilizada en el objeto de tipo laminaconfuentes
		
		Toolkit pantalla2=Toolkit.getDefaultToolkit();//utilizado para poder ponerle icono al marco
		
		Image miIcono2=pantalla2.getImage("imagenes/icono.png");//creo un objeto de tipo image y 
		//con el metodo getimage le indico que imagen tiene que almacenar en este objeto
		
		setIconImage(miIcono2);
	}
}

class LaminaConImagen extends JPanel{////creo la clase laminaconfuente y heredo(extends) la clase jpanel
	
	public void paintComponent(Graphics g){//se crea el metodo de tipo paintComponent, o sea se sobreescribe
		//pero se llama al metodo paintComponent de la clase padre con la palabra reservada super.
		//esto hace que el metodo paintComponent haga su funcion a la cual fue programada
		//y lo que le agregamos debajo
		
		super.paintComponent(g);//agrego el metodo padre paintcomponent a mi objeto g2
		
		//File miimagen=new File("imagenes/eclipse.png");//creo un objeto de tipo file
		//el constructor del objeto me pide que le pase como parametro un string en el cual especifique la ruta
		//donde se encuentre el file, es este caso es una imagen
		
		try{//manejo de ecepciones, con esta instruccion de indicamos que intente hacer esto, en caso de fallo que haga lo que dice el catch
			
			imagen=ImageIO.read(new File("imagenes/eclipse.png"));//con el metodo imageio indico que la imagen se encuentra en un 
			//objeto de tipo file, en este ejemplo instncio el objeto file dentro de los parametos que me pide
			
		}
		catch(IOException e){//manejo de ecepciones, en este caso esta es una ecepcion de tio ioexception
			//se ejecutara lo que se encuentra dentro de las llaves en caso de que falle el try
			
			System.out.println("la imagen no se encontro..");
		}
		
		g.drawImage(imagen, 5, 5, null);//con el metodo perteneciente a la clase graphics dibujamos el objeto de tipo imagen
		//y las cordenadas donde aparecera dentro del marco
		
		//g.drawString("texto dentro de la lamina", 100, 100);//metodo que se utiliza para escribir un texto en la coordenada citada
		
		//Font mifuente=new Font("Arial", Font.BOLD, 24);//creo un objeto de tipo font pasandole los siguientes parametros
		
		//g2.setFont(mifuente);//utilizo el metodo setfont
		
		//g2.setColor(Color.BLUE);//este metodo establece color de fuente a la lamina
		
		//g2.drawString("Jose", 100, 100);//este metodo escribe el string en esas coordenadas
		
		//g2.setFont(new Font("Courier", Font.ITALIC, 16));//creo un objeto de tipo font pasandole los siguientes parametros y a la vez utilizo el metodo setfont para que se utilicen la funtes del objeto
		
		//g2.setColor(new Color(128,90,50));//este metodo establece color de fuente a la lamina
		
		//g2.drawString("Curso de Java", 100, 200);//este metodo escribe el string en esas coordenadas
		
	}
	
	private Image imagen;//variable privada de tipo image
}