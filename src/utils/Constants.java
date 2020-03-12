package utils;

import java.util.ArrayList;
import java.util.HashMap;

import commands.AttackCommand;
import commands.MagicianCommand;
import commands.NumberCommand;
import commands.WarriorCommand;

public class Constants {
	public static ArrayList<String> pickHeroMenuList = new ArrayList<>();
	public static ArrayList<String> battleMenuList = new ArrayList<>();
	public static HashMap<Integer, Class<? extends NumberCommand>> pickHeroCommands = new HashMap<>();
	public static HashMap<Integer, Class<? extends NumberCommand>> battleCommands = new HashMap<>();
	
	static {
		pickHeroMenuList.add("1. Warrior");
		pickHeroMenuList.add("2. Magician");
		
		battleMenuList.add("1. Attack");
		battleMenuList.add("2. Heal");
		battleMenuList.add("3. Exit");
		
		pickHeroCommands.put(1, WarriorCommand.class);
		pickHeroCommands.put(2, MagicianCommand.class);
		
		battleCommands.put(1, AttackCommand.class);
		battleCommands.put(2, AttackCommand.class);
	}
}
