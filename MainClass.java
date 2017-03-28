// Calculator
import java.util.Scanner;

public class MainClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner algore = new Scanner(System.in);
		Scanner dec = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = algore.nextDouble();
		System.out.println("Enter second num: ");
		snum = algore.nextDouble();
		System.out.println("Would you like to");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Square Root");
		System.out.println("6. Squared");
		int dec2 = dec.nextInt();
		switch(dec2) {
		case 1: 
			answer = fnum + snum;
			System.out.println(answer);
			break;
		case 2: 
			answer = fnum - snum;
			System.out.println(answer);
			break;
		case 3: 
			answer = fnum * snum;
			System.out.println(answer);
			break;
		case 4: 
			answer = fnum / snum;
			System.out.println(answer);
			break;
		case 5: 
			double sqrt1;
			double sqrt2;
			sqrt1 = Math.sqrt(fnum);
			sqrt2 = Math.sqrt(snum);
			System.out.println("First number's square root is "+ sqrt1);
			System.out.println("Second number's squared root is "+ sqrt2);
			break;
		case 6: 
			double sqr1;
			double sqr2;
			sqr1 = (fnum * fnum);
			sqr2 = (snum * snum);
			System.out.println("The first number squared is "+sqr1);
			System.out.println("The second number squared is "+sqr2);
			break;
		default: 
			System.out.println("That was not a choice remember 1 = add 2 =sub 3 = multiply 4 = divide");
			break;
		}
	}

}
