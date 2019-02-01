package com.raon.thread;

public class Account {
	int balance = 1000;
	
	//방법1 메소드에 lock걸기
	/*
	public synchronized void withdraw(int money) {
		
		System.out.println("withdraw class : " + Thread.currentThread().getName());
		
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance-=money;
		}//end if 
	}//end method
	*/
	
	//방법2 객체에 lock걸기
	public void withdraw(int money) {
		synchronized (this) {
			System.out.println("withdraw class : " + Thread.currentThread().getName());	
			
			if(balance>=money) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				balance-=money;
			}//end if 
		}//end synchronized
	}//end method
}//end class
