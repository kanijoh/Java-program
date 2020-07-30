import java.util.Scanner;
class LinearSearch
{
   public static void main(String args[])
   {
      int counter,num,item,array[];
      
      Scanner input= new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num= input.nextInt();
      array= new int[num]; 
      System.out.println("Enter " + num + " integers");
      for(counter = 0; counter < num; counter++)
        array[i] = input.nextInt();
      System.out.println("Enter the value to be searched:");
      item= input.nextInt();
      for(i= 0;i< num;i++)
      {
         if(array[i] == item) 
         {
           System.out.println(item+" is present at location "+(i+1));
           break;
         }
      }
      if(i==num)
        System.out.println(item +" doesn't exist in the given array.");
   }
}
