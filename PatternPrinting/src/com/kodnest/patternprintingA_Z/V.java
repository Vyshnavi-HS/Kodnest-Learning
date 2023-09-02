package com.kodnest.patternprintingA_Z;

import java.util.Scanner;

public class V {
	public static void main(String[] args) {	
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==j&&j<=n/2||i+j==n&&j>=n/2)
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
