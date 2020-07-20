public class CalculateStudentGrades {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter average of your marks (less than 100)::");
      int average = sc.nextInt();
      char grade;

      if(average>=80){
         grade = 'A';
      }else if(average>=60 && average<80){
         grade = 'B';
      }
      else if(average>=40 && average<60){
         grade = 'C';
      }
      else {
         grade = 'D';
      }

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
         System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}
