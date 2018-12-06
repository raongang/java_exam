package designPattern.template;

/**
 * Template Pattern
 * 용도 
 *  - 전체적인 로직에는 차이가 없지만 일부분만 바뀔 경우 
 *  - 전반적인 구현은 상위클래스 ( 주로 Abstract ) 에서 담당하고
 *  - 부분적인 곳의 구체적인 구현은 하위클래스에서 담당.
 
 * 단점 : subclass들이 이미 class level에서 결정되어버리므로, 그 관계에 대한 유연성이 저하됨.
 *        따라서, Strategy pattern을 사용한다.
*/

public class TemplateTest {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		Worker designer = new Designer();
		designer.work();
		Worker gamer = new Gamer();
		gamer.work();
	}
}
