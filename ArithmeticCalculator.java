package javaPractice;
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int firstnum=sc.nextInt();
		int secnum= sc.nextInt();
		System.out.println("Enter the Operator (+ , - , * , / )");
		char op=sc.next().charAt(0);
		double Ans=0;

		switch(op){
		case '+': Ans=firstnum+secnum;
		break;
		case '-':Ans=firstnum-secnum;
		break;
		case '*': Ans=firstnum*secnum;
		break;
		case '/':Ans=firstnum/secnum;
		break;
		}
		System.out.println("you entered "+op +" operator");
		System.out.println("The " + firstnum +" "+ op +" "+ secnum  + " is"+ " = "+ Ans);	}
       
	}
