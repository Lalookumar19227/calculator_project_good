package calculator_project;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		char prevop='+';
		char currop;
		System.out.print("ENter the 1st Number: ");
		int a=sc.nextInt();
		sum=sum+a;
		System.out.print("ENter the Operator: ");
		currop=sc.next().charAt(0);
		do {
			System.out.print("ENter the Next Number: ");
			int b=sc.nextInt();
			switch(currop)
			{
				case '+':
					sum=sum+b;
					break;
				case '-':
					sum=sum-b;
					break;
				case '*':
					if(prevop=='+') {
					sum=sum-a;
					sum=sum+a*b;
					}
					else if(prevop=='-') {
						sum=sum+a;
						sum=sum-a*b;
					}
					break;
				case '/':
					if(prevop=='+') {
						sum=sum-a;
						sum=sum+a/b;
						}
						else if(prevop=='-') {
							sum=sum+a;
							sum=sum-a/b;
						}
					break;
			}
			a=b;
			prevop=currop;
		System.out.print("Enter the Operator: ");
		currop=sc.next().charAt(0);
		}while(currop!='=');
		System.out.println("\nTotal Result is: "+sum);
			
	}

}
	
	
	
	
	
	
