package com.info;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorOverMap {
public static void main(String[] args) {
	HashMap<String, String> map= new HashMap<String, String>();
	map.put("1", "2");
	map.put("11", "2");
	map.put("111", "2");
	map.put("1111", "2");
	map.put("11111", "2");
	for(Map.Entry<String,String> entry: map.entrySet()) {
		System.out.println(entry.getKey());
	}
	Iterator<Map.Entry<String,String>> iterator= map.entrySet().iterator() ;
	while(iterator.hasNext()) {
		System.out.println(iterator.next().getKey());
	}
}
}
