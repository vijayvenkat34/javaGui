package gui;

import java.awt.*;////layout
import java.awt.event.*;///contains ActionListener,ActionEvent
import javax.swing.*;     /////

public class Gui extends JFrame {//Jframe is Window
	
	private JButton reg;
	
	public Gui(){
		super("tilte");
		setLayout(new FlowLayout());
		
		reg=new JButton("click");
		add(reg);
		
		thehandler handler=new thehandler();
		reg.addActionListener(handler);
		
	}
	
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
	


}
