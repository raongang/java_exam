package designPattern.singletone;
/**
 * @author admin
 * Singleton pattern 
 * 하나의 객체를 만들어서 아무데서나 접근할 수 있다.
 */
public class SingletonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonTest t = new SingletonTest();
		t.Amethod();
		t.Bmethod();
		
	}

	
	public void Amethod() {
		// TODO Auto-generated method stub
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("amethod에서 호출 :  " + sc.getNextInt());
		
	}
	
	public void Bmethod() {
		// TODO Auto-generated method stub
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("bmethod에서 호출 :  " + sc.getNextInt());
	}


}//end singletoneTest 
