package graficos;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//este metodo indica que hacer cuando cerramos el marco
		
		mimarco.setBackground(Color.BLACK);


	}

}

class MarcoConDibujos extends JFrame{//creo la clase marcocondibujo y heredo(extends) la clase jframe
	
	public MarcoConDibujos(){
						
		setTitle("Prueba de Dibujo");
		
		//setSize(400,400);
			
		Toolkit mipantalla=Toolkit.getDefaultToolkit();//creo un objeto de tipo toolkit y contiene la informacion obtenida en el getdefaulttoolkit
		
		Dimension tamanoPantalla=mipantalla.getScreenSize();//creo un objeto de tipo dimension en el cual se almacena el tamano de la pantalla
		
		int alturaPantalla=tamanoPantalla.width;//creo variable que almacena la altura de la pantalla
		
		int anchoPantalla=tamanoPantalla.height;//creo variable que almacena el ancho de la pantalla
		
		setSize(alturaPantalla/2, anchoPantalla/2);//utilizo este metodo para establecer la altura y el ancho de la pantalla de la mitad de la pantalla donde se esta ejecutando
		
		setLocation(alturaPantalla/4, anchoPantalla/4);//uvico el marco justo en el medio de la pantalla
		
		//setTitle("este es el titulo del marco");//le agrego un titulo al marco
		
		Image miIcono=mipantalla.getImage("icono.png");//creo un objeto de tipo image y con el metodo getimage le indico que imagen tiene que almacenar en este objeto
		
		setIconImage(miIcono);//establesco el inoco que debe tener el marco	
		
		LaminaConFiguras milamina=new LaminaConFiguras();//creo un obgeto de tipo laminaconfiguras
		
		add(milamina);//agrego la lamina al marco
		
		
		
		//milamina.setBackground(Color.BLACK);//establezco el color de fondo de la lamina
			
		//milamina.setBackground(SystemColor.window);//con este metodo establecemos el color de fondo 
		//de la lamina a corde con el color del tema del sistema operativo
	}
}


class LaminaConFiguras extends JPanel{//creo la clase laminaconfigura y heredo(extends) la clase jpanel
	
	public void paintComponent(Graphics g){
		
		//Toolkit minimarco=Toolkit.getDefaultToolkit();
	
		//Dimension tamanomarco=minimarco.getScreenSize();
		
		//int alturamarco=tamanomarco.width;
		
		//int anchomarco=tamanomarco.height;
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;//refundicion la variable g es de tipo Graphics y la combertimos de tipo Graphics2D la cual ahora es el objeto g2
				
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);//utilizamos rectangle2d.double porque la clase rectangle2d es abstracta y no se puede instanciar directamente 
		//y esa clase hereda de rectangle2d 
		//esto es valido gracias al principio de sustitucion "es un" por el tema de la herencia, como la clase rectangle2d.double hereda de la clase rectangle2d 
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		//g2.draw(rectangulo);//usamos el objeto g2 y su metodo draw, pasandole por parametro un objeto que implemente la interfaz shape, 
		//la clase Rectangle2D impletenta la interfaz shape, por ende se le puede pasar como parametro
		
		//g.drawRect(20, 20, 200, 200);//este metodo me crea un cuadrado dentro del marco, 
		//pero este metodo pertenece a la clase Graphics la cual ha sido mejorada por la clase 
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color micolor=new Color(234,43,234);
		//los metodos brighter() y darker() aclaran u oscurecen los colores 
		g2.setPaint(micolor);
		//g2.setPaint(new Color(109,172,59));
		
		g2.fill(elipse);
		
		//g2.draw(new Line2D.Double(100,100,300,250));
		
		//double CentroenX=rectangulo.getCenterX();
		
		//double CentroenY=rectangulo.getCenterY();
		
		//Ellipse2D circulo=new Ellipse2D.Double();
		
		//circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+150, CentroenY+150);
		
		//g2.draw(circulo);
		
						
	}
}

