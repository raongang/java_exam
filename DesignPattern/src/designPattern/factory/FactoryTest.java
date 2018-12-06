package designPattern.factory;

/**
 * Factory pattern
 * 객체선언( new객체())를 factory 내부에서 처리해줌. 
 * abstract class 나 interface에 대해 다양한 하위 구현체가 있을 경우 사용하면 좋음
 * 사용법 : Factory.create(parameter)
 * 
 * 문제점 ( abstract factory pattern에도 적용됨 )
 *  1. 수 많은 파라메터들이 클라이언트 클래스로 부터 전달 되는데 이것은 에러를 발생시키는 경우가 많다. 왜냐하면 거의 대부분의 경우 argument(인자)들의 type이 같고 클라이언트 쪽에서는 인자들을 정확히 유지시키기 어렵기 때문이다.
    2. 몇몇의 파라메터들은 값을 보낼때 선택적인데 factory pattern에서는 모든 인자를 전송해야 한다. 그리고 선택적인 파라메터들은 꼭 null을 입력해서 보내야한다.
    3. 만약 생성시키는 object가 무거운 경우(파라메터가 많은 경우) 만들기가 매우 복잡해지며, 이런 factory pattern의 복잡성으로 인해 결국 혼란스럽게 된다.
 * 
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
