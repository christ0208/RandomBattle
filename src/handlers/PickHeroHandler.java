package handlers;

import commands.NumberCommand;
import components.Magician;
import components.Warrior;
import utils.ClearScreen;
import utils.Constants;
import utils.EnemySelection;
import utils.MagicianInitialState;
import utils.MyRandom;
import utils.MyScanner;
import utils.WarriorInitialState;

public class PickHeroHandler implements IBaseHandler {

	@Override
	public void handle() {
		ClearScreen.clear();
		int input = 0;
		do {
			System.out.println("Pick your hero: ");
			for (String menu : Constants.pickHeroMenuList) {
				System.out.println(menu);
			}
			System.out.print("Choose >> ");
			input = MyScanner.getInt();
			redirection(input);
		}while(input < 1 || input > Constants.pickHeroCommands.size());
	}
	
	@SuppressWarnings("deprecation")
	private void redirection(int input) {
		try {
			Class<?> command = Constants.pickHeroCommands.get(input);
			if(command != null) {
				((NumberCommand) command.newInstance()).execute();
				selectEnemyHero();
				new BattleSceneHandler().handle();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void selectEnemyHero() {
		int selectionHero = MyRandom.randomNumber(0, 2);
		EnemySelection.selectedHero = (selectionHero == 0) ? 
				new Warrior("Enemy", WarriorInitialState.MAX_HP, WarriorInitialState.MAX_HP, WarriorInitialState.MAX_ATK, WarriorInitialState.MAX_DEF) : 
					new Magician("Enemy", MagicianInitialState.MAX_HP, MagicianInitialState.MAX_HP, MagicianInitialState.MAX_ATK, MagicianInitialState.MAX_DEF);
	}

}
