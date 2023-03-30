package javaPrograms;


class GrandFath{
	
	int a=10;
	int b=10;
	int c = a+b;
	void dispGF() {
		System.out.println("this is sum of SUPER class:-  "+c);
	}
}

class Father extends GrandFath{
	
	int d=10;
	int e=c+d;
	void dispFath() {
		System.out.println("this is sum of SUB  class:-  "+e);
	}
	
}

class Son extends Father{
	
	int f=10;
	int g=f+e+c;
	void dispSon() {
		System.out.println("this is sum of SUB  SUB class:-  "+g);
	}
}


public class MultiLevelINheritence {

	public static void main(String[] args) {
		
		Son ob = new Son();
		ob.dispGF();
		ob.dispFath();
		ob.dispSon();
		
		

	}

}
