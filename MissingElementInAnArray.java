package week1.assignment1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		//int a[]= {5,2,3,4,7,6,8};
		int a[]= {1,2,3,4,7,6,8};
		Arrays.sort(a);	
		int N=a[0];
	
		
		for (int i=0;i<a.length;i++) {
		
			if(a[i]!=i+N) {
				System.out.println(a[i]-1);
	break;
		}
			
		}		 
        	 }
        	
		
	}
	




