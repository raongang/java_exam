package com.raon.runnableInterface;

/**
 *  Thread Class를 이용한 멀티스레드
 *  작성법
	(1)    우선 Runnable인터페이스를 구현하는 클래스를 하나 만든다.
	(2)    위에서 만든 클래스의 run() 메소드에 시킬 일을 정의한다.
	(3)    위에서 만든 클래스를 생성하고, Thread를 생성할 때 인자로 넣어서 생성한다.
	(4)    Thread의 start() 메소드를 호출하여 새로운 스레드가 만들어져서 실행되도록 한다.
 *
 * @author YKH
 *
 */

public class MultiThreadMain2 {
	//기능 : 메인스레드 - 1~10까지의 곱 , 멀티쓰레드 - 1~10까지의 합 게산
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인 쓰레드 1~10까지의 곱 계산
		
		//Thread t = new CalcSumThread2();
		
		Runnable r = new CalcSumThread2();   // 스레드에 시킬일이 포함된 runnable구현 클래스
		Thread t = new Thread(r); // runnable인터페이스를 이용해서 스레드를 만든다.
		t.start(); // start를 호출해서 스레드에 일을 시키다.
		
		long multiply = 1;
		
		
		for(long i=1; i<=10; i++) {
			multiply *= i;
			System.out.println(i + " 곱하기 결과: " + multiply);
		}
		System.out.println("-------------------------------------");
		System.out.println("1~10 곱하기: " + multiply);			
	
	}
}
