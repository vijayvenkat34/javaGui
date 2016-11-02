package gui;
/*PRess enter after typing*/
import java.awt.*;////layout
import java.awt.event.*;///contains ActionListener,ActionEvent
import javax.swing.*;     /////

public class Gui extends JFrame {//Jframe is Window
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField item4;
	
	public Gui(){
		super("title");
		setLayout(new FlowLayout());
		
		item1=new JTextField(10);
		add(item1);
		
		item2=new JTextField("enter text here");
		add(item2);
		
		item3=new JTextField("uneditable",20);
		item3.setEditable(false);
		add(item3);
		
		thehandler handler=new thehandler();////used 
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		
	}
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			String s="";
			
			if(event.getSource()==item1)
				s=String.format("field 1: %s",event.getActionCommand());////actioncommand gets value
			else if(event.getSource()==item2)
				s=String.format("field 2: %s",event.getActionCommand());////actioncommand gets value
			
			JOptionPane.showMessageDialog(null, s);
			
		}
	}
}
