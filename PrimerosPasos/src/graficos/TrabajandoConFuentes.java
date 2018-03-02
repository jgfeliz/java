package graficos;

import java.awt.*;

import javax.swing.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes letraFrame=new MarcoConFuentes();//creo un objeto de tipo marcoconfuentes
		
		letraFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//utilizo el metodo setdefaultcloseoperation para especificar que debe hacer cuando cierre la ventana

	}

}


class MarcoConFuentes extends JFrame{//creo la clase marcoconfuente y heredo(extends) la clase jframe
	
	public MarcoConFuentes(){//creo el metodo constructor de la clase con los siguientes parametros
		
		
		setVisible(true);//hago que el marco sea visible
		setTitle("Prueba con Fuentes");//le agrego titulo al marco
		setSize(400,400);//le doy un tamano al marco
		LaminaConFuentes milamina=new LaminaConFuentes();//creo un objeto de tipo laminaconfuentes
		add(milamina);//agrego la lamina al constructor de la clase marcoconfuentes
		milamina.setForeground(Color.GRAY);//establesco color a la fuente utilizada en el objeto de tipo laminaconfuentes
		
		Toolkit pantalla=Toolkit.getDefaultToolkit();//utilizado para poder ponerle icono al marco
		Image miIcono=pantalla.getImage("imagenes/icono.png");//creo un objeto de tipo image y 
		//con el metodo getimage le indico que imagen tiene que almacenar en este objeto
		setIconImage(miIcono);
	}
}

class LaminaConFuentes extends JPanel{////creo la clase laminaconfuente y heredo(extends) la clase jpanel
	
	public void paintComponent(Graphics g2){//se crea el metodo de tipo paintComponent, o sea se sobreescribe
		//pero se llama al metodo paintComponent de la clase padre con la palabra reservada super.
		//esto hace que el metodo paintComponent haga su funcion a la cual fue programada
		//y lo que le agregamos debajo
		
		super.paintComponent(g2);//agrego el metodo padre paintcomponent a mi objeto g2
		
		//g.drawString("texto dentro de la lamina", 100, 100);//metodo que se utiliza para escribir un texto en la coordenada citada
		
		Font mifuente=new Font("Arial", Font.BOLD, 24);//creo un objeto de tipo font pasandole los siguientes parametros
		
		g2.setFont(mifuente);//utilizo el metodo setfont
		
		//g2.setColor(Color.BLUE);//este metodo establece color de fuente a la lamina
		
		g2.drawString("Jose", 100, 100);//este metodo escribe el string en esas coordenadas
		
		g2.setFont(new Font("Courier", Font.ITALIC, 16));//creo un objeto de tipo font pasandole los siguientes parametros y a la vez utilizo el metodo setfont para que se utilicen la funtes del objeto
		
		//g2.setColor(new Color(128,90,50));//este metodo establece color de fuente a la lamina
		
		g2.drawString("Curso de Java", 100, 200);//este metodo escribe el string en esas coordenadas
		
	}
}