package week1.assignment1;

public class Calculator {
	

	public int add1(int num1, int num2 , int num3) {
		System.out.println(num1+num2+num3);
		return num1+num2+num3;
		}
	
	public int sub1 (int num1, int num2) {
		System.out.println(num1-num2);
		return num1-num2;
		}
	
	public double multiply1(double num1, double num2) {
		System.out.println(num1*num2);
		return num1*num2;
		}
	
	
public float div1(float num1, float num2 ) {
	System.out.println(num1/num2);
		return num1/num2 ;
		}
	
	
	
		
	public static void main(String[] args) {
		Calculator obj1=new Calculator();
		obj1.add1(5,5,5);
		obj1.sub1(10,5);
		obj1.multiply1(10,5);
		obj1.div1(10,5);
	}

}
