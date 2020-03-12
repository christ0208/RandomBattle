package components;

public class Magician extends Hero {

	public Magician(String name, int hp, int maxHP, int atkPoint, int defPoint) {
		super(name, hp, maxHP, atkPoint, defPoint);
	}

	@Override
	protected int normalAttack() {
		// TODO Auto-generated method stub
		return super.normalAttack() / 2;
	}
}
