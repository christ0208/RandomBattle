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
	
	@Override
	protected int getDecreasingDamage() {
		// TODO Auto-generated method stub
		return super.getDecreasingDamage() - 2;
	}
	
	@Override
	public String getJob() {
		// TODO Auto-generated method stub
		return "Magician";
	}
}
