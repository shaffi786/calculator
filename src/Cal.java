import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 import javax.swing.*;
/* 
<applet code="Cal" width=300 height=300>
</applet>
*/
 
public class Cal extends  JFrame
implements ActionListener
{
    
    
        
   
	String msg=" ";
	int v1,v2,result;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,mul,div,clear,mod,EQ;
	char OP;
	Cal()
    {//public void init()
	
		Color k=new Color(120,89,90);
		setBackground(k);
		t1=new TextField(10);
		GridLayout gl=new GridLayout(4,5);
		setLayout(gl);
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		add=new Button("add");
		sub=new Button("sub");
		mul=new Button("mul");
		div=new Button("div");
		mod=new Button("mod");
		clear=new Button("clear");
		EQ=new Button("EQ");
		t1.addActionListener(this);
		add(t1);
		for(int i=0;i<10;i++)
		{
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
    
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	
    }
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
		t1.setText(t1.getText()+str);
		else
		if(str.equals("add"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='+';
			t1.setText("");
		}
		else if(str.equals("sub"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='-';
			t1.setText("");
		}
		else if(str.equals("mul"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='*';
			t1.setText("");
		}
		else if(str.equals("div"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='/';
			t1.setText("");
		}
		else if(str.equals("mod"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='%';
			t1.setText("");
		}
		if(str.equals("EQ"))
		{
			v2=Integer.parseInt(t1.getText());
			if(OP=='+')
				result=v1+v2;
			else if(OP=='-')
				result=v1-v2;
			else if(OP=='*')
				result=v1*v2;
			else if(OP=='/')
				result=v1/v2;
			else if(OP=='%')
				result=v1%v2;
			t1.setText(""+result);
		}	
		if(str.equals("clear"))
		{
			t1.setText("");
		}
        }

           public static void main(String args[])
    {
        Cal obj = new Cal();
        obj.setTitle("My swing frame");
        obj.setSize(400,400);
        obj.setVisible(true);
        
}
}
/*
package framedemo2;

import javax.swing.*;

class FrameDemo2 extends JFrame
{
    
    
    public static void main(String args[])
    {
        FrameDemo2 obj = new FrameDemo2();
        obj.setTitle("My swing frame");
        obj.setSize(400,400);
        obj.setVisible(true);
        
}
}*/