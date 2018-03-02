package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente=new DameLaHora(); //instancia perteneciente a la clase damelahora la instancia se llama oyente
		
		Timer mitemporizador=new Timer(5000, oyente); //instancia de la clase timer llamada mitemporizador, el constructor me pide un entero en milisegundos y un obgeto de tipo actionlistener
		
		mitemporizador.start();//se utiliza el metodo .start de la clase timer, la cual la instancie en el obgeto mitemporizador
		//metodo start de la calse timer ejecuta el metodo oyente de acorde a la cantidad de milisegundos asignados
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");//ventana JOptionPane me sale un ventana con un mensage y el boton ok
		
		System.exit(0);//fin de ejecucion del metodo main

	}

}

class DameLaHora implements ActionListener{ //creo una clase llamada DameLaHora, esta clase implementa la interfaz ActionListener, un objeto de tipo actionlistener es requisito para usar la clase timer
	
	public void actionPerformed(ActionEvent e){//creo el metodo el cual recive como parametro un objeto e de tipo ActionEvent
		
		Date ahora=new Date();//creo una instancia de la clase Date
		
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);//imprimo en pantalla el mensage mas la instancia de la clase date
		
		Toolkit.getDefaultToolkit().beep(); //esta metodo ejecuta un bip
		
	}
	
}