import java.io.*;
import java.awt.*;
//import java.math.BigInteger;
import java.util.Arrays;
//import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.*;


class calculate{
	public String multiply(double a, double b)
	{
		double c = a * b;
		String[] dec = (Double.toString(c)).split("\\.");
		String output = (dec[1].equals("0")) ? Integer.toString((int)c) : Double.toString(c);
		return output;
	}
	public String add(double a, double b)
	{
		double c = a + b;
		String[] dec = (Double.toString(c)).split("\\.");
		String output = (dec[1].equals("0")) ? Integer.toString((int)c) : Double.toString(c);
		return output;
	}
	public String minus(double a, double b)
	{
		double c = a - b;
		String[] dec = (Double.toString(c)).split("\\.");
		String output = (dec[1].equals("0")) ? Integer.toString((int)c) : Double.toString(c);
		return output;
	}
	public String divide(double a, double b)
	{
		double c = a / b;
		String[] dec = (Double.toString(c)).split("\\.");
		String output = (dec[1].equals("0")) ? Integer.toString((int)c) : Double.toString(c);
		return output;
	}
}

class overlay{
	public void start() 
	{ 
		JFrame f=new JFrame("Calculator"); 
		
		JPanel gui = new JPanel(new FlowLayout(5));
                gui.setBorder(new EmptyBorder(2, 3, 2, 3));
                
                LineBorder border = new LineBorder(Color.BLACK);
                Dimension tfd = new Dimension(380,35);
                Dimension btd = new Dimension(70,70);
		
		//JLabel l=new JLabel("Anurag jain(csanuragjain)"); 
		JTextField text = new JTextField("0");
		text.setBorder(border);
		text.setPreferredSize(tfd);
        	text.setMaximumSize(tfd);
		gui.add(text); 
		JButton[] number = new JButton[10];
		for(int i=0;i<10;i++)
		{
			number[i] = new JButton(Integer.toString(i));
			number[i].setPreferredSize(btd);
        		number[i].setMaximumSize(btd);
        		gui.add(number[i]); 
		}
		JButton plus = new JButton("+");
		plus.setPreferredSize(btd);
		plus.setMaximumSize(btd);
		gui.add(plus); 
		
		JButton minus = new JButton("-");
		minus.setPreferredSize(btd);
		minus.setMaximumSize(btd);
		gui.add(minus); 
		
		JButton multiply = new JButton("*");
		multiply.setPreferredSize(btd);
		multiply.setMaximumSize(btd);
		gui.add(multiply); 
		
		JButton divide = new JButton("/");
		divide.setPreferredSize(btd);
		divide.setMaximumSize(btd);
		gui.add(divide);
		
		JButton equal = new JButton("=");
		equal.setPreferredSize(btd);
		equal.setMaximumSize(btd);
		gui.add(equal);
		
		f.add(gui);
		
		f.setSize(400,310); 
		//f.setResizable(false);
		f.setVisible(true); 
	}
}

class demo{
	


	public static void main(String args[]){
		//System.out.println("1 => add, 2 => multiply, 3 => minus, 4 => divide");
		try{
		        /*BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    	String s = bufferRead.readLine();
		    	System.out.println("Please enter the first number.");
		    	String a = bufferRead.readLine();
		    	System.out.println("Please enter the second number.");
		    	String b = bufferRead.readLine();
		    	calculate op = new calculate();
		    	String[] dec;
		    	
		    	if(s.equals("1"))
		    	{
		    		String c = op.add(Double.parseDouble(a), Double.parseDouble(b));
		    		System.out.println(a+" + "+b+" = "+ c);
		    	}
		    	if(s.equals("2"))
		    	{
		    		String c = op.multiply(Double.parseDouble(a), Double.parseDouble(b));
		    		System.out.println(a+" * "+b + " = "+c);
		    	}
		    	if(s.equals("3"))
		    	{
		    		String c = op.minus(Double.parseDouble(a), Double.parseDouble(b));
		    		System.out.println(a+" - "+b + " = "+c);
		    	}
		    	if(s.equals("4"))
		    	{
		    		String c = op.divide(Double.parseDouble(a), Double.parseDouble(b));
		    		System.out.println(a+" / "+b + " = "+c);
		    	}*/
		    	new overlay().start();
		}
		catch(Exception e)
		{
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			JOptionPane.showMessageDialog(null,errors.toString());
		}
		
	}	
}


