package utils;

import java.util.Random;

public class MyRandom {
	public static Random randomInstance = new Random();
	
	public static int randomNumber(int min, int max) {
		return randomInstance.nextInt() % max + min;
	}
}
