package com.kodnest.patternprinting2;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0||i==n||i==n/2)
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
