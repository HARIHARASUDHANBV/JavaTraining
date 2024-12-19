package com.Day10;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new Hashtable<Integer, String>();
		map.put(20, "FORTRAN");
		map.put(30, "Python");
		map.put(40, "C");
		map.put(50, "C++");
		map.put(60, "Ruby");
		map.put(70, "Java");
		map.put(0, "COBOL");
		System.out.println(map);
		map.put(20, "R");
		System.out.println(map);
		map.remove(60);
		System.out.println(map);
		System.out.println(map.get(50));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(40));
		System.out.println(map.containsValue("C"));

//Way-1
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		System.out.println();
		for (Integer i : keys) {
			System.out.println(i + "=>" + map.get(i));
		}
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "=>" + map.get(key));

		}
//		Way-2
		Set<Entry<Integer, String>> key = map.entrySet();
		System.out.println(key);
		for (Entry<Integer, String> entry : key) { // Entry is an object,so we must use getValue() method.
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		Iterator<Entry<Integer, String>> it1 = key.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> entry = it1.next();
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

	}

}
