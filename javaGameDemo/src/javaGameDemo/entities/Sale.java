package javaGameDemo.entities;

import javaGameDemo.abstracts.Entity;

public class Sale implements Entity{
	private int id;
	private int GameId;
	private int CustomerId;
	
	public Sale() {
	}

	public Sale(int gameId, int customerId) {
		super();
		GameId = gameId;
		CustomerId = customerId;
	}

	public int getId() {
		return id;
	}

	public int getGameId() {
		return GameId;
	}

	public void setGameId(int gameId) {
		GameId = gameId;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

}
