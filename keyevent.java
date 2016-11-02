package gui;

import java.awt.*;////layout
import java.awt.event.*;///contains ActionListener,ActionEvent
import javax.swing.*;     /////

public class Gui extends JFrame {//Jframe is Window
	
	private JLabel a;
	private JTextField b;
	private JTextArea c;
	
	public Gui(){
		super("tilte");
		setLayout(new FlowLayout());
		
		a=new JLabel("Enter :");
		add(a);
		b=new JTextField("",20);
		add(b);
		b.setEditable(true);
		c=new JTextArea(5,40);
		add(c);

		thehandler handler=new thehandler();
		b.addKeyListener(handler);///////////////
		
		
	}
	
	private class thehandler implements KeyListener{///notice extends
		
		@Override
		public void keyTyped(KeyEvent event){
			

		}
		@Override
		public void keyReleased(KeyEvent event){
			String x=b.getText();
			c.setText("You typed "+x);
		}
		@Override
		public void keyPressed(KeyEvent event){

		}
	}

}


///////////////////////////////////////////OR////////////////////
package gui;

import java.awt.*;////layout
import java.awt.event.*;///contains ActionListener,ActionEvent
import javax.swing.*;     /////

public class Gui extends JFrame implements KeyListener {//Jframe is Window
	
	private JLabel a;
	private JTextField b;
	private JTextArea c;
	
	public Gui(){
		super("tilte");
		setLayout(new FlowLayout());
		
		a=new JLabel("Enter :");
		add(a);
		b=new JTextField("",20);
		add(b);
		b.setEditable(true);
		c=new JTextArea(5,40);
		add(c);

		b.addKeyListener(this);///////////////
		
		
	}
	
		@Override
		public void keyTyped(KeyEvent event){
			

		}
		@Override
		public void keyReleased(KeyEvent event){
			String x=b.getText();
			c.setText("You typed "+x);
		}
		@Override
		public void keyPressed(KeyEvent event){

		}
}
	

	



