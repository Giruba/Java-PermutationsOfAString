package Application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Permutations of a String");
		System.out.println("------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the string whose permuations are to be printed");
			String inputString = scanner.nextLine();
			PrintPermuationsOfString(inputString);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
	
	private static void PrintPermuationsOfString(String inputString) {
		_PrintPermuationsOfString(0, inputString.length()-1, inputString.toCharArray());		
	}
	
	private static void _PrintPermuationsOfString(int lowIndex, int highIndex, char[] charArray){
		if(lowIndex == highIndex) {
			System.out.println(new String(charArray));
		}else {
			for(int index = lowIndex ; index <= highIndex; index++) {
				char temp = charArray[index];
				charArray[index] = charArray[lowIndex];
				charArray[lowIndex] = temp;
				_PrintPermuationsOfString(lowIndex+1, highIndex, charArray);
				temp = charArray[index];
				charArray[index] = charArray[lowIndex];
				charArray[lowIndex] = temp;
			}
		}
	}
}
