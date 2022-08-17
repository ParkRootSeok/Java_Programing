import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JC19013126Q08 extends JFrame {
	 
	public JC19013126Q08() {
		setTitle("JTextField and JComBobox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> cb = new JComboBox<String>();
		
		JTextField tf = new JTextField(15);
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				cb.addItem(t.getText());
				t.setText("");
			}
			
		});
		
		c.add(tf);
		c.add(cb);
		
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JC19013126Q08();
	}
	

}
