package Num2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JC19013126E2 extends JFrame {
	
	private JLabel la = new JLabel("C");
	
	public JC19013126E2() {
		
		setTitle("PR3-E2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		
		la.setLocation(100, 100);
		la.setSize(50, 50);
		c.add(la);
		
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

			Component c = (Component)e.getSource();
			
			int x = (int)(Math.random() * 300); 
			int y = (int)(Math.random() * 300) ;
			
			la.setLocation(x, y);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		new JC19013126E2();
	}

}
