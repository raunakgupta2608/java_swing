import java.awt.event.*;  
import javax.swing.*;    
import java.awt.*;
public class ButtonExample 
{
	public static void main(String[] args) 
	{  
		JFrame f=new JFrame("Button Example");  
		final JTextField tf=new JTextField();  
		tf.setBounds(70,70, 170,20);  
		JButton b=new JButton(new ImageIcon("/home/dbit/Pictures/Untitled Folder/icon-1691392_960_720.png"));  
		b.setBounds(50,100,95,30);  
		b.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{	
            tf.setText("Welcome to BookMyShow");  
			}  
		});  
		
		//Font fo = new Font("Arial".Font.BOLD,25);
		//b.setFont(fo);
		//b.setBackground(Color.YELLOW);
		//b.setForeground(Color.RED);
		
		//Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		//btn.setCursor(cur);
		
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Container c = f.getContentPane();
	//c.setBackground(Color.RED);
	
	}  
}  
