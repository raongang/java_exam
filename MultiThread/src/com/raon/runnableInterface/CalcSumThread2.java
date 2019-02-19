package com.raon.runnableInterface;

public class CalcSumThread2 implements Runnable{
	
	public CalcSumThread2() {
	}
	
	
	@Override
	public void run() {
		//1부터 10까지의 합 출력
		int sum=0;
		for(int i=0;i<10;i++) {
			sum+=i;
			System.out.println(i +" 더하기 결과 : " + sum);
			
		}	
		System.out.println("-------------------------------------");
		System.out.println("1~10 합계: " + sum);
	}//end run()
}//end class
