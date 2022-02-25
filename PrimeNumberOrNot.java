package week1.assignment1;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int n=13;		
		boolean f1=false;
		
			for(int i=2;i<=n;i++) {
				if(n%i==0) {	
					f1=true;
					
				}
				 if(f1==false) {		 
						System.out.println(" Given input is a PrimeNumber input =    " +n);
						break;
						}
					 else {
						 System.out.println(" Given input is not a PrimeNumber input =    " +n);
				 break;
			}
		
			}
			}	
	
	}


