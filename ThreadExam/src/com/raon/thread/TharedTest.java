package com.raon.thread;
/*
 * PDF-J는 블록동기인듯?
 * 
 *  비동기 - 동시에 실행. (Asynchronized) 
	동기   - 순차적으로 실행. (Synchronized) 
	
	블록   - 모두 끝날땓까지 기다림
	논블록 - 기대하는 행위를 요청하고 안기다림

	논블록,비동기 ->멀티쓰레드 도입 

 * 싱글쓰레드 프로세스의 경우 프로세스 내에 단 하나의 쓰레드만 작업하기 때문에 프로세스의 자원을 가지고 작업하는 데 별문제가 없지만, 
 * 멀티쓰레드 프로세스의 경우 여러 쓰레드가 같은 프로세스 내의 자원을 공유해서 작업을 하기 때문에 서로의 작업에 영향을 주게 된다. 
 * 만일 쓰레드A가 작업하던 도중에 다른 쓰레드B에게 제어권이 넘어갔을 때, 쓰레드A가 작업하던 공유 데이터를 쓰레드B가 임의로 변경하였다면, 
 * 다시 쓰레드A가 제어권을 받아서 나머지 작업을 마쳤을 때 원래 의도했던 것과는 다른 결과를 얻을 수 있다.

    이는 마치 한 방의 여러 사람이 방안의 컴퓨터를 함께 나눠 쓰는 상황과 같아서 한 사람이 컴퓨터로 문서작업 도중에 잠시 자리를 비웠을 때 
    다른 사람이 컴퓨터를 만져서 앞 사람이 작업하던 문서가 지원진다던가 하는 일이 생길 수 있다. 
    이럴 때는 문서작업이 끝날 때까지는 컴퓨터에 비밀번호를 걸어서 다른 사람이 사용할 수 없도록 해야 한다.

    이처럼 멀티쓰레드 프로그래밍에서 동기화는 중요한 요소이다. 

 * 
 */
public class TharedTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 동기화 구현 
		 *   synchronized 키워드를 사용하며 lock이 걸리면 다른 쓰레드가 접근하여 데이터를 변경할수 없다.
		 *   1) 특정 객체에 lock을 걸 경우 :  synchronized(객체의 참조변수)            ----------------->  다른 객체 접근 불가 
		 *   2) 메소드에 lock을 걸고자 할 경우 : public synchronized void calcSum() -----------------> 메소드가 종료될때까지 다른 쓰레드가 이 메소드 호출하여 수행할 수 없음.
		 */
		
		Runnable r = new BankMaintance();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		System.out.println(Thread.currentThread().getName());
		
		t1.start();
		t2.start();
		
	}//end main
	
}//end class 
