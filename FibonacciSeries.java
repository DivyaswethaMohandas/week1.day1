package week1.assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int input=6;
		int firstNum=0,secondNum=1,thirdNum;
		System.out.println(firstNum);
		System.out.println(secondNum);
		
	  for(int i=1;i<=input;i++) {
		  
			thirdNum=firstNum+secondNum;
			System.out.println(thirdNum);
			firstNum=secondNum;
			secondNum=thirdNum;
			
			
			
	  }
		
	}

}
