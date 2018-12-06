package designPattern.Observer;

import java.util.Observable;

//변화를 통보하는 Observable
public class Watcher extends Observable{
	public void action(String string){
		System.out.println("==========="+string+"===========");
		
		//변화가 일어났음을 알리는 코드
		setChanged();
		/*
		위의 setChanged()가 호출되지 않고 notifyObservers()만 호출되면, 아무일도 일어나지 않음.
		notifyObservers(Object)가 호출이 되면, Observer들에게 전부 알린다.
		그러면, 각각의 Observer들은 각자가 가진 update() method가 호출된다.
		*/
		notifyObservers(string);
	}
}
