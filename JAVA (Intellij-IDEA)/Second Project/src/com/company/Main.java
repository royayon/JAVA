package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number==>");
        int a = input.nextInt();
        System.out.println("Enter another Number==>");
        int b = input.nextInt();
        System.out.println("The Addition is==> "+(a+b));
    }
}
