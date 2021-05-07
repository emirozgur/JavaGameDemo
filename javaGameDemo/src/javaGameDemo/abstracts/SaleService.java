package javaGameDemo.abstracts;

import javaGameDemo.entities.Campaign;
import javaGameDemo.entities.Customer;
import javaGameDemo.entities.Game;

public interface SaleService {

	void sell(Game game, Customer customer);
	void sellWithCampaign(Game game, Customer customer, Campaign campaign);
}
