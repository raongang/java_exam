package designPattern.flyweight;

import designPattern.flyweight.PersonFactory.Person;

// --------- 동일한 것을 공유해서 객체 생성을 줄여 가볍게 만드는 것. ---------
public class FlyweightTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonFactory p4 = new PersonFactory();
		Person p1        = PersonFactory.getPerson("Hong");
		Person p2        = PersonFactory.getPerson("KIM");
		Person p3        = PersonFactory.getPerson("Hong");
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
