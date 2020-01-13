package com.info;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tester{
public static void main(String[] args) {
	int [] arr= {2,8,4,7,4,9};
	Set<Integer> set1=new LinkedHashSet<>();
	int sum=0;
	int endsum=0;
	for(int i=0;i<arr.length;i++) {
		if(!set1.contains((Integer)arr[i])) {
			set1.add(arr[i]);
			sum+=arr[i];
		}
		else {
			sum=0;
			set1.clear();
			set1.add(arr[i]);
			sum+=arr[i];
		}
		endsum=(endsum>sum)?endsum:sum;
	}
	System.out.println(endsum);
}
}
