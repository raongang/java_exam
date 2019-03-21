import java.util.HashMap;
import java.util.Map;

/**
 * 물리 공간으로부터 한 번 읽어온 리소스는 Map에 보관해 두었다가
 * 재 호출 시 물리공간을 탐색하지 않고 Map에 있는 자원을 사용 할 수 있도록 하는 클래스입니다.
 */

public class ResourceBuffer {
	
	public static Map resourceMap = new HashMap();
	
	//싱글톤 패턴 구현
	private static ResourceBuffer uniqueInstance;
	
	public static ResourceBuffer getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ResourceBuffer();
		}
		return uniqueInstance;		
	}//end

	public void setResource(String key, byte[] value) {
		// TODO Auto-generated method stub
		resourceMap.put(key, value);
	}
	
	public  byte[] getResource(String key){
		System.out.println(key + "리소스를 메모리에서 읽어옵니다.");
		
		return (byte[]) resourceMap.get(key);
	}
	
	
	public boolean  isInResource(String key){
		if(resourceMap.containsKey(key)){
			System.out.println(key + "리소스가 메모리에 있습니다.");
			return true;
		}
		return false;
	}
	
	
}
