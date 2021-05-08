package com;
import java.util.Scanner;

public class LineCompare {
	
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        //Getting values from user
	        System.out.println("Enter the first co-ordinate of x");
	        int x1 = sc.nextInt();
	        System.out.println("Enter the first co-ordinate of y");
	        int y1 = sc.nextInt();
	        System.out.println("Enter the second co-ordinate of x");
	        int x2 = sc.nextInt();
	        System.out.println("Enter the second co-ordinate of y");
	        int y2 = sc.nextInt();
	        //equation to get solved
	        double line_length = Math.sqrt((Math.pow((x2 - x1) , 2 )+Math.pow((y2 - y1) , 2 )));
	        //Printing the length of line
	        System.out.println("The length of line is" +line_length);
	    }
	}


