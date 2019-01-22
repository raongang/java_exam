import java.lang.reflect.Array;

//Array사용_ex1

public class SampleMain7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class cls = Class.forName("java.lang.String");
			Object arr = Array.newInstance(cls, 10);
			Array.set(arr, 5, "this is test");
			
			String s = (String)Array.get(arr, 5);
			
			System.out.println(s);
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		
	}

}
