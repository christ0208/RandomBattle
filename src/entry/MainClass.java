package entry;

import handlers.MainMenuHandler;

public class MainClass {
	public MainClass() {
		new MainMenuHandler().handle();
	}
	
	public static void main(String[] args) {
		new MainClass();
	}
}
