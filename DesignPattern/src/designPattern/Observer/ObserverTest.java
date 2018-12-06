package designPattern.Observer;
/**
 * @author admin
 * Observer pattern : 어떤 class에 변화가 일어났을 경우, 다른 class에 통보해주는 pattern.
 * Observable : 통보하는 class , 통보만 하지 상세한 지시는 하지 않는다.
 * Observer   : 통보를 받는 다른 class
 */
public class ObserverTest {
	public static void main(String[] args) {
		Watcher watcher = new Watcher();
		Employee pc1 = new Employee("만화책보는 놈");
		Employee pc2 = new Employee("퍼질러 자는 놈"); 
		Employee pc3 = new Employee("포카치는 놈");
		
		//spy는 pc3을 보고 있음.
		Spy spy = new Spy(pc3);
		
		//observer로 등록.
		//통보를 받는 순서는 등록순서와 무관.
		watcher.addObserver(pc1);
		watcher.addObserver(pc2);
		watcher.addObserver(pc3);
		watcher.addObserver(spy);
		
		watcher.action("주인 뜸");
		//observer 등록 해제.
		watcher.deleteObserver(pc3);
		watcher.deleteObserver(spy);
		
		watcher.action("주인 뜸.");
	}
}
