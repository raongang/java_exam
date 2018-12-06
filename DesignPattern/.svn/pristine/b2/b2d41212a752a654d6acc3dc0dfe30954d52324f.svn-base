package designPattern.Observer;

import java.util.Observable;
import java.util.Observer;

//변화를 통보받는 사장
public class Spy implements Observer{
	 private Employee employee;
	 
	 public Spy(Employee employee){
		 this.employee = employee;
	 }
	 
	 public void update(Observable o , Object arg){
		 String str = (String)arg;
		 System.out.println("str : " + str);
		 if(o instanceof Watcher){
			 System.out.println("고자질쟁이가" +  employee.getDesc() +"이 놀고 있었다고 고자질");
		 }
	 }
}
