package handlers;

import commands.NumberCommand;
import utils.Constants;
import utils.MyScanner;

public class BattleSceneHandler implements IBaseHandler {

	@Override
	public void handle() {
		int input = 0;
		do {
			System.out.println("Pick your action: ");
			for (String menu : Constants.battleMenuList) {
				System.out.println(menu);
			}
			input = MyScanner.getInt();
			redirection(input);
		}while(input < 1 || input > Constants.battleCommands.size());
	}
	
	@SuppressWarnings("deprecation")
	private void redirection(int input) {
		try {
			Class<?> command = Constants.battleCommands.get(input);
			if(command != null) {
				((NumberCommand) command.newInstance()).execute();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
