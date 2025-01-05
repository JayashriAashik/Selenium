package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=7,a=0,b=1,c;
		System.out.println("Fibonacci series:");
		System.out.println("================");
		System.out.println(a); 
		System.out.println(b); 
		for (int j=2;j<range;++j) {
			c=a+b;
			//int c=b+j;
		    System.out.println(c);
		    a=b;
		    b=c;
		    }
	    
	}	
}
