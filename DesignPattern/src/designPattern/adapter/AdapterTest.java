﻿package designPattern.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Adapter pattern은 어떤 object를 캐스팅이 불가능한 다른 클래스의 형태로
 * 변환 시켜주는 pattern.

 * 
 *
 */
public class AdapterTest {
	public static void goodMethod(Enumeration<String> enu){
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("test");
		list.add("test2");
		list.add("test3");
		
		Enumeration<String> ite = new IteratorToEnumeration(list.iterator());
		AdapterTest.goodMethod(ite);
		
		
	}

}
