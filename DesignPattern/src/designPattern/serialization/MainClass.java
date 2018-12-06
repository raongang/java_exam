package designPattern.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 직렬화(serialization) / 역직렬화(DeSerialization) 은 주로 ObjectInputStream / ObjectOutputStream을 활용
// 직렬화 역직렬화는 순서가 매우 중요하다. 순서가 많지 않으면 역직렬화에 실패하기 때문에 같은 객체를 여러번 보내기보다
// ArrayList와 같은 자료구조로 한번에 넣는 것이 효율적.
public class MainClass {
	
	private static final String USERINFO_SER = "user.ser";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conductSerializing(); //직렬화
		conductDeSerializing(); //역직렬화
	}
	
	public static void conductSerializing(){
			try{
			FileOutputStream fos = new FileOutputStream(USERINFO_SER);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);
			 
			User user1 = new User("홍길동", "1234", 30);
			ArrayList list = new ArrayList();
			list.add(user1);
			 
			out.writeObject(user1);
			out.writeObject(list);
			out.close();
			} catch(Exception e){
			e.printStackTrace();
			}
	}

			 
		public static void conductDeSerializing(){
		try{
		FileInputStream fis = new FileInputStream(USERINFO_SER);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream in = new ObjectInputStream(bis);
		 
		User user1 = (User) in.readObject();
		ArrayList list = (ArrayList) in.readObject();
		 
		 
		System.out.println(user1.toString());
		System.out.println(list.toString());
		in.close();
		} catch(Exception e){
		e.printStackTrace();
		}
	}

}//end MainClass
