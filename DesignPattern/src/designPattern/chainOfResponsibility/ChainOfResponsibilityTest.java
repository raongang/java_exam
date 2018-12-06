package designPattern.chainOfResponsibility;
/**
 * @author admin
 *  ChainOfResponsibility pattern - 
 *  문제 해결사들이 한줄로 쫙 서 있다가 문제가 들어오면, 자기가 해결 할 수 있으면 
 *  해결하고, 안되면 다음 해결사에서 문제를 넘긴다.
 */
public class ChainOfResponsibilityTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem[] problems = new Problem[5];
		
		problems[0] = new Problem("덩치 큰 깡패");
		problems[1] = new Problem("컴퓨터 보안장치");
		problems[2] = new Problem("까칠한 여자");
		problems[3] = new Problem("날렵한 깡패");
		problems[4] = new Problem("폭탄");
		
		Expert fighter = new Fighter();
		Expert hacker = new Hacker();
		Expert casanova = new Casanova();
		
		fighter.setNext(hacker).setNext(casanova);
		
		for(Problem problem : problems){
			fighter.support(problem);
		}
		
	}

}

