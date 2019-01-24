import java.lang.reflect.Method;

//클래스 메소드 찾기

public class SampleMain3 {
	
	private int f1(Object p, int x) throws NullPointerException{
		if(p==null) throw new NullPointerException();
		return x;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Class cls = Class.forName("SampleMain3"); //class memory load
			
			//getMethods() 사용시 상속된 메소드에 대한 정보도 얻을 수 있음.
			Method metlist[] = cls.getDeclaredMethods();
			
			for(int i=0; i<metlist.length; i++) {
				Method m = metlist[i];
				System.out.println("name = " + m.getName());
				System.out.println("decl class= "+  m.getDeclaringClass());
				Class pvec[] = m.getParameterTypes();
				
				for(int j=0; j<pvec.length; j++) {
					System.out.println("param #" + j + " " + pvec[j]);
				}
				
				/*
				Class evec[] = m.getExceptionTypes();
				
				for (int j = 0; j < evec.length; j++)
					System.out.println("exc #" + j + " " + evec[j]);
				*/
				
				System.out.println("return type = " + m.getReturnType());

				System.out.println("-----");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
