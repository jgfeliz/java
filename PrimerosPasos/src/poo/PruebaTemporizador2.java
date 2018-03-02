package poo;

import javax.swing.*;

import javax.swing.Timer;

import java.util.*;

import java.awt.Toolkit;

import java.awt.event.*;

public class PruebaTemporizador2 { //creo la clase

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reloj mireloj=new reloj(3000, true); 
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "pulsa ok para cancelar");
		
		System.exit(0);
		
	}

}

class reloj {//creo la clase reloj
	
	public reloj(int intervalo, boolean sonido){//metodo constructor de la clase, recibe como parametros un entero y un boolean
		
		this.intervalo= intervalo;//con el this hacemos referencia a las variable abajo mencionadas 
		//y el = hace referencia a los parametros que le pasamos al instanciar el metodo constructor
		//de tal forma los datos que se pasan en el metodo son las variables de clase
		
		this.sonido= sonido;
	}
	
	public void enMarcha(){//metodo que se encarga de poner en marcha el timer y el mensage, en este caso es la hora
		
		ActionListener oyente=new DameLaHora2();//el metodo timer nos exije que tenemos que implementar la interfaz ActionListener
		//en este caso creo un objeto llamado oyente que es igual a una nueva instancia de la clase damelahora2
		
		Timer mitemporizador=new Timer(intervalo, oyente);//instancia de la clase timer, 
		//la clase exige que se le pase como paremetros un objeto de tipo entero y un objeto de tipo actionlistener
		
		mitemporizador.start();//el objeto de tipo timer utiliza el metodo heredado start
	}
	
	private int intervalo;
	
	private boolean sonido;
	
	private class DameLaHora2 implements ActionListener{//clase interna damelahora2 la cual implementa la interfax actionlistener
		
		public void actionPerformed(ActionEvent evento){//este es el unico metodo que hay que implementer de la interfaz actionlistener
			//lo siguiente es el evento que se desencadena cada ves que se cumpla e tiempo del temporizador
			Date hora=new Date();//se crea un objeto de tipo date
			
			System.out.println("la hora del sistema es: " + hora);
			
			if(sonido){//se evalua el valor de la variable booleana, no es necesario realizar comparacion en las variables booleanas
				
				Toolkit.getDefaultToolkit().beep(); //esta metodo ejecuta un bip
			}
		}
		
	}
}
