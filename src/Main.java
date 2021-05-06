import Concrete.GamersManager;
import Concrete.SaleManager;
import Entity.Game;
import Entity.Gamers;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Game csgo = new Game(1,"CS:go",30);
		Gamers Caner = new Gamers(1,"caner","cmg","1111111","1993");
		
		GamersManager gamersManager = new GamersManager();
		gamersManager.add(Caner);
	
		SaleManager saleManager = new SaleManager();
		saleManager.Sell(csgo, Caner);

}
}