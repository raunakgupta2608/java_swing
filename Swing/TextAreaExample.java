import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TextAreaExample  
{  
	public static void main(String args[])  
	{  
		new TextAreaExample();
	//	TextAreaExample ex =new TextAreaExample();
		JFrame f= new JFrame();  
        JTextArea area=new JTextArea("");  
        area.setBounds(10,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true); 

		Container c = f.getContentPane();
		c.setBackground(Color.RED);

		//Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		//btn.setCursor(cur);
		
		JLabel l1;  
		l1=new JLabel("Comment About The Movie");  
		l1.setBounds(50,50, 100,30);  
		//c.add(l1);
		//Font fo =new Font("Serif",Font.ITALIC,20);
		//l1.setFont(fo);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} 
