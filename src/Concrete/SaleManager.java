package Concrete;

import Abstact.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamers;

public class SaleManager implements SaleService{

	@Override
	public void Sell(Game game, Gamers gamer) {
			
		
		System.out.println(gamer.getFirstName()+"adli oyuncu "+game.getName()+" "+"adli oyunu satin aldi.");
	}

	@Override
	public void SellWithCampaign(Game game, Gamers gamer, Campaign campaign) {
		game.setPrice(game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100));
		System.out.println(gamer.getFirstName()+"adli oyuncu "+game.getName()+"adli oyunu kampanyali satin aldi.");

	}

	

}
