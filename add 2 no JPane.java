package gui;

import javax.swing.JOptionPane;

public class mainclass {

	public static void main(String[] args) {
		
		String a =JOptionPane.showInputDialog("Enter first number");
		String b =JOptionPane.showInputDialog("Enter second number");
		
		int c=Integer.parseInt(a)+Integer.parseInt(b);
		
		JOptionPane.showMessageDialog(null, "The ans is "+c,"the title", JOptionPane.PLAIN_MESSAGE);

	}

}
