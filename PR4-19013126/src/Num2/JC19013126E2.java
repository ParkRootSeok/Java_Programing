package Num2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

class DrawThread implements Runnable {
	private JPanel p;
	private boolean flag = true;
	
	public DrawThread(JPanel p) {
		this.p = p;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	synchronized public void Start() {
		flag = true;
		this.notify();
	}
	
	synchronized public void Wait() {

		if(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	@Override
	public void run() {
		try { 
			synchronized (this) {
				wait();
			}
		} catch (InterruptedException ex) {
			return;
		}

		while(true) {
			try {
				Wait();
				p.repaint();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				return;
			}
		}
		
	}
	
}

class MyPanel extends JPanel {
	private int x, y, width, height;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		randomOval();
		g.fillOval(this.x, this.y, this.width, this.height);
	}
	
	public void randomOval() {
		this.x = (int)(Math.random() * this.getWidth());
		this.y = (int)(Math.random() * this.getHeight());
		this.width = (int)(Math.random() * (this.getWidth() / 2));
		this.height = (int)(Math.random() * (this.getHeight() / 2));
	}
}

public class JC19013126E2 extends JFrame {
	
	public JC19013126E2() {
		setTitle("Make Drawing to Start");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		MyPanel p = new MyPanel();
	
		DrawThread runnable = new DrawThread(p);
		Thread th = new Thread(runnable);
		
		p.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
				runnable.Start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				runnable.setFlag(false);
			}
		});
		c.add(p);
		
		setSize(400, 400);
		setVisible(true);
		th.start();
	}
	
	public static void main(String[] args) {
		new JC19013126E2();
	}
	
}
