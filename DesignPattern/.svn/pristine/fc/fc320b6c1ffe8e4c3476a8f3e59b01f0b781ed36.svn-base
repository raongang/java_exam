package designPattern.facade;

/**
 * @author admin
 * Facade  : 여러가지 복잡한 것들을 하나로 간주해서 다룸.
 * - 최소단위로 클래스를 설계할 수 있다.
 */
public class FacadeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Audio audio = new Audio();
		Light light = new Light();
		
		Home home = new Home(audio, light, tv);
		
		home.enjoyTv();
		home.enjoyMusic();
		home.goOut();
		
		
	}

}
