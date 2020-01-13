package com.info.gc;

public class RuntimeGC {
	public static void main(String[] args) {
		RuntimeGC rgc= new RuntimeGC();
		System.out.println(rgc);
		rgc=null;
		System.gc();
		System.out.println();
	}
}
