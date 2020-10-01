package day13constructorsstatickeyword;

public class Static03 {
	
	/*
	 Create a program which counts the number objects you created
	*/
	
	static int counter = 0;
	int age = 0;
	
	public Static03() {
		counter++;
		age++;
	}

	public static void main(String[] args) {
		
          Static03 obj1 = new Static03();
          Static03 obj2 = new Static03();
          Static03 obj3 = new Static03();
          
          System.out.println("The number of objects: " + counter);
          System.out.print(obj1.counter);
          System.out.print(obj2.counter);
          System.out.print(obj3.counter);
          
          System.out.print(" - ");
         
          System.out.print(obj1.age);
          System.out.print(obj2.age);
          System.out.print(obj3.age);
		
	}

}
