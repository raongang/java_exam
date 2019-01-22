package reflectionSample2;

/**
 * @author admin
 * 리플렉션을 위한 클래스 정보 얻는 방법
 
  1. 대상 객체에서 제공하는 getClass() 메소드 이용 
     사용법 : Class [객체 이름 = [대상 객체.getClass(); String str = new String();
      WorkerValue workerValue = new WorkerValue(); 
      Class class1 = str.getClass(); Class class2 = workerValue.getClass(); 
   
  2. 대상 클래스를 이용하여 Class 객체를 받아오는 방법 
     사용법 : Class [객체 이름] = [대상 객체].class; C
     lass class3 = String.class; 
     Class class4 = WorkerValue.class; 
   
  3. 대상 클래스의 이름을 이용하여 Class 객체를 받아오는 방법 
    사용법 : Class [객체 이름] = Class.forName([String 패키지명을 포함한 클래스 이름]) 
    
    Class class5 = Class.forName("java.lang.String"); 
    Class class6 = Class.forName("com.abc.WorkerValue");

 */

public class ReflectionSampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerValue workerValue = new WorkerValue("Moonti",WorkerValue.POSITION_MANAGER);

		//Class객체생성
		Class class1 = workerValue.getClass();
		Class class2=  WorkerValue.class;
		Class class3 = null;
		
		try {
			class3 = Class.forName("reflectionSample2.WorkerValue");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		/*
		 * 보통 객체에 대한 고유값으로 hashCode() 메쏘드를 많이 사용한다. 
		 * 최 상위 타입인 Object의 hashCode()는 Override가 가능하기 때문에, 고유값이 아닐경우가 잠재적으로 존재하게 된다. 
		 * 이런 문제(?)를 해결할 수 있도록 System.identityHashCode(Object x)라는 메서드를 제공하고 있다.
		 */
		System.out.println("HashCode = class1 : " + System.identityHashCode(class1)); 
		System.out.println("HashCode = class2 : " + System.identityHashCode(class2)); 
		System.out.println("HashCode = class3 : " + System.identityHashCode(class3)); 
		System.out.println("HashCode = null : " + System.identityHashCode(null));

	}

}
