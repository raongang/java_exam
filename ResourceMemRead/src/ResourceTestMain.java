import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.MissingResourceException;

public class ResourceTestMain {

	public static void main(String[] args) {
		//data loading
		byte[] req_data =null;
		//객체를 생성한다.
		ResourceTestMain resourceMain = new ResourceTestMain();
		
		req_data = resourceMain.loadResource("test.txt");
		
		//byte[]을 스트링으로 변환
		String str  = new String(req_data,0,req_data.length);
		
		
		System.out.println("1 >> " + str);
		System.out.println("2 >> " + req_data.toString());
		
	}//end main
	

	private  byte[] loadResource(String name) {
		String resourceName = "/org/raon/data/" + name;
		
		/**
		 * ResourceBuffer 클래스의 메서드는 매번 호출 될 수 있으므로,
		 * 매 호출시마다 물리공간에서 자원을 읽어오는 낭비를 피하기 위해 리소스를 담고있는 클래스에
		 * 보관 해 두었다가 다시 호출될때 자원을 되돌려준다.
		 * 이 클래스는 실제 자원의 데이터를 Map에 담아서 보관한다.
		 */
		
		ResourceBuffer resourceUtil = ResourceBuffer.getInstance(); //싱글톤
		
		if(resourceUtil.isInResource(resourceName)){
			return resourceUtil.getResource(resourceName);
		}
		
		
		//리소스가 메모리에 없다면.. 
		ByteArrayOutputStream out = null;
		
		//resource data를 취한다 - classpath 상에 파일 불러오기
		InputStream is = getClass().getResourceAsStream(resourceName);
		
		if(is==null) {
			//자원없음
			throw new MissingResourceException("Resource loading Error", "test.txt", name);
		}
		
		try {
			//리소스 읽어오기
			out = new ByteArrayOutputStream();
			
			while(true) {
				byte[] buffer = new byte[1024];
				
				//InputStream으로부터 buffer의 최대길이만큼 읽어온다
				int len = is.read(buffer);
				if(len<=0) {
					break;
				}
				out.write(buffer,0,len);//ByteArrayOutputStream에 쓴다
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//길이 체크
		if(out.toByteArray().length <=0) {
			try {
				throw new IOException("Resource data size is ZERO: " + name);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//로딩한 자원을 버퍼클래스에 추가
		//재차 호출시 이 자원은 버퍼클래스로부터 읽어봅니다.
		byte[] result = out.toByteArray();
		resourceUtil.setResource(resourceName, result);
		return result;
	}
}//end class 
