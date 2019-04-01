package jraphics;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {
		//Creation of a Frame
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame =  new JFrame("Graphics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setSize(500,500);
		
		//Adding a Panel to the Frame
		Jraphics jraphics = new Jraphics();
		frame.add(jraphics);
		frame.setVisible(true);
		
		//Creation of a Mesh from an .obj file and its projection using a projection matrix
		jraphics.meshCube = new Mesh();
		jraphics.meshCube.loadFromObject("D:\\Blender\\chess.obj");
		jraphics.matProj = jraphics.MatrixMakeProjection(90.0, (double)jraphics.getSize().width / (double)jraphics.getSize().height, 0.1, 1000.0);
		
		//Main loop that keeps painting the screen and calculating the "rotation angle"
		jraphics.gameLoop();	
	}
}