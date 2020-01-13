package com.info;

public class InheritanceProblem {
public static void main(String[] args) {
	InheritanceProblemChild child= new InheritanceProblemChild();
	System.out.println("----------------------------------");
	InheritanceProblemParent inheritanceProblemParent= new InheritanceProblemParent();
	System.out.println("----------------------------------");
	InheritanceProblemParent inheritanceProblemParent2=new InheritanceProblemChild();
	System.out.println("----------------------------------");
	// Parent instance can be made using child object but reverse is not possible
	InheritanceProblemChild inheritanceProblemChild=(InheritanceProblemChild) new InheritanceProblemParent();
	System.out.println("----------------------------------");
}	

}
 class InheritanceProblemParent {
public InheritanceProblemParent() {
	// TODO Auto-generated constructor stub
	System.out.println("Parent");
}
}
 class InheritanceProblemChild  extends InheritanceProblemParent{
public InheritanceProblemChild() {
	// TODO Auto-generated constructor stub
	System.out.println("Child");
}
}
