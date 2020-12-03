package Calculator;

public class Calculator {
	
// ADDING METHODS TO CUSTOM CLASS
	
	public static int add(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
		// System.out.println("The SUM of these numbers are: " + num3);
	 }
	
	public static int subtract(int num1, int num2) {
		int num3 = num1 - num2;
		return num3;
		// System.out.println("The DIFFERENCE of these numbers are: " + num3);
	}
	
	public static int multiply(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
		// System.out.println("The PRODUCT of these numbers are: " + num3);
	}

	public static int divide(int num1, int num2) {
		int num3 = num1 / num2;
		return num3;
		// System.out.println("The QUOTIENT of these numbers are: " + num3);
	}
	
	public static void square(int num1, int num2) {
		int answ1 = (int)Math.pow(num1, num2);
		System.out.println("The POWER of these numbers are: " + answ1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  }
}
	
	
