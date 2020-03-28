import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LoginForm extends JFrame
{
	Container c;
	JLabel userlabel;
	JLabel passlabel;
	
	JTextField user_tf=new JTextField();
	JPasswordField pass_pf=new JPasswordField();
	
	JButton login_btn=new JButton("Login");
	
	LoginForm()
	{
		userlabel= new JLabel("Username");
		passlabel= new JLabel("Password");
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		
		userlabel.setBounds(10,20,150,30);
		passlabel.setBounds(50,50,150,30);
		
		Font f=new Font("Comic Sans MS",Font.ITALIC,20);
		
		userlabel.setFont(f);
		passlabel.setFont(f);
		
		user_tf.setBounds(150,20,150,30);
		pass_pf.setBounds(150,50,150,30);
		login_btn.setBounds(150,150,100,20);		

		c.add(userlabel);
		c.add(user_tf);
		c.add(passlabel);
		c.add(pass_pf);
		c.add(login_btn);
		
	}

	public static void main(String[] args)
	{
		LoginForm f1=new LoginForm();
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setBounds(100,50,700,500);
	}
}
