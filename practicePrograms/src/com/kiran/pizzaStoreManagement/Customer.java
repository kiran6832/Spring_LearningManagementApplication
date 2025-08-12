package com.kiran.pizzaStoreManagement;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Pizza pizza=new Pizza();
		int totalMoney=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("WELCOME TO PIZZA HUT");
		System.out.println("WOULD YOU LIKE TO SEE THE MENU");
		String ans=sc.next();
		if(ans.equalsIgnoreCase("yes")) {
			System.out.println("TODAY AVAILABLE PIZZA'S MENU");
			System.out.println(pizza);
			System.out.println("Select the option for order(1,2,3,4,5)");
			int op=sc.nextInt();
			System.out.println("ARE YOU SURE TO CONFIRM ORDER");
			String confirm=sc.next();
			if(confirm.equalsIgnoreCase("yes")) {
				if(op==1) {
					totalMoney+=pizza.getPizza();
					
				}
				else if(op==2) {
					totalMoney+=pizza.getChicken_pizza();
				}
				else if(op==3) {
					totalMoney+=pizza.getOnionPizza();
				}
				else if(op==4) {
					totalMoney+=pizza.getTandooriChickenPizza();
				}
				else if(op==5) {
					totalMoney+=pizza.getDoubleCheesePizza();
				}
				System.out.println("Are you adding any extra cheese(Rs.50)");
				String cheese=sc.next();
				if(cheese.equalsIgnoreCase("yes")) {
					totalMoney+=50;
				}
				System.out.println("Are you adding any extra toppings(Rs.50)");
				String toppings=sc.next();
				if(cheese.equalsIgnoreCase("yes")) {
					totalMoney+=50;
				}
				System.out.println("YOUR TOTAL PRICE OF YOUR ORDER: "+totalMoney);
			}
			else {
				System.out.println("THANK YOU VISIT US AGAIN");
			}
		}
		else {
			System.out.println("THANK YOU VISIT US AGAIN");
		}

	}

}
