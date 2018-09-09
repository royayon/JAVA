
import java.util.Scanner;
public class Eva02 {
    public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		String months[] = new String();
        months[] = {"a","january","february","march","april","may","june","july","august","sep","oct","nov","dec"};
		
		if(month.equals(months[1]) ||month.equals( months[3])  ||month.equals( months[5])  ||month.equals( months[7])  ||month.equals( months[8])  ||month.equals( months[10])  ||month.equals( months[12])  )
			System.out.println(month + " has 31 days.");
		else if(month.equals( months[4])  ||month.equals( months[6])  ||month.equals( months[9])  ||month.equals( months[11])  )
			System.out.println(month + " has 30 days.");
		else if(month.equals( months[2]) )
			System.out.println(month + " has 28 days.");
		else
			System.out.println("Input is Incorrext!");*/
		
		String month = args[0];
		String months[] = {"a","january","february","march","april","may","june","july","august","september","october","november","december"};
		if(month.equals(months[1])||month.equals("march")||month.equals("may")||month.equals("july")||month.equals("august")||month.equals("october")||month.equals("december"))
			System.out.println(month + " has 31 days.");
		else if(month.equals("april")||month.equals("june")||month.equals("september")||month.equals("november"))
			System.out.println(month + " has 30 days.");
		else if(month.equals("february"))
			System.out.println(month + " has 28 days.");
		else
			System.out.println("Input is Incorrext!");
		
		
    }
    
}