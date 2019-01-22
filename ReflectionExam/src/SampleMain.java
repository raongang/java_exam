import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;


//리플렉션이란 객체를 통해 클래스의 정보를 분석해 내는 프로그램 기법을 말한다. 투영, 반사 라는 사전적인 의미를 지니고 있다.
//원래 자바에서는 동적으로 객체를 생성하는 기술이 없었다. 그리고 동적으로 인스턴스를 생성하는 Reflection으로 그 역활을 대신하게 된다.

class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시스템로더리스트 출력
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		URL[] urls = ((URLClassLoader) cl).getURLs();
		for (URL url: urls) {
		  System.out.println(url.getFile());
		}
		
		//getURLs() 메소드를 통해 jar/디렉토리 목록에 액세스 가능 
		try {
			Class<?> c= Class.forName("java.util.Stack");//클래스로딩
			
			/**
			 * 기본형일 경우
			 * 
			 * c = Class.forName("java.lang.String");
			 * c = int.class;
			 * c = Integer.TYPE;
			 */
			
			Method m[] = c.getDeclaredMethods();//클래스에서 정의한 메소드리스트를 읽는다.
			//java.uti.stack의 속성과 반환값에 따라 메소드리스트를 출력
			for(int i=0; i<m.length;i++)
				System.out.println(m[i].toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end main
}//end class
