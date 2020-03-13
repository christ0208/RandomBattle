package handlers;

import commands.NumberCommand;
import utils.ClearScreen;
import utils.Constants;
import utils.EnemySelection;
import utils.HeroSelection;
import utils.MyRandom;
import utils.MyScanner;

public class BattleSceneHandler implements IBaseHandler {

	@Override
	public void handle() {
		int input = 0;
		do {
			ClearScreen.clear();
			System.out.println("You");
			System.out.println("===");
			HeroSelection.selectedHero.getStatus();
			System.out.println("");
			System.out.println("Enemy");
			System.out.println("=====");
			EnemySelection.selectedHero.getStatus();
			System.out.println("Pick your action: ");
			for (String menu : Constants.battleMenuList) {
				System.out.println(menu);
			}
			System.out.print("Choose >> ");
			input = MyScanner.getInt();
			redirection(input);
		}while(!HeroSelection.selectedHero.isDead() && !EnemySelection.selectedHero.isDead());
		System.out.println("Game Over");
		System.out.println((HeroSelection.selectedHero.isDead()) ? "Enemy wins" : "You win");
		MyScanner.getString();
	}
	
	@SuppressWarnings("deprecation")
	private void redirection(int input) {
		try {
			Class<?> command = Constants.battleCommands.get(input);
			if(command != null) {
				((NumberCommand) command.newInstance()).execute();
				if(!EnemySelection.selectedHero.isDead())
					enemyTurn();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void enemyTurn() {
		System.out.println("Enemy Turn");
		int selectedAction = MyRandom.randomNumber(0, 2);
		if(selectedAction == 0) {
			int damage = EnemySelection.selectedHero.attack();
			HeroSelection.selectedHero.receiveDamage(damage);
		} else {
			EnemySelection.selectedHero.heal();
		}
		MyScanner.getString();
	}

}
