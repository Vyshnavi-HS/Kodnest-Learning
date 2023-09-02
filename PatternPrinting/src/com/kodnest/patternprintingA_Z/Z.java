package com.kodnest.patternprintingA_Z;

import java.util.Scanner;

public class Z {
	public static void main(String[] args) {	
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j+i==n||i==0||i==n)
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
