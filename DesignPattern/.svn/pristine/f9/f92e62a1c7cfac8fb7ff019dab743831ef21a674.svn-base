package designPattern.flyweight;

import java.util.HashMap;
import java.util.Map;
// --- Person class 및 Person을 Flyweight로 관리하는 Factory ---
// Person : Flyweight를 담당하고, PersonFactory가 Flyweight Factory를 담당.
// 일반적인 

public class PersonFactory {
	
	public PersonFactory(){
		System.out.println("construct!!");
	}
	public static Map<String,Person> map = new HashMap<String,Person>();

	public synchronized static Person getPerson(String name){
		//map 은 {} 로 초기화된다.
		if(!map.containsKey(name)){
			Person tmp = new Person(name);
			map.put(name, tmp);
		}
		return map.get(name);
				
	}
	public static class Person{
		private final String name;
		private Person(String name){
			this.name = name;
			
		}
		public String getName(){
			return name;
		}
	}//end Person class
}
