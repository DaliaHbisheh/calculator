package calculator;

public class main {
public static void main(String args[]){
	
	controller c=new controller();
	model m=new model();
	System.out.println("Hiiiiiiiiiiiiiiiiiiiiiiiiiii");
	System.out.println("Hello");
	view v=new view();
	c.addview(v);
	c.addmodel(m);
	v.addcontroller(c);
	
	c.addmodel(m);
	
}
}
