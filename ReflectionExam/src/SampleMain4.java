import java.lang.reflect.Constructor;

//Constructors에 대한 정보 얻기
public class SampleMain4 {
	public SampleMain4() {

	}

	public SampleMain4(int i, double d) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class cls = Class.forName("SampleMain4");
			Constructor conlist[] = cls.getDeclaredConstructors();

			for (int i = 0; i < conlist.length; i++) {
				Constructor ct = conlist[i];
				System.out.println("name = " + ct.getName());
				System.out.println("decl class = " + ct.getDeclaringClass());
				Class pvec[] = ct.getParameterTypes();

				for (int j = 0; j < pvec.length; j++)
					System.out.println("param #" + j + " " + pvec[j]);
				
				Class evec[] = ct.getExceptionTypes();

				for (int j = 0; j < evec.length; j++)
					System.out.println("exc #" + j + " " + evec[j]);

				System.out.println("-----");
			}

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}

	}// end main
}// end class
