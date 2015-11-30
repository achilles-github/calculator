import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
//import java.lang.Math;
class calculate{
	public String multiply(double a, double b)
	{
		double c = a * b;
		String[] dec = (Double.toString(c)).split("\\.");
		String round = (dec[1].equals("0")) ? Integer.toString((int)c) : Double.toString(c);
		return round;
	}
	public String add(double a, double b)
	{
		double c = a + b;
		String[] dec = (Double.toString(c)).split("\\.");
		String round = (dec[1].equals("0")) ? Integer.toString((int)c) : Double.toString(c);
		return round;
	}
	public String minus(double a, double b)
	{
		double c = a - b;
		String[] dec = (Double.toString(c)).split("\\.");
		String round = (dec[1].equals("0")) ? Integer.toString((int)c) : Double.toString(c);
		return round;
	}
	public String divide(double a, double b)
	{
		double c = a / b;
		String[] dec = (Double.toString(c)).split("\\.");
		String round = (dec[1].equals("0")) ? Integer.toString((int)c) : Double.toString(c);
		return round;
	}
}

class demo{
	
	public static void main(String args[]){
		System.out.println("1 => add, 2 => multiply, 3 => minus, 4 => divide");
		try{
		        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
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
		    	}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}	
}


