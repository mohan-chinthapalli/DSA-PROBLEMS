import java.util.Scanner;
public class StudentPer 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Name of the Student: ");
    String name = sc.nextLine();

    System.out.print("Enter the Marks: ");
    int marks = sc.nextInt();

    System.out.println("Student Name: "+ name);
    if(marks!=0){

    if (marks>=90) 
    {
        System.out.println("Grade A+");
    }
    else if(marks>=80 && marks<=89)
    {
        System.out.println("Grade A");
    }
    else if (marks>=70 && marks<=79) 
    {
        System.out.println("Grade B");
    }
    else if (marks>=60 && marks<=69) 
    {
        System.out.println("Grade C");
    }
    else if (marks>=50 && marks<=59) 
    {
        System.out.println("Grade D");
    }
    else if (marks>=31 && marks<=49) {
        System.out.println("Pass");
    }
    else
    {
        System.out.println("Fail");
    }
  }

  else{
    System.out.println("Enter Valid marks");
  }

}
}
