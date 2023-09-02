package com.kodnest.patternprintingA_Z;

import java.util.Scanner;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					if(j==0||j==n||i==j)
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


