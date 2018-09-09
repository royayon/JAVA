import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//Array input
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Length of the Array is: " + array.length);
		
		for(int i = 0; i<n; i++)
			array[i] = sc.nextInt();
		
		System.out.println("Array is : ");
		for(int i = 0; i<n; i++)
			System.out.print(array[i] + " ");
		*/
		
		// For each
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Length of the Array is: " + array.length);
		
		for(int i = 0; i<n; i++)
			array[i] = sc.nextInt();
		
		System.out.println("Array is : ");
		for(int val : array)
			System.out.print(val + " ");
		*/
		
		//2D Array
		
		int array2D[][] = { {1,2,4}, {2,3,4}, {3,2,1} };
		
		/*for(int row = 0; row<array2D.length; row++)
		{
			for(int col = 0; col<array2D[0].length; col++)
			{
				System.out.print(array2D[row][col] + " ");
			}
			System.out.println();
		}
		*/
		
		// for-each loop
		/*for(int row[] : array2D)
		{
			for(int val : row)
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}
		*/
		
		
		
		
		
		

	}

}
