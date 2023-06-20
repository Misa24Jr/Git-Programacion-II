package graficos;
import javax.swing.*;


public class CreandoMarcos {

	public static void main(String[] args) {
		
		MiMarco marco1 = new MiMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MiMarco extends JFrame {
	
	public MiMarco() {
		
		setBounds(500,300,550,250);
		setTitle("Mi primera ventana");
//		setResizable(true);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
}
