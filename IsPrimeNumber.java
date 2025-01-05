package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n=3,flag=0,m=0;
		m=n/2;
		if(n==0||n==1)
		{
			System.err.println(n+" not prime number");
		}
		else
		{
			for(int i=2;i<=m;i++) {
				if(n%2==0)
				{
				System.out.println(n+" is not a prime number");
				flag=1;
				break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println(n+" is a prime number");
		}
		
	}

}
