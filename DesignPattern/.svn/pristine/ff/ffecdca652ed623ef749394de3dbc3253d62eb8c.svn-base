package designPattern.factory;

/**
 * Factory pattern
 * 객체선언( new객체())를 factory 내부에서 처리해줌. 
 * abstract class 나 interface에 대해 다양한 하위 구현체가 있을 경우 사용하면 좋음
 * 사용법 : Factory.create(parameter)
 * @author admin
 */

public class FactoryTest {
	public static void main(String[] args){
		Animal a1 = AnimalFactory.create("cow");
		a1.printDescription();
		Animal a2 = AnimalFactory.create("cat");
		a2.printDescription();
		Animal a3 = AnimalFactory.create("dog");
		a3.printDescription();
	}
}
