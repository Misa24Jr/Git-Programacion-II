package graficos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiMarco myClass = new MiMarco();
		myClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}


class MiMarco extends JFrame{
	
	public MiMarco(){
		
		setBounds(500,500,550,250);
		setResizable(false);
		setTitle("Mi primera ventana");
		setVisible(true);
	}

	
}

