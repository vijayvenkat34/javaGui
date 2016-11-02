package gui;

import javax.swing.JFrame;

public class mainclass {

	public static void main(String[] args) {
		
	Gui g=new Gui();
	g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	g.setSize(275,180);///set size
	g.setVisible(true);

	}
}


///class gui

package gui;

import java.awt.*;////layout
import java.awt.event.*;
import javax.swing.*;     /////

public class Gui extends JFrame {
	
	private JLabel item1;
	
	public Gui(){
		super("Title");
		setLayout(new FlowLayout());////default label
		
		item1=new JLabel("This is sent");
		item1.setToolTipText("Hover");
		
		add(item1);
	}
}
