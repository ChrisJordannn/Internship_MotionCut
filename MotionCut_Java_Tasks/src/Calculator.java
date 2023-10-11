import java.util.Scanner;
public class Calculator {
	Scanner s = new Scanner (System.in);
	void addition() {
		System.out.println("enter any 2 numbers to add");
		float a = s.nextFloat();
		float b = s.nextFloat();
		System.out.println("------------------------------");
		System.out.println("The sum is:\t"+(a+b));
		System.out.println("------------------------------");
	}
	void subtraction() {
		System.out.println("enter any 2 numbers to subtract");
		float a = s.nextFloat();
		float b = s.nextFloat();
		System.out.println("------------------------------");
		System.out.println("The sum is:\t"+(a-b));
		System.out.println("------------------------------");
	}
	void multiplication() {
		System.out.println("enter any 2 numbers to multiply");
		float a = s.nextFloat();
		float b = s.nextFloat();
		System.out.println("------------------------------");
		System.out.println("The sum is:\t"+(a*b));
		System.out.println("------------------------------");  	
	}
	void division() {
		System.out.println("enter any 2 numbers to divide");
		float a = s.nextFloat();
		float b = s.nextFloat();
		System.out.println("------------------------------");
		System.out.println("The sum is:\t"+(a/b));
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String c;
		Calculator obj = new Calculator();
		do {
			System.out.println("*************************");
			System.out.println("        CALCULATOR       ");
			System.out.println("*************************");
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
			System.out.println("Enter the operation to perform");
			int n = s.nextInt();
			switch(n){
				case 1:{
					obj.addition();
					break;
				}
				case 2:{
					obj.subtraction();
					break;
				}
				case 3:{
					obj.multiplication();
					break;
				}
				case 4:{
					obj.division();
					break;
				}
			}
			System.out.println("Do you want to continue?");
			System.out.println("Enter 'Y' or 'N'");
			c = s.next();
			if(c.equals("N") || c.equals("n")) {
				System.exit(1);
			}
		}while(c.equals("Y") || c.equals("y"));
	}

}
