import java.lang.reflect.Field;

//필드값 바꾸기
public class SampleMain6 {

	public double d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Class c = Class.forName("SampleMain6");
			Field fld = c.getField("d");
			
			
			SampleMain6 main6 = new SampleMain6();
			System.out.println("d = " + main6.d);
			
			fld.setDouble(main6, 12.34);
			System.out.println("d = " + main6.d);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		
	}

}
