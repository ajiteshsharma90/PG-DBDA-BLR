import java.util.Scanner;

public class Student 
{
   int sid;
   String name;
   float per;
   
   public void displayStudent()
   {
	   System.out.println(sid +" "+ name +" " + per);
	   
   }
   
   public void readStudentDetails()
   {
	  Scanner s = new Scanner(System.in);
	  sid = s.nextInt();
	  name = s.next();
	  per = s.nextFloat();
	   
   }
   
   public void findGrade()
   {
	   if(per>90)
		   System.out.println("A");
	   else if(per>70)
		   System.out.println("B");
	   else if(per>50)
		   System.out.println("c");
	   else
		   System.out.println("F");
	   
   }
   
   
   public static void main(String[] args) 
   {
	   Student s1 = new Student();
	   System.out.println("student 1 detals");
	   System.out.println("enter student details");
	   s1.readStudentDetails();
	   System.out.println("student 1 detals");
	   s1.displayStudent();
	   s1.findGrade();
	  
	   Student s2 = new Student();
	    System.out.println("student 2 detals");
	   s2.readStudentDetails();
	   s2.displayStudent();  
	   s2.findGrade();
	   Student s3 = new Student();
	   System.out.println("student 3 detals");
	    s3.readStudentDetails();
	    s3.displayStudent();
	    s3.findGrade();
   }
   
}
