import java.util.*;
class Grade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Input of marks in each subject
        System.out.println("Enter the marks of each subject out of 100 in order: Maths, Physics, Chemistry, English, Computer Science");
        int maths=sc.nextInt();//Mathematics marks
        int phy=sc.nextInt();//Physics marks
        int chem=sc.nextInt();//Chemistry marks
        int eng=sc.nextInt();//English marks
        int comp=sc.nextInt();//Computer Science marks

        //Total marks obtained by the student 
        int total=maths+phy+chem+eng+comp;

        //Calculating the average percentage
        double avg_per=total/5;

        //Finding appropriate grade as per the average percentage
        char grade;
        if(avg_per>=85 && avg_per<=100)
        grade='A';
        else if(avg_per>=70 && avg_per<85)
        grade='B';
        else if(avg_per>=50 && avg_per<70)
        grade='C';
        else if(avg_per>=40 && avg_per<50)
        grade='D';
        else
        grade='F';

        //Printing all the details
        System.out.println("Total marks obtained by the student = "+total);
        System.out.println("Average percentage of the student = "+avg_per);
        System.out.println("Grade obtained by the student = "+grade);
    }
}