package gui;

import java.awt.*;////layout
import java.awt.event.*;///contains ActionListener,ActionEvent
import javax.swing.*;     /////

public class Gui extends JFrame {//Jframe is Window
	
	private JLabel a;
	private JTextField b;
	private JLabel c;
	private JTextField d;
	
	public Gui(){
		super("tilte");
		setLayout(new FlowLayout());
		
		a=new JLabel("X :");
		add(a);
		b=new JTextField("",10);
		add(b);
		b.setEditable(false);
		
		c=new JLabel("Y :");
		add(c);
		d=new JTextField("",10);
		add(d);
		d.setEditable(false);
		
		thehandler handler=new thehandler();
		addMouseListener(handler);///////////////
		
		
	}
	
	private class thehandler extends MouseAdapter{///notice extends
		
		public void mouseClicked(MouseEvent event){
			
			b.setText(event.getX()+"");
			d.setText(event.getY()+"");
		}
	}
	

	


}
