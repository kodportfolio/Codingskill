package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine();
	        scanner.close();

	        int result = romanToInteger(romanNumeral);
	        System.out.println("The integer value of " + romanNumeral + " is " + result);
	    }

	    public static int romanToInteger(String s) {
	        Map<Character, Integer> romanValues = new HashMap<>();
	        romanValues.put('I', 1);
	        romanValues.put('V', 5);
	        romanValues.put('X', 10);
	        romanValues.put('L', 50);
	        romanValues.put('C', 100);
	        romanValues.put('D', 500);
	        romanValues.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            int value = romanValues.get(s.charAt(i));

	            if (value < prevValue) {
	                result -= value;
	            } else {
	                result += value;
	            }

	            prevValue = value;
	        }

	        return result;
	    }
	

	}


