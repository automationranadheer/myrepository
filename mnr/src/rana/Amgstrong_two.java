package rana;


public class Amgstrong_two
{

	public static void main(String[] args) 
	{
	
		for (int i = 100;i<=1000;i++) {
			int number = i, sum=0,remainder;
			while(number > 0) {
				remainder = number % 10;
				sum = sum+remainder * remainder * remainder;
				number = number /10;
				
			}
			if (i == sum) {
				System.out.println("given number is armstrong ----"+i + "==" + sum);
			}
					
		}
	}

}
