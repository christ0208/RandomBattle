package commands;

import components.Warrior;
import utils.HeroSelection;
import utils.WarriorInitialState;

public class WarriorCommand extends PickHeroCommand {

	@Override
	public void execute() {
		String name = this.askName();
		HeroSelection.selectedHero = new Warrior(name, WarriorInitialState.MAX_HP, WarriorInitialState.MAX_HP, WarriorInitialState.MAX_ATK, WarriorInitialState.MAX_DEF);
	}

}
