package javaPrograms;

class MyFather{
	
	int a=10;
	int b=10;
	int c=a+b;
	void fathAdd() {
		System.out.println("Father addition:-  "+c);
	}
}

class Son1 extends MyFather{
	
	int d=10;
	int e= d+c;
	void son1Add() {
		System.out.println("son1 addition:-  "+e);
	}	
}

class Sister extends MyFather{
	
	int f=20;
	int g= c+f;
	void sisterAdd() {
		System.out.println("Sister addition:-  "+g);
	}
	
}



class HierarchialInheritence {

	public static void main(String[] args) {
		
		Son1 ob = new Son1();
		ob.son1Add();
		
		Sister ob2 = new Sister();
		ob2.sisterAdd();

	}

}
