package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFoco focoventana=new MarcoFoco();
		focoventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		focoventana.setVisible(true);
	}

}


class MarcoFoco extends JFrame{
	
	public MarcoFoco(){
		
		setBounds(400,400,600,400);
		setTitle("Titulos del marco...");
		Toolkit icono4=Toolkit.getDefaultToolkit();
		Image logo4=icono4.getImage("imagenes/icono.png");
		setIconImage(logo4);
		add(new LaminaFoco());//instanciacion dentro de argumento necesario
		
	}
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		setLayout(null);//desabilitamod el layou, con esto conseguimos 
		//colocar los elementos en la lamina donde nosotros queramos y no donde java lo defina
		
	}
}