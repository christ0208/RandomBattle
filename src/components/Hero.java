package components;

import utils.MyRandom;

public abstract class Hero {
	private String name;
	protected int hp;
	protected int maxHP;
	protected int atkPoint;
	protected int defPoint;
	
	public Hero(String name, int hp, int maxHP, int atkPoint, int defPoint) {
		super();
		this.name = name;
		this.hp = hp;
		this.maxHP = maxHP;
		this.atkPoint = atkPoint;
		this.defPoint = defPoint;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getAtkPoint() {
		return atkPoint;
	}
	public void setAtkPoint(int atkPoint) {
		this.atkPoint = atkPoint;
	}
	public int getDefPoint() {
		return defPoint;
	}
	public void setDefPoint(int defPoint) {
		this.defPoint = defPoint;
	}
	
	protected boolean criticalChance() {
		// misalkan chance nya adalah 6%
		int randomResult = MyRandom.randomNumber(0, 100);
		
		if(randomResult < 6) 
			return true;
		
		return false;
	}
	
	protected int criticalAttack() {
		return this.atkPoint * 3 / 2;
	}
	
	protected int normalAttack() {
		return this.atkPoint;
	}
	
	public int attack() {
		return (this.criticalChance()) ? this.criticalAttack() : this.normalAttack();
	}
	
	protected int getDecreasingDamage() {
		return MyRandom.randomNumber(1, defPoint);
	}
	
	public String getJob() {
		return "Hero";
	}
	
	public void receiveDamage(int damage) {
		int netDamage = damage - this.getDecreasingDamage();
		this.hp -= netDamage;
		System.out.println(this.getJob() + " takes " + netDamage + " damage");
	}
	
	public void heal() {
		int healHp =  this.maxHP * 5 / 100;
		System.out.println(this.getJob() + " heal his/her HP by " + healHp);
		this.hp += healHp;
		if(this.hp > this.maxHP)
			this.hp = this.maxHP;
	}
	
	public boolean isDead() {
		return this.hp <= 0;
	}
	
	public void getStatus() {
		System.out.println("Job: " + this.getJob());
		System.out.println("HP: " + this.hp + "/" + this.maxHP);
	}
	
}
