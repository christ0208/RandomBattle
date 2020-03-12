package components;

public class Warrior extends Hero {

	public Warrior(String name, int hp, int maxHP, int atkPoint, int defPoint) {
		super(name, hp, maxHP, atkPoint, defPoint);
	}
	
	@Override
	protected int criticalAttack() {
		// TODO Auto-generated method stub
		return this.atkPoint * 2;
	}
	
	@Override
	protected int normalAttack() {
		// TODO Auto-generated method stub
		return this.atkPoint + 5;
	}

}
