package commands;

import utils.EnemySelection;
import utils.HeroSelection;

public class AttackCommand extends NumberCommand {

	@Override
	public void execute() {
		System.out.println(HeroSelection.selectedHero.getJob() + " attacks");
		int damage = HeroSelection.selectedHero.attack();
		EnemySelection.selectedHero.receiveDamage(damage);
	}

}
