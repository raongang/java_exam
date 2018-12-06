package designPattern.strategy;

/**
 * 전략패턴(Strategy pattern) 구성
 * 
 * StrategyMain -> object client
 * Mart -> Context
 * CupSeller -> 구현클래스
 * Seller -> 전략
 * @author admin
 *
 */

public class StrategyMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seller cupSeller = new CupSeller(); //interface 사용
		Seller phoneSeller = new PhoneSeller();
		
		/**
		 * Template Method에서는 외부로 공개되는 것이 Template Method를 가지고 있는 상위클래스이지만,
		 * Strategy에서는 interface를 사용하는 클래스(context)를 이용한다.
		 * Mart class가 여기서 context
		 */
		
		Mart mart1 = new Mart(cupSeller);
		mart1.order(); 
		Mart mart2 = new Mart(phoneSeller);
		mart2.order();
	}
}
