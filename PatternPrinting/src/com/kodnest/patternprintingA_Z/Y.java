package com.kodnest.patternprintingA_Z;

import java.util.Scanner;

public class Y {
	public static void main(String[] args) {	
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i>=n/2&&j==n/2||i==j&&j<=n/2||j+i==n&&i<=n/2)
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
