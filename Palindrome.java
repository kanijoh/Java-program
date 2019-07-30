package pgm;

public class Palindrome {
	public static void main(String args[]) {
		int n=103;int rev=0;
	int t=n;
		while(n!=0)
		{
			int rem=n%10;
			 rev=rev*10+rem;
			n=n/10;
		}
		if(t==rev)
		{
			System.out.println("is palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
}


