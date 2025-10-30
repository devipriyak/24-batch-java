import java.awt.*;
class FrameDemo 
{
	public static void main(String args[])
	{
		Button b1,b2;
		TextField t1,t2;
		Label l1,l2;
		//create object for Frame
		Frame f=new Frame();
		//set title
		f.setTitle("My III SEM CSE-A");
		f.setLayout(new FlowLayout());
		f.setBounds(400,400,400,400);
		//create objects
		l1=new Label("Name");
		l2=new Label("Dept");
		t1=new TextField(20);
		t2=new TextField(20);
		b1=new Button("SUBMIT");
		b2=new Button("Reset");
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
		
		
		