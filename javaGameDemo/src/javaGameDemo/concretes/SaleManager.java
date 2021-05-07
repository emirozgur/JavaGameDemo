package javaGameDemo.concretes;

import javaGameDemo.abstracts.SaleService;
import javaGameDemo.entities.Campaign;
import javaGameDemo.entities.Customer;
import javaGameDemo.entities.Game;
import javaGameDemo.entities.Sale;

public class SaleManager extends BaseManager<Sale> implements SaleService{

	@Override
	public void sell(Game game, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellWithCampaign(Game game, Customer customer, Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
