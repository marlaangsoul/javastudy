package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEx1 extends JFrame{

	public SwingEx1() {
		super("Titel:Hello Swing");
		getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("Welcome to Swing!!");
		getContentPane().add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
				
	}
	
	public static void main(String[] args) {
		SwingEx1 app = new SwingEx1();
		

	}

}
