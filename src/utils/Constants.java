package utils;

import java.util.HashMap;

import commands.AttackCommand;
import commands.NumberCommand;

public class Constants {
	public static HashMap<Integer, Class<? extends NumberCommand>> battleCommands = new HashMap<>();
	
	static {
		battleCommands.put(1, AttackCommand.class);
	}
}
