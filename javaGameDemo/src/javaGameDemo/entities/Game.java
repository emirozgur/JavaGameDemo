package javaGameDemo.entities;

import javaGameDemo.abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private double unitPrice;
	
	public Game() {
	}

	public Game(String name, double unitPrice) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


}
