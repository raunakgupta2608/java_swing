import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class LoginForm extends JFrame
{
	Container c;
	JLabel userlabel=new JLabel("Username");
	JLabel passlabel=new JLabel("Password");
	
	JTextField user_tf=new JTextField();
	JPasswordField pass_pf=new JPasswordField();
	
	JButton login_btn=new JButton("Login");
	
	LoginForm()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		
		userlabel.setBounds(100,50,100,40);
		passlabel.setBounds(100,50,100,40);
		
		Font f=new Font("Arial",Font.BOLD,20);
		
		userlabel.setFont(f);
		passlabel.setFont(f);
		
		user_tf.setBounds(250,50,150,40);
		pass_pf.setBounds(250,50,150,40);
		login_btn.setBounds(350,250,200,50);
		
		c.add(userlabel);
		c.add(passlabel);
		c.add(user_tf);
		c.add(pass_pf);
		c.add(login_btn);
		
	}
}

class LoginFormDemo
{
	public static void main(String[] args)
	{
		LoginForm f=new LoginForm();
		Container c = f.getContentPane();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,700,500);
	}
}