package com.info;

public class Singleton { 
	  
    /* static class member which  
       will store the object reference*/
    private static Singleton uniqueInstance; 
  
    private Singleton() 
    { 
    } 
  
    public static synchronized Singleton getInstance() 
    { 
        if (uniqueInstance == null) { 
            uniqueInstance = new Singleton(); 
        } 
        return uniqueInstance; 
    } 
    public static void main(String[] args) {
    	Singleton s=Singleton.getInstance();
    	System.out.println(s);
    	Singleton s1=Singleton.getInstance();
    	System.out.println(s1);
    	System.out.println(s==s1);
	}
} 
