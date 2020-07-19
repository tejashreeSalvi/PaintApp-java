package paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.*;
import javax.swing.border.Border;

import org.omg.Messaging.SyncScopeHelper;

public class paint extends JFrame implements MouseListener,MouseMotionListener{
	
	public Graphics g;
	int i = 0 ;
	int size = 7;
	public Color color = new Color(0,0,0);
	public JPanel pback,p1,p2;
	public JScrollPane scrollpane;
	public JTabbedPane tpane;
	public JPanel pfile,phome,pview;
	public JButton editColors;
	public JButton pencil,eraser,fillcolor,picker,magnifier,text;
	public JButton c1,c2,c3,red,black,orange,yellow,cyan,brown,green,gray,purple,gold,blue,lightred;
	public JButton voice;
	public paint()
	{
		setVisible(true);
		setSize(1366,768);
		setBackground(Color.WHITE);
		setTitle("Paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//panel background
		pback = new JPanel();
		pback.setLayout(new BorderLayout());
		pback.setVisible(true);
		add(pback);
		
		//Drawing sheet
		p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		p2.setPreferredSize(new Dimension());
		p2.addMouseListener(this);
		p2.addMouseMotionListener(this);
		p2.setVisible(true);
		pback.add(p2,BorderLayout.CENTER);
		
		//upper panel
		p1 = new JPanel();
		p1.setBackground(new Color(240,240,240));
		p1.setPreferredSize(new Dimension(50,90));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.setVisible(true);
	
		JPanel p11 = new JPanel();
		p11.setVisible(true);
		p11.setLayout(new GridLayout(3,5,3,3));

		red = new JButton();
		red.setBackground(Color.red);
		red.setVisible(true);
		red.addMouseListener(this);
		p11.add(red);


		yellow = new JButton();
		yellow.setBackground(Color.yellow);
		yellow.setVisible(true);
		yellow.addMouseListener(this);
		p11.add(yellow);


		cyan = new JButton();
		cyan.setBackground(Color.cyan);
		cyan.setPreferredSize(new Dimension(4,25));
		cyan.setVisible(true);
		cyan.addMouseListener(this);
		p11.add(cyan);
		

		orange = new JButton();
		orange.setBackground(new Color(255,153,0));
		orange.setPreferredSize(new Dimension(4,25));
		orange.setVisible(true);
		orange.addMouseListener(this);
		p11.add(orange);
		
		black = new JButton();
		black.setBackground(Color.black);
		black.setVisible(true);
		black.addMouseListener(this);
		p11.add(black);
		
		//red,black,orange,yellow,cyan,brown,green,gray;
	
		brown = new JButton();
		brown.setBackground(new Color(153,102,0));
		brown.addMouseListener(this);
		brown.setVisible(true);
		p11.add(brown);
		
		green = new JButton();
		green.setBackground(Color.green);
		green.addMouseListener(this);
		green.setVisible(true);
		p11.add(green);
		
		gray = new JButton();
		gray.setBackground(Color.gray);
		gray.addMouseListener(this);
		gray.setVisible(true);
		p11.add(gray);
		
		//purple,gold,blue,light_red
	
		purple = new JButton();
		purple.setBackground(new Color(102,0,153));
		purple.addMouseListener(this);
		p11.add(purple);
		
		gold = new JButton();
		gold.setBackground(new Color(255,204,51));
		gold.addMouseListener(this);
		p11.add(gold);
	

		blue = new JButton();
		blue.setBackground(Color.blue);
		blue.addMouseListener(this);
		p11.add(blue);
	

		lightred = new JButton();
		lightred.setBackground(new Color(255,102,102));
		lightred.addMouseListener(this);
		p11.add(lightred);

		c1 = new JButton();
		c1.setBackground(new Color(240,240,240));
		c1.addMouseListener(this);
		p11.add(c1);
		
		c2 = new JButton();
		c2.setBackground(new Color(240,240,240));
		c2.addMouseListener(this);
		p11.add(c2);
		
		c3 = new JButton();
		c3.setBackground(new Color(240,240,240));
		c3.addMouseListener(this);
		p11.add(c3);
		/////************************second panel******************
		
		JPanel p12 = new JPanel();
		p12.setVisible(true);
		editColors = new JButton("Edit Colors");
		editColors.revalidate();
		editColors.setMargin( new Insets(48, 3, 3, 3) );
		editColors.setFont(new Font("Arial", Font.LAYOUT_NO_LIMIT_CONTEXT, 15));
		editColors.addMouseListener(this);
		editColors.setVisible(true);
		p12.add(editColors);
		
		
		//tools
		//ImageIcon icon = new ImageIcon("C:\\Tuition Java\\Project\\pencil1.png");
		JPanel p13 = new JPanel();
		p13.setLayout(new GridLayout(2,3,3,3));
		p13.setVisible(true);
		
		pencil = new JButton("pencil");
		pencil.setVisible(true);
		pencil.setPreferredSize(new Dimension(20,39));
		pencil.addMouseListener(this);
		p13.add(pencil);
		
		eraser = new JButton("eraser");
		eraser.setVisible(true);
		eraser.addMouseListener(this);
		p13.add(eraser);
		
		fillcolor = new JButton("fillcolor");
		fillcolor.setVisible(true);
		fillcolor.addMouseListener(this);
		p13.add(fillcolor);
		
		text = new JButton("text");
		text.setVisible(true);
		text.addMouseListener(this);
		p13.add(text);
		
		picker = new JButton("picker");
		picker.setVisible(true);
		picker.addMouseListener(this);
		p13.add(picker);
		
		magnifier = new JButton("magnifier");
		magnifier.setVisible(true);
		magnifier.addMouseListener(this);
		p13.add(magnifier);
		
		JPanel p14 = new JPanel();
		p14.setVisible(true);
		p14.setBackground(Color.blue);
		
		JPanel p15 = new JPanel();
		p15.setVisible(true);
		p15.setBackground(Color.green);
		
		JPanel p16 = new JPanel();
		p16.setVisible(true);
		voice = new JButton("Voice Paint");
		voice.setMargin( new Insets(48, 3, 3, 3) );
		voice.setFont(new Font("Arial", Font.LAYOUT_NO_LIMIT_CONTEXT, 15));
		voice.addMouseListener(this);
		p16.add(voice);
		
		
		//p11 i.e. color panel add to p1(upper panel)
		p1.add(p11);
		p1.add(p12);
		p1.add(p13);
		p1.add(p14);
		p1.add(p15);
		p1.add(p16);
		
		pback.add(p1,BorderLayout.NORTH);
	
		//ScrollBar
		scrollpane = new JScrollPane();
		scrollpane.setVisible(true);
		scrollpane.setSize(50,50);
		add(scrollpane);		
	}
	
	public static void main(String[] args) 
	{
		new paint();
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		if(me.getSource() == editColors)
		{
			
			g = getContentPane().getGraphics();
			Color initialcolor=Color.RED;    
			Color col=JColorChooser.showDialog(this,"Select a color",initialcolor);    
			System.out.println("Color :"+col);
			if(i == 0)
			{
				c1.setBackground(col);
				i++;
			}
			else if(i == 1)
			{
				c2.setBackground(col);
				i++;	
			}
			else
			{
				c3.setBackground(col);
			}
				
		}
		
		if(me.getSource() == orange)
		{
			color = orange.getBackground();
		}
		
		if(me.getSource()== cyan)
		{
			color = cyan.getBackground();
		}
		
		if(me.getSource() == red)
		{
			color = red.getBackground();
		}

		if(me.getSource() == yellow)
		{
			color = yellow.getBackground();
		}

		if(me.getSource() == black)
		{
			color = black.getBackground();
		}

		if(me.getSource() == brown)
		{
			color = brown.getBackground();
		}

		if(me.getSource() == orange)
		{
			color = orange.getBackground();
		}

		if(me.getSource() == gray)
		{
			color = gray.getBackground();
		}

		if(me.getSource() == green)
		{
			color = green.getBackground();
		}

		if(me.getSource() == purple)
		{
			color = purple.getBackground();
		}

		if(me.getSource() == gold)
		{
			color = gold.getBackground();
		}

		if(me.getSource() == blue)
		{
			color = blue.getBackground();
		}

		if(me.getSource() == lightred)
		{
			color = lightred.getBackground();
		}
		
		if(me.getSource() == c1)
		{
			color = c1.getBackground();
			if(color == new Color(240,240,240)){
				color = black.getBackground();
			}
		}
		
		if(me.getSource() == c2)
		{
			color = c2.getBackground();
			if(color == new Color(240,240,240))
			{
				color = Color.black;
			}
		}
		
		if(me.getSource() == c3)
		{
			color = c3.getBackground();
			if(color == new Color(240,240,240))
			{
				color = Color.black;
			}
		}
		
		if(me.getSource() == eraser)
		{
			color = Color.white;
		}
		
		if(me.getSource() == pencil)
		{
			color = Color.BLACK;
		}
		
		if(me.getSource() == fillcolor)
		{
			p2.setBackground(color);
		}
		
		if(me.getSource() == voice)
		{
			dispose();
			new VoicePaint();
		}
	}

	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == p2)
		{
			g = getContentPane().getGraphics();
			g.setColor(color);
			int x = e.getX();
			int y = e.getY();
			System.out.println(x+" "+y);
			if(x>19 && y>30)
			{
				 g.fillOval(x+0,y+75,7,7);
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
