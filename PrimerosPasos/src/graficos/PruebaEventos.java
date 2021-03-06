package graficos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones miMarco=new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
		
		setBounds(300,300,600,400);
		
		setTitle("Botones y Eventos..");
		
		Toolkit icono=Toolkit.getDefaultToolkit();
		
		Image Icono=icono.getImage("imagenes/icono.png");
		
		setIconImage(Icono);
		
		LaminaBotones milamina=new LaminaBotones();
		
		add(milamina);
	}	
	
}

class LaminaBotones extends JPanel {
	
	JButton botonAzul=new JButton("Azul");//creamos un objeto de tipo jbutton con texto azul
	JButton botonNegro=new JButton("Negro");//creamos un objeto de tipo jbutton con texto negro
	JButton botonRojo=new JButton("Rojo");//creamos un objeto de tipo jbutton con texto rojo
	JButton botonVerde=new JButton("Verde");//creamos un objeto de tipo jbutton con texto verde
	JButton botonGris=new JButton("Gris");//creamos un objeto de tipo jbutton con texto gris
		
	public LaminaBotones(){///metodo constructor de la lamina
			
		add(botonAzul);//agregamos el objeto de tipo jbutton al metodo constructor de la lamina
		add(botonNegro);
		add(botonRojo);
		add(botonVerde);
		add(botonGris);
		//setBackground(Color.cyan);
		
		colorFondo azul=new colorFondo(Color.BLUE);
		colorFondo negro=new colorFondo(Color.black);
		colorFondo rojo=new colorFondo(Color.red);
		colorFondo verde=new colorFondo(Color.GREEN);
		colorFondo gris=new colorFondo(Color.gray);
		
		botonAzul.addActionListener(azul);//utilizamos el metodo addactionlistener, 
		//y entre parentesis indicamos el obgeto que tiene que estar a la escucha del 
		//en esta linea estan los tres elementos que intervienen en el evento
		//1er elemento actions, que es lo mismo que decirle: al hacer click
		//2do elemento objeto que desencadena el evento: el boton azul, objeto fuente
		//2er elemento listener, el oyente (el cual es una instancia de una clase de tipo colordefondo) 
		//que es el objeto que recibe el evento
		
		botonNegro.addActionListener(negro);
		botonRojo.addActionListener(rojo);
		botonVerde.addActionListener(verde);
		botonGris.addActionListener(gris);
		

					
	}
		
//	public void actionPerformed(ActionEvent e){//creamos el metodo actionperformed, este metodo pertenece a la interfaz agregada
//		//que indica que es lo que se tiene que hacer cundo ocurra el evento
//		
//		Object botonPulsado=e.getSource();
//		
//		System.out.println(botonPulsado);
//		
//		Color fondo=this.getBackground();
//		
//		if(botonPulsado==botonAzul){
//		
//		if(fondo == Color.cyan){
//		
//			System.out.println(fondo);
//			setBackground(Color.blue);//el evento como tal es cambier el color del background
//	
//		}
//		
//		else{
//			
//			System.out.println(fondo);
//			setBackground(Color.CYAN);
//		}
//		
//		}
//		
//		else if(botonPulsado==botonNegro){
//			
//			setBackground(Color.black);
//		}
//		
//		else if(botonPulsado==botonRojo){
//			
//			setBackground(Color.red);
//		}
//		
//		else if(botonPulsado==botonVerde){
//			
//			setBackground(Color.GREEN);
//		}
//		
//		else{
//			
//			setBackground(Color.gray);
//		}		
//		
//	}
	
private class colorFondo implements ActionListener{//esta es la clase listener que recibira el evento, clase privada de la lamina
		
		public colorFondo(Color c){//este metodo constructor de la clase recibe como paremetros un objeto de tipo color
			
			colorDeFondo=c;//en la variable colordefondo se almacena el color que le pasamos al constructor
			
		}
		
		public void actionPerformed(ActionEvent e){//esto es lo que se ejecuta cuando se produce el evento
			
			setBackground(colorDeFondo);//se cambia el color de fondo de la lamina por el color que le especificamos al momento
			//de construir el metodo
			
			Object botonPulsado=e.getSource();//
			Toolkit.getDefaultToolkit().beep(); //esta metodo ejecuta un bip
			System.out.println(botonPulsado);
		}
		
		
		
		private Color colorDeFondo;//principio de encapsulacion, variable privada, solo se puede editar dentro de esta clase
	}
		
}


