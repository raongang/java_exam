package designPattern.serialization;

import java.io.Serializable;
/*
 * @author admin
 * serialization - 객체를 직렬화하여 전송가능한 형태로 만드는 것. 객체들의 데이터를 연속적인 데이터로 변형하여 Stream을 통해 
 *                 데이터를 읽도록 해준다. 
 *               - 주로 객체를 통째로 파일로 저장하거나 전송하고 싶을 때 주로 사용.
 * Deserialization - 직렬화된 파일 등을 역으로 직렬화하여 다시 객체의 형태로 만드는 것. 
 *                 - 저장된 파일을 읽거나 전송된 스크림 데이터를 읽어 원래 객체의 형태로 복원한다.
 */

public class User implements Serializable {
    // 추후에 User 클래스에 변경이 생길지라도 UID가 여전히 1이기 때문에 역직렬화를 성공적으로 할 수 있음(중요함)
	private static final long serialVersionUID = 1L; 
	
	private String id;
	private transient String password;
	private String email;
	private int age;
	
	public User(String id, String password, int age){
	this.id = id;
	this.password = password;
	this.age = age;
	}
	
	public String toString() { // 오버라이드
	return "("+id+", "+password+", "+age+")";
	}
}


