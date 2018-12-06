package designPattern.Observer;

import java.util.Observable;
import java.util.Observer;

//변화를 통보받는 직원 - Observer
public class Employee implements Observer{
	private String desc;
	
	public Employee(String desc){
		this.desc = desc;
	}
	
	//update method는 각각의 Observable에 대응하도록 여러개를 만들수 없기 때문에, 어떤일인지를 
	//Observable을 받아서 파악하고, 그에 맞는 행동을 하게 작성해 줘야 한다.
	//Object를 통해서 구체적인 정보를 받을 수 있음.
	public void update(Observable o , Object arg){
		if(o instanceof Watcher){
			System.out.println(desc + "이 일하는 척");
		}
	}
	
	public String getDesc(){
		return desc;
	}
}
