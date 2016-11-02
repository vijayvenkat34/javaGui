package gui;

import java.awt.*;////layout
import java.awt.event.*;///contains ActionListener,ActionEvent
import javax.swing.*;     /////

public class Gui extends JFrame {//Jframe is Window
	
	private JLabel a;
	private JTextField b;
	private JButton c;
	private static int i=0;
	
	public Gui(){
		super("tilte");
		setLayout(new FlowLayout());
		
		a=new JLabel("Count");
		add(a);
		
		b=new JTextField("0",10);
		add(b);
		b.setEditable(false);
		
		c=new JButton("Count");
		add(c);
		
		thehandler handler=new thehandler();
		c.addActionListener(handler);
		
		
	}
	
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			i++;
			b.setText(i+"");////paremeter should be in string 
		}
	}
	

	


}
