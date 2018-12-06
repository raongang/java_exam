package designPattern.protoType;

import java.util.Date;

/**
 * @author admin
 * protoType pattern : 기존에 만들어진 복잡한 인스턴스의 내용이 일부만 살짝 변경된 비슷한 객체가 필요할 경우 쓰임.
 *                     아주 일반적인 "원형"을 만들어서 그것을 복사한 후 적당히 커스텀마이징을 하면 new로 객체를 생성하는 것보다 쉽게 됨.
 *                     이를 위해 clone()을 사용한다.                      
 * 장점 : 비슷한 객체를 new Object()로 생성할 경우 기존에 만들어진 것과 유사하다고 하더라도 결국 모든 정보를 다시 세팅 해 줘야 하는데 이를 방지할 수 있다.
 */
public class ProtoTypeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex com = new Complex("complex info");
		
		try {
			Complex c1 = (Complex) com.clone();
			c1.setDate(new Date(2008,0,1));
			
			Complex c2 = (Complex) com.clone();
			c2.setDate(new Date(2008, 2, 1));
			
			System.out.println(c1.getDate());
			System.out.println(c2.getDate());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
