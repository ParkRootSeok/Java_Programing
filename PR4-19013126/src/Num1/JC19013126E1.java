package Num1;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class JC19013126E1 extends JFrame {
	
	// ��ư, ��
	private JRadioButton left = new JRadioButton("left", true); 
	private JRadioButton right = new JRadioButton("right"); 
	JLabel imagelabel = new JLabel();
	
	//�̹��� ����
	private Vector<ImageIcon> vc = new Vector<ImageIcon>();
	
	// �ε��� ����
	private int flag = -1;
	private int now = 0;
	
	public JC19013126E1() {
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���� ������
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel np = new JPanel();
		JPanel cp = new JPanel();
		cp.setLayout(new FlowLayout());
		
		c.add(np, BorderLayout.NORTH);
		c.add(cp, BorderLayout.CENTER);
		
		// ������ư �߰� �� ����.
		ButtonGroup grp = new ButtonGroup();
		grp.add(left);
		grp.add(right);
		
		left.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					if (left.isSelected()) flag = -1;
					else flag = 1;	
				}
			}
		});
		
		right.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					if (left.isSelected()) flag = -1;
					else flag = 1;	

				}
			}
		});
		
		np.add(left);
		np.add(right);
	
		// �̹��� ���� ����
		File dir = new File("images");
		File[] files = dir.listFiles();
		
		for(int i = 0 ; i < files.length ; i++) {
			vc.add(new ImageIcon(files[i].getPath()));
		}
		
		// �̹��� �� ����
		JLabel imagelabel = new JLabel(vc.get(0));
		imagelabel.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				now += flag;
				if (now < 0) now = vc.size() - 1;
				
				now %= vc.size();
				imagelabel.setIcon(vc.get(now));
			}
			
		});
		cp.add(imagelabel);
		
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JC19013126E1();
	}

}

