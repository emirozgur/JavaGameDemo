package javaGameDemo;

import javaGameDemo.concretes.SaleManager;
import javaGameDemo.entities.Campaign;
import javaGameDemo.entities.Customer;
import javaGameDemo.entities.Game;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		Customer customer = new Customer();
		Campaign campaign = new Campaign();
		SaleManager saleManager = new SaleManager();
		
		
		game.setName("Oyun");
		game.setUnitPrice(95);
		
		customer.setFirstName("FirstName");
		customer.setLastName("LastName");
		
		campaign.setName("%10 indirim");
		campaign.setDiscountRate(10);
		
		saleManager.sellWithCampaign(game, customer, campaign);

	}

}
