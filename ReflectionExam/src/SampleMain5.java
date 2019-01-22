import java.lang.reflect.Method;

//이름으로 메소드 실행하기
//전제사항 : program이 add라는 메소드를 실행시키는데 실행시까지 알지 못한다고 가정한다.
//           메소드 이름은 실행시간에 알 수 있다.
public class SampleMain5 {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//동적로딩 : 어떠한 클래스가 로딩 될지 모르기 때문에 Class 클래스의 forName()함수를 이용해서 해당 클래스를 메모리로 로드 하는 것입니다.
			Class cls = Class.forName("SampleMain5"); 
			
			
			Class partypes[] = new Class[2];
			
			partypes[0] = Integer.TYPE;
			partypes[1] = Integer.TYPE;
			
			
			Method meth = cls.getMethod("add", partypes);
			
			SampleMain5 sample5 = new SampleMain5();
			
			
			Object arglist[] = new Object[2];
			arglist[0] = new Integer(37);
			arglist[1] = new Integer(47);
			
			//메소드 서치 : 지정된 매개 변수를 사용하여 지정된 개체에서 이 메서드 개체로 표시되는 기본 메서드를 호출하십시오.
			Object retobj = meth.invoke(sample5, arglist);
			
			Integer retval = (Integer)retobj;
			System.out.println(retval.intValue());
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		
		
	}//end main
}//end class
