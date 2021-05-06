package Abstact;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamers;

public interface SaleService {

	
	void Sell (Game game,Gamers gamer);
	
	
	
	void SellWithCampaign (Game game,Gamers gamer ,Campaign campaign);

	
}