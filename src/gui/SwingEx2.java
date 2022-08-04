package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx2 extends JFrame implements ActionListener{

	int index = 0;
	String[] msg = {"11111", "22222", "33333"};
	JButton button1 = new JButton("<<");
	JButton button2 = new JButton(">>");
	JButton button3 = new JButton("mag[0]");

	public SwingEx2() {
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		add(button1, BorderLayout.WEST);
		add(button1, BorderLayout.EAST);
		add(button1, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.setEnabled(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == button1) {
			index--;
		}else if (obj == button2) {
			index++;
		}

		if(index>2) {
			index = 0;
		}else if(index <0) {
			index = 2;
		}
		button3.setText(msg[index]);
	}

	public static void main(String[] args) {
		SwingEx2 app = new SwingEx2();

	}









}
