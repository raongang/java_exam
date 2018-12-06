package designPattern.java;

/**
 * @author admin
 * jdk5.0 향상된 for문 지원
 * for(변수타입 변수 이름 : 배열이름) 
 *   실행부분;
 */
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,20,30,40,50};
		for(int number:array)
			System.out.println(number);
	}

}
