/*
print numbers upto 50 with following condions:
multiples of 4 print Fizz
multiples of 5 print Buzz
both multiples of 4 & 5 print FizzBuzz
remaining print numbers*/

public class FizzBuzz
{
public static void main(String args[])
{
	for(int i=1;i<=50;i++)
	{
	if(i%4==0)
	{
	if(i%5==0)
	      System.out.println("FizzBuzz");
	else
	      System.out.println("Fizz");
	}
	else if(i%5==0)
	{
	System.out.println("Buzz");
	}
	else
	{
	System.out.println(i);
	}
	}
	}
	}
