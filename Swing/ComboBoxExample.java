import javax.swing.*;    
import java.awt.event.*; 
import java.awt.*;   
public class ComboBoxExample 
{    
	JFrame f;    
	ComboBoxExample()
	{    
		f=new JFrame("Now Showing");   
		final JLabel label = new JLabel();          
		label.setHorizontalAlignment(JLabel.CENTER);  
		label.setSize(400,100);  
		JButton b=new JButton("Show");  
		b.setBounds(200,100,75,20);  
		String languages[]={"3IDIOTS","WELCOME","GROWN UPS","SINISTER","GANGS OF WASSEYPUR"};        
		final JComboBox cb=new JComboBox(languages);    
		cb.setBounds(50, 100,90,20);    
		f.add(cb); f.add(label); f.add(b);    
		f.setLayout(null);    
		f.setSize(350,350);    
		f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		//Container c = f.getContentPane();
		//c.setBackground(Color.YELLOW);
		//c.add(label);
		
		//Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		//btn.setCursor(cur);
		
    b.addActionListener(new ActionListener() 
	{  
        public void actionPerformed(ActionEvent e)
		{       
			String data = "Movie Selected: "+ cb.getItemAt(cb.getSelectedIndex());  
			label.setText(data);  
		}  
	});           
}    
public static void main(String[] args) 
{    
    new ComboBoxExample();         
}    
}  
