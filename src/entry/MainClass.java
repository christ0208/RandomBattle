package entry;

import handlers.PickHeroHandler;

public class MainClass {
	public MainClass() {
		new PickHeroHandler().handle();
	}
	
	public static void main(String[] args) {
		new MainClass();
	}
}
