package paint;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class VoicePaint extends JFrame implements ActionListener{
	
	Graphics g;
	JPanel p1,pleft,pright;
	JButton b1,b2,b3,b4,b5,b6;
	public VoicePaint()
	{
		setVisible(true);
		setSize(1366,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.DARK_GRAY);
		setForeground(Color.CYAN);
		setTitle("Voice Paint");
		//background
		p1 = new JPanel();
		p1.setBackground(new Color(240,240,240));
		
		pleft = new JPanel();
		pleft.setBackground(Color.white);
		pleft.addAncestorListener(null);
		pleft.setPreferredSize(new Dimension(900,700));
		
		pright = new JPanel();
		pright.setBackground(new Color(240,240,240));
		pright.setPreferredSize(new Dimension(380,700));
		pright.setLayout(new GridLayout(3,2,9,8));
		
		b1 = new JButton("rect");
		b1.addActionListener(this);
		pright.add(b1);
		
		b2 = new JButton("Voice Icon");
		b2.addActionListener(this);
		pright.add(b2);
		
		
		b3 = new JButton("tri");
		b3.addActionListener(this);
		pright.add(b3);
		
		b4 = new JButton("circle");
		b4.addActionListener(this);
		pright.add(b4);
		
		
		b5 = new JButton("polygon");
		b5.addActionListener(this);
		pright.add(b5);
		
		b6 = new JButton("oval");
		b6.addActionListener(this);
		pright.add(b6);
			
		p1.add(pleft);
		p1.add(pright);
		add(p1);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("HelloWorld!!!");
		if(e.getSource() == "rect")
		{
			System.out.println("Welcome !!!!");
			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
			g.drawRect(0,0,10,20);
			System.out.println("Bye!!!");
		}
		
		if(e.getSource() == "tri")
		{
			
			
		}
		
		if(e.getSource() == "circle")
		{
			
		}
		
		if(e.getSource() == "oval")
		{
			
		}
		
		if(e.getSource() == "polygon")
		{
			
		}
		
		
		
		
	}
	public static void main(String args[])
	{
		new VoicePaint();
	}
}
