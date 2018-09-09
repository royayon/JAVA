import java.util.Scanner;

public class LabWork
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		/*while(true)
		{
			int a = input.nextInt();
					//int b =input.nextInt();
			if(a%2 != 0)
				System.out.println("The number is Odd");
			//else if(a<0) 
				//System.out.println("The number is negative");
			else 
				System.out.println("The number is even");
		}
		
				//int sum = a+b;
				//System.out.println("The sum is: "+sum);*/
				
		
		
		/*//int [] list_of_number = new int[10];
		int [] list_num = {1,2,3,4,5,7};
		System.out.println("Size of Array is " + list_num.length);*/
		
		
		/*int [] list_num = {1,2,3,4,5,7,-1,0,-2,-4};
		
		int largest=list_num[0];
		int largest2=list_num[0];
		int sum = 0;
		
		for(int i=0;i<list_num.length;i++)
		{
			if(largest<list_num[i])
			{
				largest2=largest;
				largest=list_num[i];
			}
			sum = sum+list_num[i];
		}
		
		System.out.println("Largest = " + largest + "\nSecond Largest = " + largest2);
		System.out.println("Avg is : " + sum/list_num.length); */
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		System.out.println(name);
		
		String name1 = sc.nextLine();
		
		System.out.println(name1);*/
		
		
		
		/*String pass = "mist";
		String inp = sc.next();
		if(inp == pass)
			System.out.println("Correct Pass");
		else
			System.out.println("InCorrect Pass");*/
		
		
		/*String pass = "mist";
		String inp = sc.next();
		if(inp.equals(pass))
			System.out.println("Correct Pass");
		else
			System.out.println("InCorrect Pass");*/
		
		
		String list_names[] = {"Ayon","Tasfik"};
		for(String name : list_names)
		{
			System.out.println(name);
		}
		
	}
}