import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Book
{
	public static void main(String[] args)
	{
		JFrame f= new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(10,100,1000,500);
		
		Container c = f.getContentPane();
		c.setLayout(null);
		
		ImageIcon icon =new ImageIcon("3.jpg");
		JLabel label =new JLabel(icon);
		
		label.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
		
		String languages[]={"BHANDUP","MULUND","THANE","CST"};        
		final JComboBox cb=new JComboBox(languages);    
		cb.setBounds(100,500,100,20);    
		f.add(cb);
		
		String lang[]={"RECLINER","NORMAL","VIP"};        
		final JComboBox cb1=new JComboBox(lang);    
		cb1.setBounds(250,500,100,20);    
		f.add(cb1);
		
		String lan[]={"A","B","C","D","E","F","G","H"};        
		final JComboBox cb2=new JComboBox(lan);    
		cb2.setBounds(400,500,50,20);    
		f.add(cb2);
		
		JLabel label1 =new JLabel("NO OF SEATS :");
		label1.setBounds(500,500,100,20);
		
		JTextArea area=new JTextArea("");  
        area.setBounds(601,500,20,20);
		area.setBackground(Color.YELLOW);
        f.add(area);  
		
		JButton b=new JButton("BOOK");  
		b.setBounds(650,500,100,20);
		f.add(b);
		
		c.add(label);
		c.add(label1);
	}
	
}