package com.info;

public class CaseOfFunctionOverriding {
	public static void main(String[] args) {
		InheritanceProblemChild1 child= new InheritanceProblemChild1();
		System.out.println("----------------------------------"+ child.returnString());
		InheritanceProblemParent1 inheritanceProblemParent= new InheritanceProblemParent1();
		System.out.println("----------------------------------"+ inheritanceProblemParent.returnString());
		InheritanceProblemParent1 inheritanceProblemParent2=new InheritanceProblemChild1();
		System.out.println("----------------------------------"+inheritanceProblemParent2.returnString());
		
		
	}	

	}
	 class InheritanceProblemParent1 {
	public InheritanceProblemParent1() {
		// TODO Auto-generated constructor stub
		//System.out.println("Parent");
	}
	protected String returnString() {
		return "Parent";
	}
	}
	 class InheritanceProblemChild1  extends InheritanceProblemParent1{
	public InheritanceProblemChild1() {
		// TODO Auto-generated constructor stub
		//System.out.println("Child");
	}
	protected String returnString() {
		return "Child";
	}
}
