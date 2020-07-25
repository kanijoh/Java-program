class ThreeNum
{
	public static void main(String args[])
	{
		int ar[]={1,2,4,-3,-1,5,6};

for(int i=0;i<ar.length;i++)
{
for(int j=i+1;j<ar.length;j++)
{
for(int k=j+1;k<ar.length;k++)
{
if(ar[i]+ar[j]+ar[k]==0)
{
System.out.println("numbers found"+ar[i]+","+ar[j]+"and"+ar[k]);
}
}
	}}}
}
