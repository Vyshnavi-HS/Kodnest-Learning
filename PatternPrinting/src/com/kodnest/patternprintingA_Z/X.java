package com.kodnest.patternprintingA_Z;

import java.util.Scanner;

public class X {
	public static void main(String[] args) {	
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==j||i+j==10)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}


	}


}
