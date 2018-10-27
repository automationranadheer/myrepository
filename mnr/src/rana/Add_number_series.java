package rana;

import java.util.Scanner;

public class Add_number_series
{

	public static void main(String[] args) 
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int num=sc.nextInt();
	int res=0;
	for(int i=0; i<=num; i++)
	{
		res=res+i;
		
	}
	System.out.println(res);
	}

}

