package Concrete;

import Abstact.GamersService;
import Entity.Gamers;

public class GamersManager implements GamersService {

	@Override
	public void add(Gamers gamer) throws Exception {
		if (CheckManager.checkManager(gamer)) {
			System.out.println(gamer.getFirstName() + "Kayit edildi.");
			}
		else { throw new Exception  ("Gercek kisi degil");
			}

	}

	@Override
	public void update() {
		
	}

	@Override
	public void delete() {
		
	}

}
