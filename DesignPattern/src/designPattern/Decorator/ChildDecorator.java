package designPattern.Decorator;

public class ChildDecorator extends Decorator {
	
	private Decorator decorator;
	
	public ChildDecorator(Decorator decorator){
		this.decorator = decorator;
	}
	
	public String getMerong(){
		System.out.println("j : " + i);
		return "@"+decorator.getMerong()+"@";
	}
}//end method..
