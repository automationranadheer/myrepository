package rana;

import java.util.Scanner;

public class Array_sorting 
{

	public static void main(String[] args)
	{
	  int x[]=new int[6];
	  Scanner sc=new Scanner(System.in);
	  for(int i=0; i<6; i++)
	  {
		  System.out.println("enter a number");
		  x[i]=sc.nextInt();
	  }
	  // do sorting
	  for(int i=0; i<5; i++)
	  {
		  for(int j=0; j<5; j++)
		  {
			  if(x[j]>x[j+1])
			  {
				 int temp=x[j];
				 x[j]=x[j+1];
				 x[j+1]=temp;
			  }
		  }
	  }
	  for (int i=0; i<6; i++)
	  {
		  System.out.println(x[i]+ " ");
	}
	}

}
