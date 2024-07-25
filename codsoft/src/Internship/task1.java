package Internship;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int StudentTotalMarks=0;              
		int []ar=new int[n];
		for(int i=0; i<ar.length; i++)
		{
			System.out.println("Enter marks for subject"+ i+1 +":");
			ar[i]=sc.nextInt();
			StudentTotalMarks=StudentTotalMarks+ar[i];
	}
		double AP=(double)StudentTotalMarks/n;//AP-average percentage
		String grade=calculGrade(AP);
		System.out.println("total marks:"+StudentTotalMarks);
		System.out.println("Average percentage:"+AP);
		System.out.println("Grade:"+grade);
	}

	public static String calculGrade(double P) {//p-percentage
		if(P>=90 && P<=100) {
			return "Distinction A+";
		}
		if(P>=80 && P<90) {
			return "Distinction A";
		}
		else if(P>=60 && P<80)
		{
			return "First class B";
		}
		else if(P>=40 && P<60) {
		return "Second class C";
	}
		 if(P<40) {
			return "fail F";
		}
		return null;
		
	}

}

