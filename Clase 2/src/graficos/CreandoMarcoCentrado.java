package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado marco = new MarcoCentrado();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setTitle("Computacion Grafica");
	}

}

class MarcoCentrado extends JFrame {
	public MarcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla = miPantalla.getScreenSize();
		int altura = tamanioPantalla.height;
		int ancho = tamanioPantalla.width;
		
		setSize(ancho/2, altura/2);
		setLocation(ancho/4, altura/4);
		
		Image miIcono = miPantalla.getImage("image.png");
		setIconImage(miIcono);
				
	}
}