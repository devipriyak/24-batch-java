import javax.swing.*;
import java.awt.FlowLayout;
class SwingDemo 
{
	public static void main(String args[])
	{
		JButton b1,b2;
		JTextField t1,t2;
		JLabel l1,l2;
		//create object for Frame
		JFrame f=new JFrame();
		//set title
		f.setTitle("My III SEM CSE-A");
		f.setLayout(new FlowLayout());
		//create objects
		l1=new JLabel("Name");
		l2=new JLabel("Dept");
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("SUBMIT");
		b2=new JButton("Reset");
		//add componets to Frame using add()
		f.add(l1);//label added
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		//visible frame to user by setVisible(true);
		f.setVisible(true);
	}//main 
	}//class
		
		
		