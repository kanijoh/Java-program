package pgm;

public class Armstrong {
	
		public static void main(String args[]) {
			int n=157;int rev=0;
			int t=n;
				while(n!=0)
				{
					int rem=n%10;
					 rev=rev+rem*rem*rem;
					n=n/10;
				}
				if(t==rev)
			{
				System.out.println("is armstrong");
			}
			else
				System.out.println("not a armstrong");
		}
	}


