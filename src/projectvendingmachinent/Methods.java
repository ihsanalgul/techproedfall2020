package projectvendingmachinent;

import java.util.Scanner;

public class Methods {
	//I need to select a product and set the price
	public double select(Products product) {
		
		System.out.println(product.toString());
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Please, enter the product number from 1 to 10");
			product.setProductNum(scan.nextInt());
			if(product.getProductNum()<1 || product.getProductNum()>10) {
				System.out.println("Please enter a valid product number");
			}		
		}while(product.getProductNum()<1 || product.getProductNum()>10);
		
		switch(product.getProductNum()) {
			case 1:
				product.setPrice(product.getSnicker());
				break;
			case 2:
				product.setPrice(product.getChipsAhoy());
				break;
			case 3:
				product.setPrice(product.getPringles());
				break;
			case 4:
				product.setPrice(product.getMilano());
				break;
			case 5:
				product.setPrice(product.getReeses());
				break;
			case 6:
				product.setPrice(product.getCocaCola());
				break;
			case 7:
				product.setPrice(product.getFanta());
				break;
			case 8:
				product.setPrice(product.getWater());
				break;
			case 9:
				product.setPrice(product.getArizona());
				break;
			case 10:
				product.setPrice(product.getSkittles());
				break;
		}
		return product.getPrice();
	}
	
	public double balance(double price, double accountBalance, Products product) {
		
		while(accountBalance<price) {
			
			Scanner scan = new Scanner(System.in);
					
			System.out.println("You do not have enough money to buy the product. Would you like to add money? (Y/N)");
			
			char confirm = scan.next().toLowerCase().charAt(0);
			
			if(confirm=='y') {
				System.out.println("How much do you want to add?");
				double deposit = scan.nextDouble();
				accountBalance = accountBalance + deposit;
				System.out.println("Your current account: " + accountBalance);
				price = select(product);
			}else {
				System.out.println("Your current account: " + accountBalance);
				System.out.println("Thanks for shopping ...");
				break;
			}		
		}
		return accountBalance;
	}
	
	public void purchase(double price, double accountBalance, Products product) {
		
		while(accountBalance>=product.getPrice()) {
			
			accountBalance = accountBalance - product.getPrice();
			System.out.println("Your current account: " + accountBalance);
			
			Scanner scan =new Scanner(System.in);
			System.out.println("Would you like to buy another product? (Y/N)");
			
			char confirm = scan.next().toLowerCase().charAt(0);
			
			if(confirm == 'y') {
				product.setPrice(select(product));
				accountBalance = balance(product.getPrice(), accountBalance, product);
			}else {
				System.out.println("Thanks for shopping...");
				break;
			}

		}	
		
	}
	
	public double getMoney(double money) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("How much do you want to deposit?");
		double deposit = scan.nextDouble();
		money = money + deposit;
		
		System.out.println("Your current balance: " + money);
		return money;
	}

}

