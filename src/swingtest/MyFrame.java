package swingtest;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		this.setTitle("Swing Test"); // Sätter titel på program
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x blir exit application och terminate
		this.setResizable(false); // Hindrar resize
		this.setSize(400,400); // Definierar x och y dimesioner för this (Pixlar)
		this.setVisible(true); // Gör this synlig
		
		ImageIcon image = new ImageIcon("icon.png");
		
		this.setIconImage(image.getImage()); // Ändrar ikonen av this
		this.getContentPane().setBackground(new Color(0,180,0)); // Ändra bakgrundsfärg (också 0xFFFFFF)
	}
	
}
