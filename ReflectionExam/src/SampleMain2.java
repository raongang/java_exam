
/**
일반적인 JAVA Application의 class loading 

1. Bootstrap Class Loader는 JVM이 초기화 시 필요한 클래스(jre/lib/rt.jar 등)를 로딩한다.
2. Extension Class Loader는 $JAVA_HOME/jre/lib/ext내 클래스를 로딩한다. (Bootstrap과 Extension을 묶어 Bootstrap으로 표현하는 경우도 있다)
3. System Class Loader는 애플리케이션이 사용하는 클래스를 로딩한다.
4. Application Classes : CLASSPATH에 설정된 클래스들
*/

class A{

}

//Simulating the instanceof Operator
public class SampleMain2 {
	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("A");
			
			Boolean b1 = cls.isInstance(new Integer(37));
			System.out.println(b1);
			
			boolean b2 = cls.isInstance(new A());
			System.out.println(b2);
					
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.print(e);
		}
	}
}
