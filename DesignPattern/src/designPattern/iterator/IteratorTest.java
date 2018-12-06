package designPattern.iterator;

import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicianList magicians = new MagicianList();
		magicians.add("tet");
		magicians.add("tet2");
		magicians.add("tet3");

		Iterator<String> iterator = magicians.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
