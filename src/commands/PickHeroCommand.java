package commands;

import utils.MyScanner;

public abstract class PickHeroCommand extends NumberCommand {

	protected String askName() {
		String input = "";
		do {
			System.out.print("Input your name [must not be empty]: ");
			input = MyScanner.getString();
		}while(input.length() == 0);
		return input;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

}
