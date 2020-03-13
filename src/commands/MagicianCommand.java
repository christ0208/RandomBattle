package commands;

import components.Magician;
import components.Warrior;
import utils.HeroSelection;
import utils.MagicianInitialState;

public class MagicianCommand extends PickHeroCommand {

	@Override
	public void execute() {
		String name = this.askName();
		HeroSelection.selectedHero = new Magician(name, MagicianInitialState.MAX_HP, MagicianInitialState.MAX_HP, MagicianInitialState.MAX_ATK, MagicianInitialState.MAX_DEF);
	}

}
