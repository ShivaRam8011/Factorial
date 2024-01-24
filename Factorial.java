package com.whileloop;

public class Factorial {
	public static void main(String args[])
	{
		int num=7,var=1;
		while(num>=1)
		{
			var=var*num;
			num--;
		}
		System.out.println(var);
	}

}

