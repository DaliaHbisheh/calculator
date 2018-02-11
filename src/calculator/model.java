package calculator;

import javax.swing.JOptionPane;

public class model {
	public static double z;
	static public final String WITH_DELIMITERS = "((?<=%1$s)|(?=%1$s))";
	public static boolean ne=false;
public static double sqrt(String s){

	double d=0;
	try{
		String ss[]=s.split(String.format(WITH_DELIMITERS, "[%*/+-]"));
		if(ss.length!=1)
		d=answer(s);
		else d=Double.parseDouble(s);
	
		return Math.sqrt(d);
	}catch(Exception e){
	
		JOptionPane.showMessageDialog(null,"please enter a number", "ERROR!",JOptionPane.ERROR_MESSAGE);
		
		
	}
	return 0;
	}



public  static double answer(String g){
	double a=0;
	try{
		if(g!=null){
		String[] tokens = g .split(String.format(WITH_DELIMITERS, "[%*/+-]"));
		if(tokens[0].equals("-")) ne=true;
		
		if(tokens.length==1) return Double.parseDouble(g);
		if(tokens.length>=3||ne==true){ 	
		String op=tokens[1];
		double n1,n2;
		if(ne&&tokens.length>3){n1=Double.parseDouble(tokens[1])*-1; n2=Double.parseDouble(tokens[3]); op=tokens[2];}
		else{ n1=Double.parseDouble(tokens[0]); n2=Double.parseDouble(tokens[2]);}
		switch(op)
		{
		case "+":
			a=plus(n1,n2);
			break;
		case "-":
		a=minus(n1,n2);
		 break;
		case "/": 
			a= div(n1,n2);
			break;
		
		case "*":
			a=mul(n1,n2);
			break;
		case "%":
			a=mod(n1,n2);
			break;
		default: JOptionPane.showMessageDialog(null, "ERROR!","Try Again",JOptionPane.ERROR_MESSAGE);
		}
		
		
		}
		
	}
		}
	catch(Exception p){
		
	JOptionPane.showMessageDialog(null, "ERROR!","ERROR",JOptionPane.ERROR_MESSAGE);
	}
	
	
	return a;
	
}

public static double plus(double a,double b){ z= a+b; return z;}


public static double minus(double a,double b){ return a-b;}

public static double mul(double a,double b){ return a*b;}

public static double div (double a,double b){ 
	double x=0.0;
	if(b==0) {
		JOptionPane.showMessageDialog(null, "Can't divide on zero","ERROR!",JOptionPane.ERROR_MESSAGE);
	return x;
	}
	else	

	return a/b;

}
public static double sqrtt(double a){ 
	try{ 
		return Math.sqrt(a);}
	catch(Exception e){
		
		JOptionPane.showMessageDialog(null, "ERROR","Nuber can't be minus",JOptionPane.ERROR_MESSAGE);
		
		return Double.parseDouble(null);
	}
	
	}



public static double mod(double a,double b){ return a%b;}








}