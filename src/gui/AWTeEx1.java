package gui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class AWTeEx1 {

	public static void main(String[] args) {
		Frame f = new Frame("Hello World");
		f.setLayout(new FlowLayout());
		Label label = new Label("Welcome to AWT!!");
		f.add(label);
		f.setSize(500,500); // 크기
		f.setVisible(true);
//		f.addWindowListener(new WindowCloseHandler());

//		class WindowCloseHandler extends WindowAdapter{
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}

		}

	}




	//			@Override
	//			public void windowOpened(WindowEvent e) {
	//				// TODO Auto-generated method stub
	//
	//			}
	//
	//			@Override
	//			public void windowIconified(WindowEvent e) {
	//				// TODO Auto-generated method stub
	//
	//			}
	//
	//			@Override
	//			public void windowDeiconified(WindowEvent e) {
	//				// TODO Auto-generated method stub
	//
	//			}
	//
	//			@Override
	//			public void windowDeactivated(WindowEvent e) {
	//				// TODO Auto-generated method stub
	//
	//			}
	//
	//			@Override
	//			public void windowClosing(WindowEvent e) {
	//				// TODO Auto-generated method stub
	//				System.exit(0);
	//
	//			}
	//
	//			@Override
	//			public void windowClosed(WindowEvent e) {
	//				// TODO Auto-generated method stub
	//
	//			}
	//
	//			@Override
	//			public void windowActivated(WindowEvent e) {
	//				// TODO Auto-generated method stub
	//
	//			}
	//		});
	//		