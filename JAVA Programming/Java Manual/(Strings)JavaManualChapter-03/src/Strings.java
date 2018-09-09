import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// String INPUT
		/*String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		
		System.out.println("Hello " + name + ", Nice to meet you!");
		*/
		
		// String Equal Comparison
		/*String input;
		String password = "secret";
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLine();
		if(input == password) {
			System.out.println("Correct Password!");
		}else {
			System.out.println("Incorrect Password!");
		}
		*/
		
		/*String input;
		String password = "secret";
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLine();
		if(input.equals(password)) {
			System.out.println("Correct Password!");
		}else {
			System.out.println("Incorrect Password!");
		}*/
		
		
		
		/*Scanner sc = new Scanner(System.in);
		String sentence;
		sentence = sc.nextLine();
		
		System.out.println("Length: " + sentence.length());
		System.out.println("Substring(4,9): " + sentence.substring(4, 9));
		System.out.println("StartsWith 'The' : " + sentence.startsWith("The"));
		System.out.println("EndsWith 'fox' : " + sentence.endsWith("fox"));
		System.out.println("ToUpperCase : " + sentence.toUpperCase());
		System.out.println("The position of the 'fox' is " + sentence.indexOf("fox"));
		System.out.println("Sentence contains 'The': " + sentence.contains("THE"));
		sentence = sentence.replace("THE" , "The");
		System.out.println("Sentence contains 'The': " + sentence.contains("The"));
		*/
		
		// Use of split()
		/*String daysOfWeeks = "Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday";
		String weekDays[] = daysOfWeeks.split(","); // ' , ' is the delimiter
		
		for(String day : weekDays) {
			System.out.println(day);
		}
		*/
		
		/*String sentence = "The Quick Brown Fox";
		String words[] = sentence.split(" "); // ' ' (space) is the delimiter
		
		for(String word : words) {
			System.out.println(word);
		}
		*/
		
		// String TypeCasting
		
		/*String s1 = "10";
		String s2 = "2.5";
		
		System.out.println(s1 + "5");   //concat
		System.out.println(s2 + "1.2"); //concat
		
		int a = Integer.valueOf(s1);
		double b = Double.valueOf(s2);
		System.out.println(a + 5);  // TypeCasting
		System.out.println(b+ 1.2);  // TypeCasting
		*/
			
		
	}

}
