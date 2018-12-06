package designPattern.template;

public abstract class Worker {
	
	protected abstract void doit();
	
	public final void work(){
		System.out.println("start");
		doit();
		System.out.println("end");
	}
}
