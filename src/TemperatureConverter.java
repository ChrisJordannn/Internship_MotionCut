import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String[] args) {
		double temp;
		String choice;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("------------------------------------------");
			System.out.println("          TEMPERATURE CONVERTER           ");
			System.out.println("------------------------------------------");
			System.out.println("Enter the temperature (only the number) to be converted");
			while(true) {
				if(s.hasNextDouble()) {
					temp = s.nextDouble();
					break;
				}
				else {
					System.out.println("Invalid input, please try again");
				}
			}
			System.out.println("Press 'C' to convert to Celsius and 'F' to convert to Fraenheit");
			String c = s.next();
			if(c.equals("C") || c.equals("c")){
				CelsiusConverter(temp);
			}
			else if (c.equals("F") || c.equals("f")) {
				FarenheitConverter(temp);
			}
			else {
				System.out.println("Invalid input, please enter either 'C' or F'");
			}
			System.out.println("Do you wish to continue");
			choice = s.nextLine();
		}while(choice.equals("Y")|| choice.equals("y"));
		// TODO Auto-generated method stub
	}
	static void CelsiusConverter(double a) {
		double b = (a * (9/5)+32);
		System.out.println(b+" C");
	}
	static void FarenheitConverter(double a) {
		double b = ((a - 32) * 5/9);
		System.out.println(b+" F");
	}

}
