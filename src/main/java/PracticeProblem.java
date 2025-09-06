import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String input = s.nextLine();
		System.out.println(input);
		s.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int num1 = s.nextInt();
		System.out.print("In: ");
		int num2 = s.nextInt();
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		s.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String input = s.nextLine();
		System.out.println(input + " was the text you wrote");
		s.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int input = s.nextInt();
		System.out.println(input * 5);
		s.close();
		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		boolean input = s.nextBoolean();
		System.out.println(input + " is a boolean");
		s.close();
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		double input = s.nextDouble();
		System.out.println(input - 3.2);
		s.close();
		
	}

}
