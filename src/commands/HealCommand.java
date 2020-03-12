package commands;

import utils.HeroSelection;

public class HealCommand extends NumberCommand {

	@Override
	public void execute() {
		System.out.println(HeroSelection.selectedHero.getJob() + " heals");
		HeroSelection.selectedHero.heal();
	}

}
