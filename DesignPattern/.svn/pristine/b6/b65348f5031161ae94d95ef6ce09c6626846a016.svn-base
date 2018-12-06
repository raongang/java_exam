package designPattern.singletone;

public class SingletonCounter {
	//private 멤버변수로 자기 자신의 클래스의 인스턴스를 가짐.
	private static final SingletonCounter singleton  = new SingletonCounter();
	private int cnt = 0;
	private int construct = 0 ;
	
	// ※ 필수 : private 생성자를 지정하여, 외부에서 절대로 인스턴스를 생성할 수 없게 지정.
	private SingletonCounter(){
		System.out.println(++construct);
	}
	public static SingletonCounter getInstance(){
		System.out.println("singleton : " + singleton);
		return singleton;
	}
	
	public int getNextInt(){
		return ++cnt;
	}
	
}
