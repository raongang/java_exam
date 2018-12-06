package designPattern.Decorator;

import java.io.FileNotFoundException;

/**
 * @author admin
 * Decorator pattern.
 * 기존에 구현되어 있는 클래스에 기능을 추가하기 위한 pattern.
 * 기존에 있던 클래스를 상속하여 만들기 때문에 기존 클래스와 사용법이 크게 다르지 않다.
 */

public class DecoratorTest {
	public static void main(String[] args) throws FileNotFoundException{
		
		Decorator decorator = new Decorator();
		
		System.out.println(decorator.getMerong());
		
		Decorator child = new ChildDecorator(decorator);
		System.out.println(child.getMerong());
		
		Decorator child2 = new ChildDecorator(child);
		System.out.println(child2.getMerong());
		
	}
}
