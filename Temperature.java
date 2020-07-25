// convert temperature from farenheit to celcius
import java.util.Scanner;
class Temperature
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of temperature:");
double temp=sc.nextDouble();
double temperature=((temp-32)*5/9);
System.out.println("conversion of temperature is "+temperature);
}
}