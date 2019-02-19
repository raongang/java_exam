package com.raon.threadUse;

/**
 *  Thread Class를 이용한 멀티스레드
 *  작성법
 *  (1)    Thread 클래스를 상속 받아서 내가 시킬 일을 해줄 클래스를 하나 만든다.
 *	(2)    위에서 만든 클래스에 run() 메소드 안에 시킬 일을 정의해 준다.
 *	(3)    메인스레드에서 위에서 만든 클래스의 start() 메소드를 호출한다.
 *
 *	 => start() 메소드 안에는 thread를 생성시켜서 일을 시키기 위한 여러가지 준비작업을 수행한 뒤에 준비가 끝나면 최종적으로 (2)에서 정의한 run() 메소드를 호출해서 스레드가 자신을 일을 처리해나가게 된다.
 *
 *      주의할 점은 run() 메소드를 바로 호출하면 안되고, start() 메소드를 호출해야한다는 점이다. 
 *      왜냐하면, run()을 바로 호출하게 되면 thread를 만들어서 실행하기 위한 처리가 안되고 그냥 run()메소드안에 정의된 일을 main스레드에서 처리해 버리기 때문이다. 
 *      별도의 스레드를 만들어서 수행해야하므로, 반드시 start() 메소드를 호출해서 일을 시키도록 해야한다.
 *
 * @author YKH
 *
 */

public class MultiThreadMain {

	//기능 : 메인스레드 - 1~10까지의 곱 , 멀티쓰레드 - 1~10까지의 합 게산
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인 쓰레드 1~10까지의 곱 계산
		
		Thread t = new CalcSumThread();
		t.start();
		
		long multiply = 1;
		
		
		for(long i=1; i<=10; i++) {
			multiply *= i;
			System.out.println(i + " 곱하기 결과: " + multiply);
		}
		System.out.println("-------------------------------------");
		System.out.println("1~10 곱하기: " + multiply);			
	
	}
}
