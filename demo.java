import java.io.*;
import java.util.Arrays;
//import java.lang.Math;
class calculate{
	public double multiply(double a, double b)
	{
		return a * b;
	}
	public double add(double a, double b)
	{
		return a + b;
	}
	public double minus(double a, double b)
	{
		return a - b;
	}
	public double divide(double a, double b)
	{
		return a / b;
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
		    		double c = op.add(Double.parseDouble(a), Double.parseDouble(b));
		    		dec = (Double.toString(c)).split("\\.");
		    		//System.out.println(Arrays.asList(dec)); 
		    		String round = (Integer.parseInt(dec[1]) == 0) ? Integer.toString((int)c) : Double.toString(c);
		    		System.out.println(a+" + "+b+" = "+ round);
		    	}
		    	if(s.equals("2"))
		    	{
		    		double c = op.multiply(Double.parseDouble(a), Double.parseDouble(b));
		    		dec = (Double.toString(c)).split("\\.");
		    		String round = (Integer.parseInt(dec[1]) == 0) ? Integer.toString((int)c) : Double.toString(c);
		    		System.out.println(a+" * "+b + " = "+round);
		    	}
		    	if(s.equals("3"))
		    	{
		    		double c = op.minus(Double.parseDouble(a), Double.parseDouble(b));
		    		dec = (Double.toString(c)).split("\\.");
		    		String round = (Integer.parseInt(dec[1]) == 0) ? Integer.toString((int)c) : Double.toString(c);
		    		System.out.println(a+" - "+b + " = "+round);
		    	}
		    	if(s.equals("4"))
		    	{
		    		double c = op.divide(Double.parseDouble(a), Double.parseDouble(b));
		    		dec = (Double.toString(c)).split("\\.");
		    		//String round = (Integer.parseInt(dec[1]) == 0) ? Integer.toString((int)c) : Double.toString(c);
		    		System.out.println(a+" / "+b + " = "+Double.toString(c));
		    	}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}	
}


