import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scan=new Scanner(System.in);
		        
		        System.out.println("Student Grade Calculator");
		        
		        System.out.println("Enter the total Number of subjects: "); 
		        int totalsubject=scan.nextInt();
		        int marks[]=new int[totalsubject];
		        
		        
		        for(int i=0;i<marks.length;i++){
		        
		            System.out.print("Enter subject "+(i+1)+" mark ");
		            marks[i]=scan.nextInt();
		        
		        }
		        
		        
		        int totalmarks=0;
		        float averagemark=0;
		       
		        for(int i=0;i<marks.length;i++)
		        {
		        
		            totalmarks=totalmarks+marks[i];
		        
		        }
		        
		        averagemark=totalmarks/totalsubject;   
		        System.out.println("Total Marks "+totalmarks);
		        System.out.println("Average Mark "+averagemark);
		        
		        if(averagemark>=90)
		        {
		        
		            System.out.println("And your grade is: O");
		        
		        }
		        else if(averagemark>=80)
		            System.out.println("And your grade is: A+");
		        else if(averagemark>=70)	        
		            System.out.println("And your grade is: A");

		        else if(averagemark>=60)
		            System.out.println("And your grade is: B+");

		        else if(averagemark>=50)
		            System.out.println("And your grade is: B");

		        else if(averagemark>=40)
		            System.out.println("And your grade is: C+");

		        else if(averagemark>=30)	        
		            System.out.println("And your grade is: C");
		        else
		            System.out.println("Fail");
		        
		        }
	}
		    
		
	


