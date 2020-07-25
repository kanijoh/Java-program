//simulate 
import java.util.Scanner;
class Stopwatch
{static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
System.out.println("press any button to start and enter");
sc.next();
stopwatchSimulator();
}
public static void stopwatchSimulator()
{
long startTime=System.currentTimeMillis();
System.out.println("press any button to stop and enter");
sc.next();
long stopTime=System.currentTimeMillis();
long time=stopTime-startTime;
System.out.println("total time required"+time+"milliseconds");
}
}