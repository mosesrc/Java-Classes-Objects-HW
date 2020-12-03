package Calculator;

import java.lang.Math;

public class MagicCalculator extends Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Find the square root of a number
		
			int num = 100;
			int a;
			int b = divide(num, 2);
			
			do {
				a = b;
				b = (divide(add(a, (divide(num, a))), 2));
				
			} while ((subtract(a, b)) != 0);
			
			System.out.println("The SQUARE ROOT of " + num + " is: " + b);
			
//  Find the sin (trigonometry) of a number
// [Note: Feel free to use the MATH class]

			double x = 200;
			double y = 400;
			x = Math.toRadians(x);
			y = Math.toRadians(y);
			System.out.println("\nThe SIN(TRIG) of " + x + " is: " + Math.sin(x));
			System.out.println("The SIN(TRIG) of " + y + " is: " + Math.sin(y));
			
//  Find the cosine (trigonometry) of a number
//  [Note: Feel free to use the MATH class]
			
			double a1 = 200;
			double b1 = 400;
			a1 = Math.toRadians(a1);
			b1 = Math.toRadians(b1);
			System.out.println("\nThe COSINE(TRIG) of " + a1 + " is: " + Math.cos(a1));
			System.out.println("The COSINE(TRIG) of " + b1 + " is: " + Math.cos(b1));	
			
//  Find the tangent (trigonometry) of a number. 
//  [Note: Feel free to use the MATH class]
			
			double x1 = 200;
			double y1 = 400;
			x1 = Math.toRadians(x1);
			y1 = Math.toRadians(y1);
			System.out.println("\nThe TANGENT(TRIG) of " + x1 + " is: " + Math.tan(x1));
			System.out.println("The TANGENT(TRIG) of " + y1 + " is: " + Math.tan(y1));
			
//  Finds the factorial (!) of the number
			
			int facTorial = 1;
			int num1 = 7;
			
			for (int i = 1; i <= num1; i++) {
				facTorial = multiply(facTorial, i);
			}
			System.out.println("\nThe FACTORIAL of the number " + num1 
					           + " is: " + facTorial);
		}
		
}
