package com.kiran.pizzaStoreManagement;

public class Pizza {
	private double pizza;
	private double chicken_pizza;
	private double onionPizza;
	private double tandooriChickenPizza;
	private double doubleCheesePizza;
	
	public Pizza() {
		this.pizza = 100;
		this.chicken_pizza = 200;
		this.onionPizza = 180;
		this.tandooriChickenPizza = 250;
		this.doubleCheesePizza = 150;
	}

	public double getPizza() {
		return pizza;
	}

	public void setPizza(double pizza) {
		this.pizza = pizza;
	}

	public double getChicken_pizza() {
		return chicken_pizza;
	}

	public void setChicken_pizza(double chicken_pizza) {
		this.chicken_pizza = chicken_pizza;
	}

	public double getOnionPizza() {
		return onionPizza;
	}

	public void setOnionPizza(double onionPizza) {
		this.onionPizza = onionPizza;
	}

	public double getTandooriChickenPizza() {
		return tandooriChickenPizza;
	}

	public void setTandooriChickenPizza(double tandooriChickenPizza) {
		this.tandooriChickenPizza = tandooriChickenPizza;
	}

	public double getDoubleCheesePizza() {
		return doubleCheesePizza;
	}

	public void setDoubleCheesePizza(double doubleCheesePizza) {
		this.doubleCheesePizza = doubleCheesePizza;
	}

	
	@Override
	public String toString() {
		return "1.pizza=" + pizza + ", \n2.chicken_pizza=" + chicken_pizza + ",\n3.onionPizza=" + onionPizza
				+ ",\n4.tandooriChickenPizza=" + tandooriChickenPizza + ",\n5.doubleCheesePizza=" + doubleCheesePizza
				+ "";
	}
	
	

}
