import java.util.Scanner;

class Task
{
	public static void main(String [] args)
	{
		String [] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
		int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String input;
		Scanner sc = new Scanner(System.in);
		//For console------
		System.out.println("Please provide the name of the month: ");
		input = sc.next();
		
		//For scanner------
		//input = args[0];
		
		for (int i = 0; i<12; i++)
		{
			if (input.equals(months[i]))
			{
				System.out.println(input + " has " + days[i] + " days.");
				return;
			}
			
		}
		System.out.println( input + " is not a correct month name.");
		
	}
}