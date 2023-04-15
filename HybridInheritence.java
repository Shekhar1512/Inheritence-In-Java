package javaPrograms;


class Gfathers{
	
	int a = 2;
     
}

interface Gmothers{
	
	int b = 2;
	void add();
}

class Fatherss extends Gfathers{
	
	int c = 2;
}

class Sonss extends Fatherss implements Gmothers{
	
	int d=2;
	public void add() {
		System.out.println(a+b+c+d);
	}
	
}



public class HybridInheritence {

	public static void main(String[] args) {
		
		Sonss ob = new Sonss();
		ob.add();

	}

}
