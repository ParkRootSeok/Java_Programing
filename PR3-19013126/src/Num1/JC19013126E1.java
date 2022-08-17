package Num1;
import java.awt.*;
import javax.swing.*;

public class JC19013126E1 extends JFrame{

	private JLabel[] la = new JLabel[20];
	
	public JC19013126E1() {
		
		setTitle("PR3-E1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // 배치 관리자 삭제
		
		for (int i = 0; i < la.length ; i++) {
			
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 200) + 50;
			
			la[i] = new JLabel();
			la[i].setLocation(x , y);
			la[i].setSize(10, 10);
			la[i].setBackground(Color.BLUE);
			la[i].setOpaque(true);
			c.add(la[i]);
			
		}
		
		setSize(400, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JC19013126E1();
	}
	
}
