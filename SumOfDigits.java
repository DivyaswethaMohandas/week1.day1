package week1.assignment1;

public class SumOfDigits {

	public static void main(String[] args) {
	int input=123;
	int temp, sum=0;
	 
	while(input>0)
	{
		temp=input%10;
		sum=temp+sum;
		input=input/10;
      }
System.out.println("Sum of the Digit is  " +sum);
	}

}
