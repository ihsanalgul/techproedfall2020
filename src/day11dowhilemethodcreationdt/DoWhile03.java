package day11dowhilemethodcreationdt;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his first name
		 If the length of his first name is greater than 6 print "Long name"
		 Otherwise, print "Normal name" and finish the loop
		*/
		
		Scanner scan = new Scanner(System.in);
		String s = ""; 
		
		do {
			System.out.println("Enter your first name");
			s = scan.nextLine();
			if(s.length()>6) {
				System.out.println("Long name");
			}else {
				System.out.println("Normal name");
			}
			
		}while(s.length()>6);
		
		scan.close();

	}

}
