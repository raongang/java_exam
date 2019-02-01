package com.raon.thread;

public class BankMaintance implements Runnable {

	Account acc = new Account();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		while(acc.balance>0) {
			//100,200,300중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random()*3+1)*100;
			//System.out.println(Thread.currentThread().getName() + " money : " + money);
			acc.withdraw(money);
			System.out.println(Thread.currentThread().getName() + " money : " + money + " balance : " + acc.balance);
		}//end while
	}//end run

	
}//end class
